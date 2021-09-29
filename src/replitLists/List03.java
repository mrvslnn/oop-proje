package replitLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List03 {

	public static void main(String[] args) {
		/*Get a sentence from the user. Accept the sentence received from the user as a parameter,
		 *  Invert sentence using Array and write a Method that returns the result as a String to the main method.
​
		Note: Upper and lower case letters, spaces and special characters will not be changed.
​
		Input : 
​
		It is very nice to write code.
​
		Output : 
​
		.edoc etirw ot ecin yrev si tI
		*/


		        String str = "It is very nice to write code.";
		        String[]arr=str.split("");
		        

		        for (int i = arr.length-1; i>=0; i--) {
		        	
		            System.out.print(arr[i]);
		        }

		    }


}