package com.kryak.network.dto.manga

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TagAttributes(
    val name: Name = Name(),
    val group: String = "",
    val version: Int = 0
)
