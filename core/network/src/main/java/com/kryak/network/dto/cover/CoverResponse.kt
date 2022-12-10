package com.kryak.network.dto.cover

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CoverResponse(
    val result: String = "",
    val response: String = "",
    val `data`: Data = Data()
)
