package com.kryak.network.dto.user.auth

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class JsonTokenBody(
    val token: String
)
