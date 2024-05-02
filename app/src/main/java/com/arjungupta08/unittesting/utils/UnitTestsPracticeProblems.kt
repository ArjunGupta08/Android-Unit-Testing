package com.arjungupta08.unittesting.utils

import java.lang.IllegalArgumentException

class UnitTestsPracticeProblems {

    // Practice Q - 1
    fun validatePassword(inputString: String) = when {
        inputString.isBlank() -> {
            "Please Input the password"
        }
        inputString.length < 6 -> {
            "Length of the password should be greater then 6"
        }
        inputString.length > 15 -> {
            "Length of the password should be less then 15"
        }
        else -> {
            "Valid Password"
        }
    }

    // Practice Q - 2
    fun stringReversal(inputString: String?): String {
        if (inputString == null) {
            throw IllegalArgumentException("Input String is required")
        }
        val char = inputString.toCharArray()
        var i = 0
        var j = inputString.length - 1

        while (i < j) {
            val temp = char[i]
            char[i] = char[j]
            char[j] = temp
            i++
            j--
        }
        return char.joinToString("")
    }

}