package Exception;

import java.util.Scanner;
public class FinallyExceExample {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in) ;
			try {
				System.out.println(10/0);
			}catch(NullPointerException e) {
				System.out.println(e);
			}finally {
				System.out.println("I am closing scanner class object");
				s.close();
			}

	}

}
