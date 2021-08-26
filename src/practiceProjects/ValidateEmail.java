/*
Validation of an Email ID .
DESCRIPTION

Project objective:

As a developer, write a program to search a string entered by a user from the array of strings.

 

Background of the problem statement:

You have an array of email IDs of employees. As a programmer, write a program to search the email ID entered by a user.

 

You must use the following:

Eclipse/IntelliJ: An IDE to code the application
Java: A programming language
Git: To connect and push files from the local system to GitHub
GitHub: To store the application code and track its versions
Core Java concepts: Methods, collections, and strings
 

Following requirements should be met:

The versions of the code should be tracked on GitHub repositories
The code should be able to search the required string from the array of strings
*/

package practiceProjects;

import java.util.Scanner;

public class ValidateEmail {

	public static void main(String[] args) {

		String[] emails = {"user1@simlilearn.com", "user2@simlilearn.com", "user3@simlilearn.com"};
		String inputEmail;
		boolean matchFound = false;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the email to validate: ");
		inputEmail = scanner.next().trim();
		//System.out.println('*'+inputEmail+'*');
		
		for (int i=0; i<emails.length; i++) {
		
			if (emails[i].equals(inputEmail)) {
				matchFound = true;
				break;
			}
	    }
		
        if (matchFound)
			System.out.println("It's a match.");
        else
		    System.out.println("It's not a match.");
        
    }
}

