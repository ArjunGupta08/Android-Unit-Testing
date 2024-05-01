package com.arjungupta08.unittesting.utils

import junit.framework.TestCase.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameters


@RunWith(value = Parameterized::class)
class ParameterizedExample(val input : String, val expectedValue : Boolean) {

    @Test
    fun test() {
        // Arrange
        val helper = Helper()
        // Act
        val result = helper.isPalindrome(input)
        // Assert
        assertEquals(expectedValue, result)
    }

    companion object {

        @JvmStatic
        @Parameters(name = "{index} : {0} isPalindrome - {1}")
        fun data() : List<Array<Any>> {
            return listOf(
                arrayOf("Hello", false),
                arrayOf("Welcome", false),
                arrayOf("level", true),
                arrayOf("", true),
            )
        }
    }

}