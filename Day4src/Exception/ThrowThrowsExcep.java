package Exception;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ThrowThrowsExcep {
	public static void main(String args[]) {
		
		try {
		Scanner sc=new Scanner(new File("test.txt"));
		
		}catch(FileNotFoundException fe) {
			System.out.println(fe);
		}
	}

}
