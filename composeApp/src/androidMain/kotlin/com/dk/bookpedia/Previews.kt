package com.dk.bookpedia

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
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