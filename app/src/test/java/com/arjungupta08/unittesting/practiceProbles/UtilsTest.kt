package com.arjungupta08.unittesting.practiceProbles

import com.arjungupta08.unittesting.utils.UnitTestsPracticeProblems
import org.junit.Assert.assertEquals
import org.junit.Test


class UtilsTest {

    @Test
    fun testStringReversal_emptyString_ExpectedEmptyString() {
        // Arrange
        val utils = UnitTestsPracticeProblems()
        // Act
        val reversed = utils.stringReversal("")
        // Assert
        assertEquals("", reversed)
    }

    @Test
    fun testStringReversal_ValidString_ExpectedValid() {
        // Arrange
        val utils = UnitTestsPracticeProblems()
        // Act
        val reversed = utils.stringReversal("ABC")
        // Assert
        assertEquals("CBA", reversed)
    }

    @Test
    fun testStringReversal_SingleCharString_ExpectedSingleChar() {
        // Arrange
        val utils = UnitTestsPracticeProblems()
        // Act
        val reversed = utils.stringReversal("A")
        // Assert
        assertEquals("A", reversed)
    }

    @Test(expected = IllegalArgumentException::class)
    fun testStringReversal_nullString_ExpectedException() {
        // Arrange
        val utils = UnitTestsPracticeProblems()
        // Act
        utils.stringReversal(null)
    }

}