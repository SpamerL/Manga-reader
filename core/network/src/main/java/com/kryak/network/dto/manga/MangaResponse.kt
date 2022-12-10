package com.kryak.network.dto.manga

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MangaResponse(
    val id: String = "",
    val type: String = "",
    val attributes: Attributes = Attributes(),
    val relationships: List<Relationship> = listOf()
)
