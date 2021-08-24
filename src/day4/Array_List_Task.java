package day4;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_List_Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter number of lines:");
	    int total=scan.nextInt();

	    ArrayList<ArrayList<String>> mainlist=new ArrayList<>();
	    
	    System.out.println("Enter n lines:");
	    for(int i=0;i<total;i++)
	    {
	     int size=scan.nextInt();
	     ArrayList<String> list=new ArrayList<String>();

	     for(int j=0;j<size;j++)
	       {
	          String item=scan.next();
	          list.add(item);
	       }
	      mainlist.add(list);
	   }
	    
	    System.out.println("Enter number of queries:");
	    int totalprint=scan.nextInt();
	    ArrayList<String> output=new ArrayList<String>();
	    System.out.println("Enter each query:");
	    for(int k=0;k<totalprint;k++)
	    {
	      int row=scan.nextInt();
	      int col=scan.nextInt();
	      try
	       {
	       output.add(mainlist.get(row-1).get(col-1));
	       }
	      catch(Exception e)
	      {
	      output.add("ERROR!");
	      }
	    }
	    scan.close();
	}

}
