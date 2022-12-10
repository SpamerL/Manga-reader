package com.kryak.network.dto.chapter

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Chapter(
    val hash: String = "",
    val data: List<String> = listOf(),
    val dataSaver: List<String> = listOf()
)
