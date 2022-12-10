package com.kryak.network.dto.chapter

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ChapterResponse(
    val result: String = "",
    val baseUrl: String = "",
    val chapter: Chapter = Chapter()
)
