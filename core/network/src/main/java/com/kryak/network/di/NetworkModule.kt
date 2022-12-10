package com.kryak.network.di

import com.kryak.network.api.MangaDexApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Provides
    @Singleton
    fun providesOkHttpClient(): OkHttpClient =
        OkHttpClient.Builder()
            // .dispatcher()
            .build()

    @Provides
    @Singleton
    fun providesRetrofitBuilder(okHttpClient: OkHttpClient): Retrofit.Builder =
        Retrofit.Builder()
            .client(okHttpClient)
            .baseUrl("https://api.mangadex.org")
            .addConverterFactory(MoshiConverterFactory.create())

    @Provides
    @Singleton
    fun providesApi(retrofit: Retrofit.Builder): MangaDexApi = retrofit.build().create(MangaDexApi::class.java)
}
