package com.arjungupta08.unittesting.utils

import junit.framework.TestCase.assertEquals
import org.junit.Before
import org.junit.Test

class HelperTest {

    private lateinit var helper : Helper

    @Before
    fun beforeTest() {
        helper = Helper()
    }

    @Test
    fun isPalindrome() {
        // Arrange
        // Act
        val result = helper.isPalindrome("Welcome")
        // Assert
        assertEquals(false, result)
    }

    @Test
    fun isPalindrome_inputString_level_expectedTrue() {
        // Act
        val result = helper.isPalindrome("level")
        // Assert
        assertEquals(true, result)
    }

}