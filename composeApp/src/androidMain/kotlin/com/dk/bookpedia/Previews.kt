package com.dk.bookpedia

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.dk.bookpedia.book.domain.Book
import com.dk.bookpedia.book.presentation.boot_list.BookListScreen
import com.dk.bookpedia.book.presentation.boot_list.BookListScreenRoot
import com.dk.bookpedia.book.presentation.boot_list.BookListState
import com.dk.bookpedia.book.presentation.boot_list.books
import com.dk.bookpedia.book.presentation.boot_list.components.BookList
import com.dk.bookpedia.book.presentation.boot_list.components.BookSearchBar

@Preview(showBackground = true)
@Composable
fun SearchBarPreview(modifier: Modifier = Modifier) {
    MaterialTheme {
        BookSearchBar(
            searchQuery = "Kotlin",
            onSearchQueryChange = {},
            onImeSearch = {}
        )
    }
}

@Preview
@Composable
private fun BookListScreenPreview() {
    BookListScreen(
        state = BookListState(
            searchResults = books
        ),
        onAction = {}
    )
}