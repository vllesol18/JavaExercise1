package javaExercise1;

import java.util.*;

public class JavaExercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sol = new Scanner(System.in);
		int x, y, z;
		System.out.println("Enter three integers.");
		
		System.out.println("Enter the 1st integer: ");
		x = sol.nextInt();
		
		System.out.println("Enter the 2nd integer: ");
		y = sol.nextInt();
		
		System.out.println("Enter the 3rd integer: ");
		z = sol.nextInt();
		
		int result = x * y * z;
		
		System.out.println("Product is: "+ result);
		
		sol.close();
	}

}
