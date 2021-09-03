/*

File Handling .
DESCRIPTION

Project Objective:
    As a developer, write a program to read, write, and append to a file.

Background of the problem statement:
    As a developer, write a Java code to read, write, and append to a file.

You must use the following:
    Eclipse/IntelliJ: An IDE to code for the application.
    Java: A programming language.
    Git: To connect and push files from the local system to GitHub.
    GitHub: To store the application code and track its versions. 
 
Following requirements should be met:
    The versions of the code should be tracked on GitHub repositories.
    The code should work properly.
 
*/

package practiceProjects;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;

public class FileOperation {

	public int createFile (String fileName) throws IOException {
        
		// Create file
		File file = new File(fileName);
		
		if (file.createNewFile()) 
			return 1;
		else
			return 2;
	}
	
	public int readFile (String fileName) throws IOException {
		
		File file = new File(fileName);		  

		if (file.exists() && !file.isDirectory()) { 		
			BufferedReader fileContent1 = new BufferedReader(new FileReader(file));
			String lineRead;
			while ((lineRead = fileContent1.readLine()) != null)
			    System.out.println(lineRead);			
			fileContent1.close();
			return 1;
		}
		else
			return 2;		
	}
	
	public int writeFile (String fileName, String content) throws IOException {

		File file = new File(fileName);

		if (file.exists() && !file.isDirectory()) { 		
			FileWriter writer=new FileWriter(file);
			writer.write(content);
			writer.close();
			return 1;
		}
		else
			return 2;
	}
	
	public int appendFile (String fileName, String content) throws IOException {

		File file = new File(fileName);
        
		if (file.exists() && !file.isDirectory()) { 		
			BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
	        writer.write(content);
	        writer.close();
			return 1;
		}
		else
			return 2;
	}

}
