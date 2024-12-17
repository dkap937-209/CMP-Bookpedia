package com.dk.bookpedia.book.presentation.boot_list

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.dk.bookpedia.book.domain.Book


@Composable
fun BookListScreenRoot(
    viewModel: BookListViewModel,
    onBookClick: (Book) -> Unit
) {

    val state by viewModel.state.collectAsStateWithLifecycle()

    BookListScreen(
        state = state,
        onAction = { action ->
            when(action) {
                is BookListAction.OnBookClick -> onBookClick(action.book)
                else -> viewModel.onAction(action)
            }
        },
    )
}

@Composable
private fun BookListScreen(
    state: BookListState,
    onAction: (BookListAction) -> Unit
) {

}