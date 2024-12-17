package com.dk.bookpedia

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform