package com.dk.bookpedia.book.presentation.book_list

import com.dk.bookpedia.book.domain.Book

sealed interface BookListAction {
    data class OnSearchQueryChange(val query: String) : BookListAction
    data class OnBookClick(val book: Book): BookListAction
    data class OnTabSelect(val index: Int): BookListAction
}