package com.arjungupta08.unittesting.utils

class Helper {

    fun isPalindrome(input : String) : Boolean{
        var i = 0
        var lastIndex = input.length - 1
        var result = true

        while (i < lastIndex) {
            if (input[i] != input[lastIndex]) {
                result = false
                break
            }
            i++
            lastIndex --
        }
        return result

    }
}