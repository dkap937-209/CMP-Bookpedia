package com.dk.bookpedia.book.data.repository

import com.dk.bookpedia.book.data.mapper.toBook
import com.dk.bookpedia.book.data.network.RemoteBookDataSource
import com.dk.bookpedia.book.domain.Book
import com.dk.bookpedia.book.domain.BookRepository
import com.dk.bookpedia.core.domain.DataError
import com.dk.bookpedia.core.domain.Result
import com.dk.bookpedia.core.domain.map

class DefaultBookRepository(
    private val remoteBookDataSource: RemoteBookDataSource
): BookRepository {

    override suspend fun searchBooks(
        query: String,
    ): Result<List<Book>, DataError.Remote> {
        return remoteBookDataSource.searchBooks(
            query = query
        ).map { dto ->
            dto.results.map { it.toBook() }
        }
    }

    override suspend fun getBookDescription(bookId: String): Result<String?, DataError> {
        return remoteBookDataSource
            .getBookDetails(bookId)
            .map {
                it.description
            }
    }
}