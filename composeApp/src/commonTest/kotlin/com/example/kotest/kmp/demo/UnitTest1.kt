package com.example.kotest.kmp.demo

import kotlin.test.Test
import kotlin.test.assertEquals

class UnitTest1 {
    @Test
    fun example11() {
        println("ℹ️ kotest demo example unit test 11 running on ${getPlatform().name}")
        assertEquals(3, 1 + 2)
    }

    @Test
    fun example12() {
        println("ℹ️ kotest demo example unit test 12 running on ${getPlatform().name}")
        assertEquals(3, 1 + 2)
    }
}
