package com.dk.bookpedia.book.data.mapper

import com.dk.bookpedia.book.data.dto.SearchedBookDto
import com.dk.bookpedia.book.domain.Book

fun SearchedBookDto.toBook(): Book {
    return Book(
        id = id,
        title = title,
        imageUrl = if(coverKey != null) {
            "https://covers.openlibary.org/b/olid/$coverKey-L.jpg"
        } else {
            "https://covers.openlibary.org/b/olid/$coverAlternativeKey-L.jpg"
        },
        authors = authorNames ?: emptyList(),
        description = null,
        languages = languages ?: emptyList(),
        firstPublishYear = firstPublishYear.toString(),
        averageRating = ratingsAverage,
        ratingCount = ratingsCount,
        numPages = numPagesMedian,
        numEditions = numEditions ?: 0
    )
}