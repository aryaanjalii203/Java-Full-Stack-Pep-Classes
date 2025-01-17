package Exception;

public class ExceptionHandling2 {

	public static void main(String[] args) {
		System.out.println("Statement1");
		System.out.println("Statement2");
		System.out.println("Statement3");

		try {
			System.out.println(10/0);
		
		}catch(ArithmeticException e) {
			System.out.println(e);
			
		}
		System.out.println("Statement4");
		System.out.println("Statement5");
		System.out.println("Statement6");
		
	}

}
