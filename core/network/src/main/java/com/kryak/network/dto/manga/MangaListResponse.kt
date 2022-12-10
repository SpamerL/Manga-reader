package com.kryak.network.dto.manga

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MangaListResponse(
    val result: String = "",
    val response: String = "",
    val data: List<MangaResponse> = listOf(),
    val limit: Int = 0,
    val offset: Int = 0,
    val total: Int = 0
)
