package com.dk.bookpedia.book.data.network

import com.dk.bookpedia.book.data.dto.SearchResponseDto
import com.dk.bookpedia.core.domain.DataError
import com.dk.bookpedia.core.domain.Result

interface RemoteBookDataSource {
    suspend fun searchBooks(
        query: String,
        resultLimit: Int? = null
    ): Result<SearchResponseDto, DataError.Remote>
}