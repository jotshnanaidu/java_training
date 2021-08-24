package day1;

import java.util.Scanner;

public class Triangle_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of level:");
		int level=sc.nextInt();
		char c;
		for(int i=0;i<level;++i) {
			c='A';
			for(int j=i;j<level-1;++j) {
				System.out.print(" ");
			}
			for(int k=0;k<=i;++k) {
				System.out.print(c+" ");
				++c;
			}
			System.out.println();			
		}
	}

}
