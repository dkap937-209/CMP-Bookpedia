package com.dk.bookpedia

import androidx.compose.ui.window.ComposeUIViewController
import com.dk.bookpedia.app.App
import com.dk.bookpedia.di.initKoin

fun MainViewController() = ComposeUIViewController(
    configure = {
        initKoin()
    }
) {
    App()
}