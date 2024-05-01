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
> Unit Tests example Using `JUnit`

    @Test
    fun isPalindrome_inputString_level_expectedTrue() {
        // Arrange - initialize the class object
        val helper = Helper()
        // Act - call the function
        val result = helper.isPalindrome("level")
        // Assert - compare to Test
        assertEquals(true, result)
    }
> We use ` Parameterized Test ` for multiple test cases!
 - Define a class for Parameterized Tests.
 - Define class `Parameters` for your `input string`, and `Expected Value`
 - See the ParameterizedExample class for better understanding!

 > Here we have completed the part of JUnit tests, Now let's talk about `Instrumentation Tests`.

# Instrumentation Tests Example
How to write Instrumentation tests that do not interact with UI. Classes such as Android Context, Asset Manager do not need UI to work with. To write test cases for these classes we need to write instrumentation test. These test cases follow the same pattern as JUnit.
** There are two types of Instrumentation Tests are available -**
 - Non UI (Similar to Unit Tests)
 - UI (Expresso)

 > Now Let's Practice some problems related to Local unit test.
# Problem statements 
 - Validate password
   - Should not be Empty
   - Lenth should be between 6 to 15
   - OtherWise return valid password
 - String reversal.




