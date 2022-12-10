package com.kryak.network.dto.manga

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Name(
    val en: String = ""
)
