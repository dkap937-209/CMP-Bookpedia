package com.dk.bookpedia

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import com.dk.bookpedia.book.data.network.KtorRemoteBookDataSource
import com.dk.bookpedia.book.data.repository.DefaultBookRepository
import com.dk.bookpedia.book.presentation.book_list.BookListScreenRoot
import com.dk.bookpedia.book.presentation.book_list.BookListViewModel
import com.dk.bookpedia.core.data.HttpClientFactory
import io.ktor.client.engine.HttpClientEngine
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App(engine: HttpClientEngine) {
    BookListScreenRoot(
        viewModel = remember { BookListViewModel(
            bookRepository = DefaultBookRepository(
                remoteBookDataSource = KtorRemoteBookDataSource(
                    httpClient = HttpClientFactory.create(
                        engine = engine
                    )
                )
            )
        ) },
        onBookClick = {

        }
    )
}