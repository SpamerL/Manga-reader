package com.kryak.network.dto.chapterList

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ChapterList(
    @Json(name = "result")
    val result: String,
    @Json(name = "volumes")
    val volumesDetails: Map<Any, VolumesDetails>
)