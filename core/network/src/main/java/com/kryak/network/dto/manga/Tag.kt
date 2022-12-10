package com.kryak.network.dto.manga

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Tag(
    val id: String = "",
    val type: String = "",
    val attributes: TagAttributes = TagAttributes(),
    val relationships: List<Any> = listOf()
)
