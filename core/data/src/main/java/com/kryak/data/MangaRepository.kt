package com.kryak.data

import androidx.paging.PagingData
import com.kryak.model.ChapterModel
import com.kryak.model.MangaModel
import kotlinx.coroutines.flow.Flow

interface MangaRepository {

    fun getLatestUpdate(): Flow<PagingData<MangaModel>>

    fun getMangaById(id: Int): Flow<MangaModel>

    fun getChapterList()

    fun getChapter(chapterId: Int): Flow<ChapterModel>
}
