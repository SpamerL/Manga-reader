package com.kryak.model

data class ChapterModel(
    val baseUrl: String,
    val hash: String,
    val hqPages: List<String>, // high quality pages
    val lqPages: List<String> // low quality pages
)
