package basics;

import java.util.Scanner;

public class Exercise1 {	 
	    public static void main(String[] args) {
	    	Scanner sc = new Scanner(System.in);
	    	
	    	int a, b;

	    	System.out.println("Enter the numbers to sum: ");
	    	a = sc.nextInt();
	    	b = sc.nextInt();
	    	
	    	int sum = a + b;
	    	
	    	System.out.println("The result is: " + sum);
	    	sc.close();
	    }
	} 

