package lab8;
import java.util.Scanner;
public class LabEight {
    
	 
	public static void main(String[] args) {
	         Scanner scan = new Scanner(System.in);         
	        String option;
	         int[][] arr = new int[3][3];      
	         String[][] ray = { { "sam", "Lives in Detroit", "Loves vagetables" }, { "simual", "Lives in N.Y"," Loves Pizza" }, 
	        		 { "james","Lives in warren", "Loves Burgers", }};   
	       
	         do{	
	         System.out.println("Please Enter a number between 1-3");    
	   
	         int a = scan.nextInt() - 1;    
	         System.out.println(ray[a][0]);   
	         System.out.println("What would you like to know about him");   
	         System.out.println("Enter 1 for Location or 2 for Food");  
	         int b = scan.nextInt() ;
	         System.out.println(ray[a][b]);
	         System.out.println("would you like to know about another student?(y/n) :");
	         option=scan.next();
	         System.out.println();
	       }
	         while(!option.equalsIgnoreCase("n"));
	       
	       
    	System.out.println("bye");   
       }
       }

	
		
		


	


