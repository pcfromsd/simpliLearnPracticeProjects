/*
Longest Increasing Subsequence.

DESCRIPTION

Project Objective:
As a developer, write a program to find the longest increasing subsequence.

Background of the problem statement:
As a developer, write a Java code to find the longest increasing subsequence from a list of random numbers.
 
You must use the following:
    - Eclipse/IntelliJ: An IDE to code for the application.
    - Java: A programming language.
    - Git: To connect and push files from the local system to GitHub.
    - GitHub: To store the application code and track its versions. 
    - Core Java concepts: variables, data types, operators, type casting, control statements, class, objects, access specifiers, and core keywords like final, this, and static.
 
Following requirements should be met:
    - The versions of the code should be tracked on GitHub repositories.
    - The code should work properly for n numbers, where n<100.
*/

package practiceProjects;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;  

public class LIS {

    // Method to get the Longest Increasing Subsequence and return it as an int array
    public int[] getLIS(int[] inArray)
    {

        List<List<Integer>> intLists = new ArrayList<>();
        int[] lisArr;
        
        for (int i=0; i<inArray.length; i++) {
        	intLists.add(new ArrayList<>());
        }
 
        // Initialize with first element inArray[0]
        intLists.get(0).add(inArray[0]);
 
        for (int i=1; i<inArray.length; i++)
        {
            for (int j=0; j<i; j++)
            {
                if (inArray[j]<inArray[i] && intLists.get(j).size()>intLists.get(i).size()) {
                	intLists.set(i, new ArrayList<>(intLists.get(j)));
                }
            }
 
            intLists.get(i).add(inArray[i]);
        }
 
        int j = 0;
        for (int i=0; i<inArray.length; i++)
        {
            if (intLists.get(j).size()<intLists.get(i).size()) {
                j = i;
            }
        }
        
        lisArr = intLists.get(j).stream().mapToInt(Integer::intValue).toArray();                
        return lisArr;
    }	

    
	public static void main(String[] args) {		

        Scanner scanner= new Scanner(System.in);  

        try  {
        	LIS lis = new LIS();
        	int[] lisArr;				

        	System.out.print("Enter an int array in the format [i1,i2,i3,...,iN]: ");  
        	String arrStr= scanner.nextLine();   
        	scanner.close();       
        
        	String[] string = arrStr.replaceAll("\\[", "")
	         .replaceAll("]", "").split(",");
	      
        	int[] arr = new int[string.length];
	      
        	for (int i = 0; i < string.length; i++)
        	{
        		arr[i] = Integer.valueOf(string[i]);
        	}		
		
        	lisArr = lis.getLIS(arr);
		
        	System.out.println("The LIS is: " + Arrays.toString(lisArr));
        	System.out.println("The lenghth of the LIS is: " + lisArr.length);        
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			scanner.close();
		}
	}
}
