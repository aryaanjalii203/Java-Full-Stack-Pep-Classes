package Exception;

public class NestedTry {
	public static void main(String args[]) {
		try { //outter try
			try {//inner try
				System.out.println(10/0);
				
			}catch(ArithmeticException e) {
				System.out.println(e);}
				
			
			System.out.println("I am after Arithmetic Exception");
			String str=null;
			System.out.println("Length of the String:"+str.length());
			}catch(NullPointerException npe) {
				System.out.println(npe);
			}
		
		
		System.out.println("This is the end of the code here...");

		
	} 
}
