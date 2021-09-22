EXPERIMENT – 7

TITLE: Exceptions

 

1. Done: Write a program in Java to display the names and roll numbers of students. Initialize respective array variables for 10 students. Handle ArrayIndexOutOfBoundsException, so that any such problem doesn’t cause illegal termination of program.
2. Done: Create an exception class, which throws an exception if operand is nonnumeric in calculating modules. (Use command line arguments).
3. Done: Write a code to create your own exception class. Create another class, inside main method prompt user to enter a number if number is less than 500 throw instances of your custom exception class.
4. Done: You are given two integers,a and b as input, you have to compute a/b: If a and b are not bit signed integers or if is zero, exception will occur and you have to report it. Read sample Input/Output to know what to report in case of exceptions.
Sample Input 0:

10
3

Sample Output 0: 

3

Sample Input 1:

10
Hello

Sample Output 1:

java.util.InputMismatchException

Sample Input 2:

10
0

Sample Output 2:

java.lang.ArithmeticException: / by zero

Sample Input 3:

23.323
0

Sample Output 3:

java.util.InputMismatchException

 

5. You are required to compute the power of a number by implementing a calculator. Create a class Calc which consists of a single method long power(int, int). This method takes two integers, a and b, as parameters and finds ab. If either a or b is negative, then the method must throw an exception which says "a and b should not be negative". Also, if both a and bare zero, then the method must throw an exception which says "a and b should not be zero"

lang.Exception: a and b should not be negative.
Complete the function power in class Calc and return the appropriate result after the power operation or an appropriate exception as detailed above.

Input Format

Each line of the input contains two integers, a and b. The code must read the input and send the values to the method as parameters.

Constraints

·      -10 <= a<= 10
·      -10 <= b<= 10

Output Format

Each line of the output contains the result, if both a and b are positive. If either a or b is negative, the output contains "a and b should be non-negative". If both  a and b are zero, the output contains "a and b should not be zero."

Sample Input 0

3 5
2 4
0 0
-1 -2
-1 3

Sample Output 0

243
16

java.lang.Exception: n and p should not be zero.
java.lang.Exception: n or p should not be negative.
java.lang.Exception: n or p should not be negative.