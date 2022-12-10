package com.kryak.network.api

import com.kryak.network.dto.chapter.ChapterResponse
import com.kryak.network.dto.chapterList.ChapterList
import com.kryak.network.dto.cover.CoverResponse
import com.kryak.network.dto.manga.MangaListResponse
import com.kryak.network.dto.manga.MangaResponse
import com.kryak.network.dto.user.account.AccountEmailBody
import com.kryak.network.dto.user.account.UsernameCheck
import com.kryak.network.dto.user.auth.JsonTokenBody
import com.kryak.network.dto.user.auth.SignInBody
import com.kryak.network.dto.user.auth.SignInResponse
import retrofit2.http.*

interface MangaDexApi {

    // manga list
    @GET("manga")
    suspend fun getMangaList(@Query("offset") offset: Int, @Query("translatedLanguage[]") translatedLanguage: String = "en"): MangaListResponse

    @GET("manga/{id}")
    suspend fun getMangaById(@Path("id") id: String): MangaResponse

    @GET("manga/{id}/aggregate")
    suspend fun getMangaChaptersList(@Path("id") mangaId: String, @Query("translatedLanguage[]") translatedLanguage: String = "en"): ChapterList

    @GET("/at-home/server/{chapterId}")
    suspend fun getChapterById(@Path("chapterId") chapterId: String): ChapterResponse

    @GET("/cover/{uuid}")
    suspend fun getCoverByUuid(@Path("uuid") uuid: String): CoverResponse

    // login
    @Headers("Content-Type:application/json")
    @POST("/auth/login")
    suspend fun postSignIn(@Body signInData: SignInBody): SignInResponse

    @GET("/auth/check")
    suspend fun checkToken()

    @POST("/auth/logout")
    suspend fun logout()

    @POST("/auth/refresh")
    suspend fun refreshToken(@Body token: JsonTokenBody)

    // account
    @GET("/account/available")
    suspend fun getIsUsernameAvailable(@Query("username") username: String): UsernameCheck

    @Headers("Content-Type:application/json")
    @POST("/account/create")
    suspend fun postSignUp(@Body signUpBody: SignInBody)

    @POST("/account/activate/{code}")
    suspend fun postAccountActivate(@Path("code") code: String)

    @Headers("Content-Type:application/json")
    @POST("account/activate/resend")
    suspend fun postAccountResend(@Body email: AccountEmailBody)

    @Headers("Content-Type:application/json")
    @POST("/account/recover")
    suspend fun postAccountRecover(@Body email: AccountEmailBody)

    @POST("/account/recover/{code}")
    suspend fun postAccountRecoverCode(@Path("code") code: String)
}
