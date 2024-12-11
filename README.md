# Assignment 1 - ID: 216114744

## Overview
This project has 3 parts:

1. **Tests: Ex1.Test.java**
   - This code provides unit tests for the various functions in `Ex1` to make sure that they work well.
   - Each function tests the function's operation on a variety of possible inputs, including valid and invalid inputs.

2. **Functions: Ex1.java**

   - **`number2Int(String num)`**  
     Converts a number in a string number format to decimal (int) format.  
     If the string is not in a valid format, the function returns `-1`.

   - **`isNumber(String a)`**  
     The function checks if the given string is in a valid number format.  
     The string should be in this format or only digits (therefore it is in base 10).

   - **`int2Number(int num, int base)`**  
     Converts from an integer to a number format in the given selected base system (between 2 and 16).  
     If the number or base is invalid, the function returns an empty string.

   - **`maxIndex(String[] arr)`**  
     The function gets an array that contains strings in this number format or only digits (therefore in base 10)  
     and returns the index of the greatest number.  
     If none is valid, it returns `0`.

   - **`equals(String n1, String n2)`**  
     The function gets 2 strings in this number format or only digits (therefore in base 10) or both  
     and returns `true` if both numbers are equal.  
     Otherwise, it returns `false`.
     -examples:
      -Ex1.equals("101b2","5")-> return true

3. **Main Code: Ex1.Main.java**
   - The program receives two numbers in string number format and checks that they are in a valid format.  
   - It later calculates the sum and product of the two numbers and displays the results in the base that was given by the user (between 2 and 16).  
   - After that, the program finds the largest number of the two numbers and the results of the sum and product, and displays it in the given base in the number format.  
   - The program runs until the user enters the word "quit", which means the program is terminated.
