package com.kryak.network.dto.chapterList

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Chapters(
    @Json(name = "chapter")
    val chapter: String,
    @Json(name = "id")
    val id: String,
    @Json(name = "others")
    val others: List<String>?,
    @Json(name = "count")
    val count: Int
)
