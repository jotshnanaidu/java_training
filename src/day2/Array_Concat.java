package day2;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Concat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the two arrays:");
		int arr_len_1 = sc.nextInt();
		int arr_len_2 = sc.nextInt();
		int[] arr1 = new int[arr_len_1];
		int[] arr2 = new int[arr_len_2];
		int[] arr3 = new int[arr_len_1 + arr_len_2];
		int n = arr_len_1 + arr_len_2;
		String str1_union = "", str2_intersec = "";
		System.out.println("Enter first array elememts:");
		int k = 0;
		for (int i = 0; i < arr_len_1; i++) {
			arr1[i] = sc.nextInt();
			arr3[k] = arr1[i];
			k++;
		}
		System.out.println("Enter second array elememts:");
		for (int i = 0; i < arr_len_2; i++) {
			arr2[i] = sc.nextInt();
			arr3[k] = arr2[i];
			k++;
		}
		Arrays.sort(arr3);
		
		for (int i = 0; i < n - 1; i++) {
			if (arr3[i] != arr3[i + 1]) {
				
				str1_union=str1_union+arr3[i]+" ";

			} else {
				str2_intersec=str2_intersec+arr3[i]+" ";
			}
		}
		System.out.println("Union of both the arays" + " " + str1_union + " " + arr3[n-1]);
		System.out.println("Intersection of both the arrays" + " "+ str2_intersec);
	}

}
