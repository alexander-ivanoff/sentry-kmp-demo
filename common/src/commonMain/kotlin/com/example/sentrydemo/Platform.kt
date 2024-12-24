package com.example.sentrydemo

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform