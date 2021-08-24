package day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayList_Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number of lines:");
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.nextLine();
        ArrayList<ArrayList<String>> a = new ArrayList<ArrayList<String>>(n);
        System.out.println("Enter n lines:");
        for (int i = 0; i < n; i++) {
            s = sc.nextLine();
            a.add(i, new ArrayList<String>(Arrays.asList(s.split("\\s"))));
        }

        System.out.println("Enter number of queries:");
        int m = sc.nextInt();
        ArrayList<String> output=new ArrayList<>();
        System.out.println("Enter each query:");
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (x <= a.size() && y < a.get(x-1).size() && y >= 0) {
                output.add(a.get(x-1).get(y));
            } else {
                output.add("ERROR!");
            }
		}
        for(String i : output) {
        	System.out.println(i);
        }
	}
}
