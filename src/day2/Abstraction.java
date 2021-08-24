package day2;

import java.util.Scanner;

abstract class Animal{
	
	String name;
	abstract void sound();
	
}
class Dog extends Animal{

	@Override
	void sound() {

		System.out.println("Dog sounds bow bow!!");
		
	}
	void dog_name(String str) {
		name=str;
		System.out.println("Name of the dog : "+ name);
	}

}
public class Abstraction {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Dog obj=new Dog();
		System.out.println("Enter name of the Dog:");
		String str=sc.next();
		obj.dog_name(str);
		obj.sound();		

	}

}
