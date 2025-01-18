package Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ThrowsExample {
	
	public static void show() throws FileNotFoundException{
		Scanner sc=new Scanner(new File("C:\\Users\\Dell\\eclipse-workspace\\Day5\\src\\Exceptions\\test2.txt"));
		while(sc.hasNext()) {
			System.out.println(sc.nextLine());
		}
		}
	
	
	

	public static void main(String args[]) {
		try {
			show();
		}catch (FileNotFoundException e) {
			System.out.println(e);
		}
	}
}
