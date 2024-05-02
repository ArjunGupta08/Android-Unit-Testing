package com.arjungupta08.unittesting.practiceProbles

import com.arjungupta08.unittesting.utils.UnitTestsPracticeProblems
import org.junit.Assert.assertEquals
import org.junit.Test

class PasswordTest {

    @Test
    fun validatePassword_blankInput_expectedRequiredField() {
        val sut = UnitTestsPracticeProblems()
        val result = sut.validatePassword("       ")
        assertEquals("Please Input the password", result)
    }

    @Test
    fun validatePassword_2CharInput_expectedValidationMsg() {
        val sut = UnitTestsPracticeProblems()
        val result = sut.validatePassword("qw")
        assertEquals("Length of the password should be greater then 6", result)
    }

    @Test
    fun validatePassword_16CharInput_expectedValidationMsg() {
        val sut = UnitTestsPracticeProblems()
        val result = sut.validatePassword("qw54sd54sd54sd54sd")
        assertEquals("Length of the password should be less then 15", result)
    }

    @Test
    fun validatePassword_CorrectInput_expectedValidPassword() {
        val sut = UnitTestsPracticeProblems()
        val result = sut.validatePassword("qw54sd54d")
        assertEquals("Valid Password", result)
    }

}