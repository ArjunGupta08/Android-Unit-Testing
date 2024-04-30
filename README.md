# Unit Testing
 - Helps in catching bugs.
 - Testing smallest piece of code.
 - Helps in writing modular codes - features can be added easily.

# Testing in Android -
 - We have `kotlin/java code (Pure Logic)` with `Android Framework`.
 - Having a good architecture helps in seggregating Android Code from pure kotlin/java logic.

# Two types of tests -
 - **Unit Tests** ->
   - JVM Test (Local Unit Tests)
   - On Device Tests (Instrumentation Tests)
     - Instrumentation Tests can also be classified in two types ->
     - UI Tests (Interaction With Views)
     - Non UI Tests (Context, Assset MAnager etc.)
    
<p align="center">
  <img src="https://github.com/ArjunGupta08/Android-Unit-Testing/assets/85922120/d5218d2b-36b3-4f30-af61-e085b02103de" width="600"/>
</p>

# JUnit Test Example
-> Unit Tests example Using `JUnit`

    @Test
    fun isPalindrome_inputString_level_expectedTrue() {
        // Arrange - initialize the class object
        val helper = Helper()
        // Act - call the function
        val result = helper.isPalindrome("level")
        // Assert - compare to Test
        assertEquals(true, result)
    }
-> We use ` Parameterized Test ` for multiple test cases!
 - Define a class for Parameterized Tests.
 - Define class `Parameters` for your `input string`, and `Expected Value`
 - See the ParameterizedExample class for better understanding!



