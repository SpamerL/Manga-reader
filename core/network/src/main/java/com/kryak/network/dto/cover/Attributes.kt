package com.kryak.network.dto.cover

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Attributes(
    val description: String = "",
    val volume: String = "",
    val fileName: String = "",
    val locale: String = "",
    val createdAt: String = "",
    val updatedAt: String = "",
    val version: Int = 0
)
