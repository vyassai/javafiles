package ibg;

import java.util.Scanner;//using import we can use classes present in this package in our class

public class PassFail {
	/*main method is the entry point to any java program which is static so no need to create any object
	to main method and its public which can be called from anywhere and it doesn't return anything so return type is void*/
	public static void main(String[] args) {
		
//dECLAING AN INT VARIABLE
		 int mark;
		 /*Scanner class is mainly used to take the i/p from console and we do that by creating an object
			of scanner class which takes predefined system.in object that acts like an input stream  */
		  Scanner reader = new Scanner(System.in);
		  
		 // printing message on to console
		  System.out.println("Enter score: ");
		  //this method of scanner class allows us to read a integer from console
		  mark = reader.nextInt();
		  //if loop checks condition if true message inside if block will be executed ,if false else pat will be executed
		  if (mark>=50)
		  {
		   System.out.println("Pass!");
		  }
		  else{
		   System.out.println("Fail!");
		 }
	//printing message done on to console
	System.out.println("Done");
	
	}
}

