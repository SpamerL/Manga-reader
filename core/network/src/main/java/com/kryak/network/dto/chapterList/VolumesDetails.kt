package com.kryak.network.dto.chapterList

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class VolumesDetails(
    @Json(name = "volume")
    val volume: String,
    @Json(name = "count")
    val count: Int,
    @Json(name = "chapters")
    val chapters: Map<Any, Chapters>
)