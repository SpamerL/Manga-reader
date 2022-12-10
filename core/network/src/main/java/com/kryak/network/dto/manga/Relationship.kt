package com.kryak.network.dto.manga

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Relationship(
    val id: String = "",
    val type: String = "",
    val related: String? = null
)
