package com.example.kotest.kmp.demo

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import io.kotest.property.checkAll

class KotestDemo : FunSpec({
    test("example test") {
        println("ℹ️ kotest demo example fun spec test running on ${getPlatform().name}")
    }
    test("example property test with kotest assertion") {
        println("ℹ️ kotest demo example property test running on ${getPlatform().name}")
        checkAll<String, String> { a, b ->
            (a + b).length shouldBe (a.length + b.length)
        }
    }
})
