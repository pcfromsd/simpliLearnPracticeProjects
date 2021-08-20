/*
Creating an Arithmetic Calculator.

DESCRIPTION

Project objective:
   As a developer, write a program to create an arithmetic calculator.

Background of the problem statement:
   As a developer, write a Java code to create a calculator to perform the four basic arithmetic operations 
   (addition, subtraction, multiplication, and division).

You must use the following:
   - Eclipse/IntelliJ: An IDE to code for the application
   - Java: A programming language
   - Git: To connect and push files from the local system to GitHub
   - GitHub: To store the application code and track its versions
   - Core Java concepts: 
        Variables, data types, operators, type casting, control statements, class, objects, access specifiers, 
        and core keywords like final, this, and static
 
Following requirements should be met:
   - The versions of the code should be tracked on GitHub repositories.
   - The calculator should work properly.  
*/

package practiceProjects;

import java.util.Scanner;

public class ArithmaticCalculator {
	
	public static void main (String args[]) {
	
		Scanner scanner = new Scanner(System.in);
		
		float result = 0;
		String firstNumber;
		String secondNumber;
		char operation;
	    final char exitChar = 'X';
	    
		while (true) {
           System.out.println("Enter the 1st number (x to exit): ");
           firstNumber = scanner.next();
           if ((firstNumber.substring(0, 1).toUpperCase()).equals(String.valueOf(exitChar))) 
               break;
           
           System.out.println("Enter the operation (+-*/) (x to exit): ");
           operation = scanner.next().charAt(0);
           if (Character.toUpperCase(operation) == exitChar) 
               break;
           
           System.out.println("Enter the 2nd number: ");
           secondNumber = scanner.next();
           if ((secondNumber.substring(0, 1).toUpperCase()).equals(String.valueOf(exitChar))) 
               break;

           if (operation == '+') {
               result = Float.parseFloat(firstNumber) + Float.parseFloat(secondNumber);         	   
           }
           else if (operation == '-') {
               result = Float.parseFloat(firstNumber) - Float.parseFloat(secondNumber);         	   
           }
           else if (operation == '*') {
               result = Float.parseFloat(firstNumber) * Float.parseFloat(secondNumber);         	   
           }           
           else if (operation == '/') {
               result = Float.parseFloat(firstNumber) / Float.parseFloat(secondNumber);         	   
           }
           else {
        	   System.out.println("Invalid operation. Valid operations are +-*/\n");
        	   continue;
           }
           
           System.out.println("The result is: " + result + "\n");
		}
		
		System.out.println("Done.");
		scanner.close();
	}
}
