package Abstraction;

public class BankImplementation {
	public static void main (String args[]) {
		SBI s=new SBI();
		HDFC h=new HDFC();
		System.out.println("Rate of interest for SBI "+s.getRateOfInterest());
		System.out.println("Rate of interest for HDFC "+h.getRateOfInterest());
}

}
