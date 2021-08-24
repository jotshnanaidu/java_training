package day3;

import java.util.ArrayList;
import java.util.Collections;
import java.lang.reflect.Method;

class Student {
	private String name;
	private String id;
	private String email;

	public String getName() {
		return name;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void anothermethod() {
		System.out.println("Hello");
	}
	public void zmethod() {
		System.out.println("Hii");
	}
}

public class Reflection_Method {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Student ob = new Student();
		Class student = new Student().getClass();
		Method[] methods = student.getDeclaredMethods();

		ArrayList<String> methodList = new ArrayList<>();
		for (Method method : methods) {
			methodList.add(method.getName());
		}
		Collections.sort(methodList);
		for (String name : methodList) {
			System.out.println(name);
		}

	}
}