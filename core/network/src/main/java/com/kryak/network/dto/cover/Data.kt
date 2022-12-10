package com.kryak.network.dto.cover

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Data(
    val id: String = "",
    val type: String = "",
    val attributes: Attributes = Attributes(),
    val relationships: List<Relationship> = listOf()
)
