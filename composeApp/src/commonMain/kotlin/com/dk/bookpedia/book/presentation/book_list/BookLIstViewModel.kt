package com.dk.bookpedia.book.presentation.book_list

import androidx.lifecycle.ViewModel
import com.dk.bookpedia.book.domain.BookRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class BookListViewModel(
    private val bookRepository: BookRepository
): ViewModel() {

    private val _state = MutableStateFlow(BookListState())
    val state = _state.asStateFlow()

    fun onAction(action: BookListAction) {
        when(action){
            is BookListAction.OnBookClick -> {

            }
            is BookListAction.OnSearchQueryChange -> {
                _state.update {
                    it.copy(searchQuery = action.query)
                }
            }
            is BookListAction.OnTabSelect -> {
                _state.update {
                    it.copy(selectedTabIndex = action.index)
                }
            }
        }
    }
}