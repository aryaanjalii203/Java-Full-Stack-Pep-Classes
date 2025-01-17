package Exception;

public class ExceptionHandling {

	public static void main(String[] args) {
		System.out.println("Statement1");
		System.out.println("Statement2");
		System.out.println("Statement3");

		try {
			String str=null;
			System.out.println(str.length());
			
		}catch(ArithmeticException e) {
			System.out.println(e);
			
		}catch(NullPointerException e) {
			System.out.println(e);
		}
		System.out.println("Statement4");
		System.out.println("Statement5");
		System.out.println("Statement6");
		
	}

}
