package day3;

import java.util.Scanner;

class Sports{
	int n;
    String getName(){
        return "Generic Sports";
    }
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has n players in " + getName() );
    }
}

class Soccer extends Sports{
	Scanner sc=new Scanner(System.in);
    @Override
    String getName(){
    	System.out.println("Enter number of players in Soccer:");
    	n=sc.nextInt();
        return "Soccer Class";
    }
    
    void getNumberOfTeamMembers() {
    	System.out.println("Number of players in "+ getName() + " is "+ n );
    }
}

public class Method_Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Soccer obj=new Soccer();
		obj.getNumberOfTeamMembers();

	}

}
