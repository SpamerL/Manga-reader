package com.kryak.network.dto.user.account

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class UsernameCheck(
    val available: Boolean
)
