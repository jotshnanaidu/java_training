package day5;

import java.io.File;
import java.io.FileNotFoundException;
//import java.io.FileWriter;
import java.util.Scanner;

public class File_Operations {

	public static void main(String[] args)throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		try {
			
			File file =new File("C:\\Users\\hp\\Desktop\\abc.txt");
			Scanner scan = new Scanner(file);
//			String content="";
			while(scan.hasNextLine()) {
//				content=content.concat(scan.nextLine() + "\n");
				System.out.println(scan.nextLine());
			}
//			FileWriter writer=new FileWriter("C:\\Users\\hp\\Desktop\\xyz.txt");
//			writer.write(content);
//			writer.close();
		}
		catch(Exception e) {
			System.out.println(e.getStackTrace());
		}

	}

}
