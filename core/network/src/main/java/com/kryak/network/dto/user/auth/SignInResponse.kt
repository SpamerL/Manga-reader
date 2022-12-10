package com.kryak.network.dto.user.auth

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class SignInResponse(
    val result: String,
    val token: Token
)

data class Token(
    val session: String,
    val refresh: String
)
