package com.kryak.network.dto.manga

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Attributes(
    val title: Title = Title(),
    val altTitles: Map<String, String> = mapOf(),
    val description: Map<String, String>? = mapOf(),
    val isLocked: Boolean = false,
    val links: Map<String, String> = mapOf(),
    val originalLanguage: String = "",
    val lastVolume: String = "",
    val lastChapter: String = "",
    val publicationDemographic: String? = "",
    val status: String = "",
    val year: Int? = 0,
    val contentRating: String = "",
    val tags: List<Tag> = listOf(),
    val state: String = "",
    val chapterNumbersResetOnNewVolume: Boolean = false,
    val createdAt: String = "",
    val updatedAt: String = "",
    val version: Int = 0,
    val availableTranslatedLanguages: List<String> = listOf(),
    val latestUploadedChapter: String = ""
)
