package com.kryak.network.dto.user.auth

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class SignInBody(
    val userName: String,
    val email: String,
    val password: String
)
