package com.dk.bookpedia.book.domain

import com.dk.bookpedia.core.domain.DataError
import com.dk.bookpedia.core.domain.Result

interface BookRepository {

    suspend fun searchBooks(
        query: String,
    ): Result<List<Book>, DataError.Remote>
}