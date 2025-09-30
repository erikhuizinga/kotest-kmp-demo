package com.example.kotest.kmp.demo

import kotlin.test.Test
import kotlin.test.assertEquals

class ComposeAppCommonTest {

    @Test
    fun example() {
        println("ℹ️ kotest demo example unit test running on ${getPlatform().name}")
        assertEquals(3, 1 + 2)
    }
}
