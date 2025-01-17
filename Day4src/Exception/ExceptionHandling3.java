package Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionHandling3 {

	public static void main(String[] args) {
		System.out.println("Statement1");
		System.out.println("Statement2");
		System.out.println("Statement3");

		try {
			Scanner sc=new Scanner(new File("/xyz.txt"));
			
		}catch(ArithmeticException e) {
			System.out.println(e);
			
		}catch(NullPointerException e) {
			System.out.println(e);
		}catch(FileNotFoundException e) {
			System.out.println(e);
		}
		
		System.out.println("Statement4");
		System.out.println("Statement5");
		System.out.println("Statement6");
		
	}

}
