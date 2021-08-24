package day1;

import java.util.Scanner;

public class String_Operations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Option" + "\t" + "Operation" + "\n" + "1." + "\t" + "Reverse" + "\n" + "2." + "\t" + "Length");
		System.out.println("Enter the option:");
		int option = sc.nextInt();
		switch (option) {
			case 1:
				System.out.println("Enter the string to be reverse:");
				String str=sc.next();
				StringBuffer str1=new StringBuffer(str);
				System.out.println(str1.reverse());
				break;
			case 2:
				System.out.println("Enter the string to find its length:");
				String str2=sc.next();
				System.out.println(str2.length());
				break;
			default:
				System.out.println("Enter valid Input");
				break;
		}

	}

}
