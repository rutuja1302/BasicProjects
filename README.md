# BasicProjects
Trying to complete basic projects in various categories of Java.

## List of projects -

1. User input & Replace String template "Hello <>, How are you?" - I/P -> Take username as input.Ensure username has min 3characters O/P -> Replace <> with proper name and print the string.
2. Multiplication table - Take a number as an input and print its multiplication table upto 10
3. Shape Area & Perimeter calculator - Create an abstract class called Shape. Create another class which will inherit Shape class and store all the shapes like triangle, rectangle, circle and square. Let a class Main take type of shape, lenghts as input and print area & perimeter as output. Throw an exception if shape not found
4. Flip Coin and print percentage of Heads and Tails - I/P -> The number of times to flip coin. Ensure it is positive integer. Logic -> Use random function to get value between 0 to 1. If <0.5 then tails or heads. O/P -> Percentage of heads & tails.
5. Leap Year - Take a year as an input, ensure it is a 4 digit number. Determine if it is a leap year and print it.
6. Harmonic Number - Take a number N as input, ensure N != 0, compute 1+1/2+1/3+...+1/N & print the Nth Harmonic value.
7. Gambler - Stimulate a gambler who starts with $stake & place fair $1 bets until he/she goes broke(i.e has no money) or reach $goal.Keeps track of the number of times he/she wins & the number of bets he/she makes. Run the experiment N times, average the results, and print them out. 
8. Power of 2 - This program takes a command line argumemt N and prints the table of the powers of 2 that are less than or equal to 2^N. Take power value N as an input and print the power table as an input. Note- program will only work if 0<= N < 31, as 2^31 will overflow int
9. Anagram detection - Check if two strings are anagram or not. (Anagram example: fried & fired)
10. Reverse a string - Enter a string & the program will reverse it and print it out.
11. Pig Latin - A secret language formed from english by transferring the initial consonant to the end of the word and 'ay' is affixed to it. If the word starts with an vowel then 'way' is affixed at the end of the word. Eg: food becomes oodfay & ice becomes iceway.
12. Prime Factorization calculator - This interaction program determines whether your input is prime or composite number. It will also list the number's factors.
13. The Age Calculator - This program will determine the age or interval between two dates. The calculated age will be displayed in years, months and days.
14. Fortune Cookie teller - This program will simply tell user's fortune for the day. These fortunes will be stored in an array of Strings, use random class to generate a random number.
15. Unit Converter(temp, length, mass, angle)- Converts various units between one another. The user enters the type of unit being entered, the type of unit they want to convert to & then the value. The program will then make the conversion.
16. Change Return Program - The user enters a cost & then the amount of money given. The program will figure out the change and the number of cash or coins needed for change.
17. Credit Card Validator - Takes in a credit card number from a common credit card vendor(Visa, MasterCard, American Express, Discoverer) & validates it to make sure that it is a valid number(Luhn's algorithm).
18. Factorial Finder - The Factorial of a positive integer, n, is defined as the product of the sequence n, n-1, n-2, ...1 and the factorial of zero, 0, is defined as being 1.Take n as input & print it's factorial.
19. Count Vowels - Enter a string and the program counts the number of vowels in the text.
20. Fibonacci Sequence - Enter a number and have the program generate the Fibonacci sequence to that number or to the Nth number.
21. Password Generator - This program will take password length as an input and provide a new password with random alphabets,numbers,special characters combination.
22. Simple Calculator - A 2D calculator to perform basic operations.
23. Hangman Game - This is version of the classic letter guessing game called Hangman. User will be shown a set of blank letters that match a word and user have to guess what these letters are to reveal the hidden word. If the user guesses a wrong letter then the program hangs the man otherwise the user wins!
24. Currency Formatter - User will enter a double-precision number, denoting an amount of money, use the NumberFormat class' getCurrecyInstance method to convert the input into different currencies. 
25. Binary Numbers - Given a base-10 integer(n), convert it to binary (base-2). Then find and print the base-10 integer denoting the maximum number of consecutive 1's in n's binary representation.
26. Substring comparison - Given a string 's', and an integer 'k', perform a program that finds the lexicographically smallest and largest substrings of length k.
27. Hourglass Problem - Calculate the hourglass sum for every hourglass in a 2D Array, then print the maximum hourglass sum.
28. Average Grade Calculator - This program will take Name of the student, id number and his/her scores as an input. Class Person will print the student's details and class Student(inheriting Person class's properties) will calculate the average score and will return the grade character representative of their calculated average.
29. Library Fine - Given the expected and actual return dates for a library book, create a program that calculates the fine. [Fine Structure: 1)If book returned on or before time; fine=0. 2)If book returned after expected day but in the same month & year; fine=15₹ * (no. Of days late) 3) If book returned after expected month but same year; fine= 500₹*(no. Of months late) 4)If book is returned after the calendar year there is fixed fine of 1000₹]
30. Bubble Sort - Given an array,a, of size n distinct elements, sort the array in ascending order using the Bubble Sort algorithm. Once sorted, print number of swaps, first element and last element.
31. Pangrams - Pangrams are sentences constructed by using every letter of the alphabet atleast once. Given a string as an input, determine whether it is a pangram string or not.
32. Pattern Syntax Checker - Using Regex, we can easily match or search for patterns in a text. Before searching for a pattern, we have to specify one using some well-defined syntax.In this problem, You have to check whether the syntax of the given pattern is valid.
33. Validate IP Address - This program will accept the IP address as an input string and will check whether the given string is a valid IPv4 or IPv6 address or not. 
34. Encryption and Decryption - Encryption is the process of converting electronic data into another equivalent form, called “ciphertext” that cannot be easily understood by anybody except the authorized personnel. Whereas decryption is the reverse process of encryption. We will create 2 simple programs, first program will encrypt the given text and second will decrypt the code into the text message.
35. Clock Angle Problem - This program will determine the angle between two hands of a analog clock at a given time.
36. Happy number - Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1, or it loops endlessly in a cycle which does not include 1.
37. Simulate Stopwatch Program - This is a Stopwatch Program for measuring the time that elapses between the start and end clicks. I/P -> Start the Stopwatch and End the Stopwatch. Measure the elapsed time between start and end. Print the elapsed time.
38. Employee's Salary Calculator - i/p -> 1)Number of hours the employee works per week 2) Amount of money the emloyee makes per hour 3) Number of vacation days. O/p -> Employee's Gross Yearly Salary
39. Comparator Sorting - Comparators are used to compare two objects. In this problem, you'll create a comparator and use it to sort an array. The Player class will have two fields- name: a string. & score: an integer. Given an array of n Player objects, write a comparator that sorts them in order of decreasing score. If 2 or more players have the same score, sort those players alphabetically ascending by name. To do this, you must create a Checker class that implements the Comparator interface, then write an int compare(Player a, Player b) method implementing the Comparator.compare(T o1, T o2) method. In short, when sorting in ascending order, a comparator function returns -1 if a<b, 0 if a=b & 1 id a>b.
40. Size of the smallest subset with maximum Bitwise OR - Given an array of positive integers. The task is to find the size of the smallest subset such that the Bitwise OR of that set is Maximum possible. (GOCC'16 problem)
41. XOR list operations - Given a list which initially contains 0, the following queries can be performed: 1)0 X: add X to the list  2)1 X: replace each element “A” of the list by A^X, where ^ is the xor operator 3) Return a list with the result elements in increasing order.
42. TotalFeet - Given an array of integers representing measurements in inches, write a program to calculate the total of measurements in feet.(TechMahindra Recruitment exam question)
43. Niven Number - Niven Numbers are positive integers greater than 0 that are divisible by the sum of their digits. You are given a niven number 'n', If n is niven, then return the number of times it is divisible by the sum of its digits(i.e the quotient), else return 0.
44. Number Guessing Game - In this Game, the computer is going to randomly select an integer from 1 to 100. You'll keep guessing numbers until you find the computer's number, and the computer will tell you each time if your guess was too high or too low.
