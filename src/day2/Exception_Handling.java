package day2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_Handling{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter x and y: ");
			int x = sc.nextInt();
			int y = sc.nextInt();
			int z = x/y;
			System.out.println(z);
		}
		catch(ArithmeticException e) {			
			System.out.println(e);			
		}
		catch(InputMismatchException a) {
			System.out.println(a);
		}
	}

}
