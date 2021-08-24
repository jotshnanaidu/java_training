package day3;

import java.util.Scanner;

class Dog{
	String dog_name;
	void name() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the name of the dog:");
		dog_name=sc.next();
		System.out.println("Name of the dog is "+ dog_name);
		
	}
	void name(String str) {
		
		System.out.println("Name of the dog is "+ str);
		
	}
	void name(String str,String str2) {
		
		System.out.println("Name of the dog is "+ str + " Another name of the dog is "+ str2);
		
	}
	
}

public class Method_Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog obj=new Dog();
		obj.name("Puppy","Tommy");
		System.out.println("\nAnother method with different number of arguments");
		obj.name("Snoopy");
		System.out.println("\nAnother method with different number of arguments");
		obj.name();

	}

}
