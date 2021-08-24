package day1;

import java.util.Scanner;

public class Char_Forward_Backward {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the alphabet:");
		char ch=sc.next().charAt(0);
		int ch_ascii = ch;
		char temp;
		if(ch_ascii>=65 && ch_ascii<=90) {
			System.out.print("Forward:"+" ");
			for(int i=ch_ascii;i<=90;i++) {
				temp=(char)i;
				System.out.print(temp);
			}
			System.out.print("\nBackward:"+" ");
			for(int i=ch_ascii;i>=65;i--) {
				temp=(char)i;
				System.out.print(temp);
			}
		}
		
		else {
			System.out.print("Forward:"+" ");
			for(int i=ch_ascii;i<=122;i++) {
				temp=(char)i;
				System.out.print(temp);
			}
			System.out.print("\nBackward:"+" ");
			for(int i=ch_ascii;i>=97;i--) {
				temp=(char)i;
				System.out.print(temp);		
			}
		
		}

	}
}
