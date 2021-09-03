package practiceProjects;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class TestFileOperation {

	public static void main(String[] args) throws IOException {

		FileOperation fo = new FileOperation();
		int choice;
		String fileName;
		String content;		
		int retStatus;

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8));
				
		try { 
			while (true) {

				System.out.print("\n1(CreateFile) / 2(ReadFile) / 3(WriteFile) / 4(AppendFile) / 5(Exit) - Enter your choice: ");
				choice = Integer.parseInt(reader.readLine());
			
				if (choice == 1)  {
					System.out.print("Enter filename to be created: ");
					fileName = reader.readLine();

					retStatus = fo.createFile(fileName);
					if (retStatus == 1)
						System.out.println("File " + fileName + " created.");
					else if (retStatus == 2)
						System.out.println("File " + fileName + " already exists.");
				}
				else if (choice == 2)  {
					System.out.print("Enter filename to be read from: ");
					fileName = reader.readLine();

					retStatus = fo.readFile(fileName);
					if (retStatus == 1)
						System.out.println("File " + fileName + " read successfully.");
					else if (retStatus == 2)
						System.out.println("File not found.");
				}
				else if (choice == 3)  {
					
					System.out.print("Enter filename to be written to: ");
					fileName = reader.readLine();

					System.out.print("Enter content to be written: ");					
					content = reader.readLine()+"\n";
										
					retStatus = fo.writeFile(fileName, content);
					if (retStatus == 1)
						System.out.println("File write done.");
					else if (retStatus == 2)
						System.out.println("File not found.");
												
				}
				else if (choice == 4)  {
					System.out.print("Enter filename to be appended to: ");
					fileName = reader.readLine();

					System.out.print("Enter content to be appended: ");					
					content = reader.readLine()+"\n";
					
					retStatus = fo.appendFile(fileName, content);
					if (retStatus == 1)
						System.out.println("File write done.");
					else if (retStatus == 2)
						System.out.println("File not found.");
				
				}
				else if (choice == 5)  {
					break;
				}
				else {
					System.out.println("Invalid choice.");
				}
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }			
			System.out.println("Done.");
		}		
	}
}
