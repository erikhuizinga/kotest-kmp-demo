package com.example.kotest.kmp.demo

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform