# Assignment 1 - ID: 216114744

## Overview
   - The program receives two numbers in string number format and checks that they are in a valid format using **`isNumber(String a)`** function.  
   - It later calculates the sum and product of the two numbers and displays the results in the base that was given by the user (between 2 and 16) using **`int2Number(int num, int base)`**  function.  
   - After that, the program finds the largest number of the two numbers and the results of the sum and product using **`maxIndex(String[] arr)`** and **`number2Int(String num)`** functions , and displays it in the given base in the number format.  
   - The program runs until the user enters the word "quit", which means the program is terminated.
### A few examples:
Ex1 class solution:

Enter a string as number#1 (or "quit" to end the program):  
1DbG  
num1 = 1DbG is number: true, value: 29  

Enter a string as number#2 (or "quit" to end the program):  
AAbB  
num2 = AAbB is number: true, value: 120  

Enter a base for output: (a number [2,16])  
2  
1DbG + AAbB = 10010101b2  
1DbG * AAbB = 110110011000b2  
Max number over [1DbG, AAbB, 10010101b2, 110110011000b2] is: 110110011000b2  

In this example, the program validated the inputs, performed addition and multiplication in decimal, and converted the results to base 2.

Ex1 class solution:

Enter a string as number#1 (or "quit" to end the program):  
12  
num1 = 12 is number: true, value: 12  

Enter a string as number#2 (or "quit" to end the program):  
10011b2  
num2 = 10011b2 is number: true, value: 19  

Enter a base for output: (a number [2,16])  
16  
12 + 10011b2 = 1FbG  
12 * 10011b2 = E4bG  
Max number over [12, 10011b2, 1FbG, E4bG] is: E4bG  

This example demonstrates a calculation in base 16, showing results in hexadecimal.

