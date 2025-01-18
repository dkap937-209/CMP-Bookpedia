package com.dk.bookpedia

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.dk.bookpedia.app.App
import com.dk.bookpedia.di.initKoin

fun main() {
    initKoin()
    application {
        Window(
            onCloseRequest = ::exitApplication,
            title = "CMP-Bookpedia",
        ) {
            App()
        }
    }
}