Assignment 1,ID: 216114744
This project has 3 parts:
 1.Tests:Ex1.Test.java
   This code provides unit tests for the various functions in Ex1 to make sure that they work well. Each function tests the function's operation on a variety of possible inputs, including valid and invalid inputs.
 2.Functions:Ex1.java
  (1)number2Int(String num) converts a number in a string to decimal (int) format. If the string is not in a valid format, the function returns -1
  (2)isNumber(String a) the function checks if the given string is in a valid number format. The string should be in the format "<number><b><base>" or only digits(therefore it is in the base 10)
  (3)int2Number(int num, int base) converts from an integer to a number format in the given selected base system (between 2 and 16). If the number or base is invalid , the function returns an empty string.
  (4)maxIndex(String[] arr) the function get an array that contain string in this format "<number><b><base>" or only digits(therefore it is in the base 10) and return the index of the greatest number. If none returns 0.
  (5)equals(String n1, String n2) the function get 2 strings in this format "<number><b><base>" or only digits(therefore it is in the base 10) and retrun true if both numbers are equale.Else, it return false;
 3.The Main Code: Ex1.Main Java
  The program receives two numbers in string format and checks that they are in a valid format. It later calculates the sum and mul(product) of the two numbers and displays the results in the base that was given by the user (between 2 and 16).
  After that,The program finds the largest number of the two numbers and the results of the sum and product, and displays it. The program runs until the user enters the word "quit", which means the program is terminated.
 
# Assignment 1 - ID: 216114744

## Overview
This project consists of three main parts:
1. **Tests**: Unit tests for the various functions in `Ex1.java` to ensure they work as expected.
2. **Functions**: The implementation of several utility functions in `Ex1.java`.
3. **Main Code**: The program in `Ex1.Main.java` that processes numbers in string format, performs calculations, and displays results in various bases.

## Functions in `Ex1.java`

1. **`number2Int(String num)`**
   - Converts a number in string format to decimal (int) format.
   - Returns `-1` if the input is not in a valid format.

   **Example:**
   ```java
   number2Int("123"); // returns 123
   number2Int("abc"); // returns -1
2.**`isNumber(String a)`**
  -the function checks if the given string is in a valid number format. The string should be in the format "<number><b><base>" or only digits(therefore it is in the base 10)
   **Example:**
   ```java
  isNumber("123"); // returns true
  isNumber("12a"); // returns false
3.**`int2Number(int num, int base)`**
  -converts from an integer to a number format in the given selected base system (between 2 and 16). If the number or base is invalid , the function returns an empty string.
   **Example:**
   ```java
    int2Number(255, 16); // returns "FF"
    int2Number(10, 2); // returns "1010b2"

