package com.kryak.network.dto.cover

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Relationship(
    val id: String = "",
    val type: String = ""
)
