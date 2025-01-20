package Java8Features;

@FunctionalInterface 
interface Test5{
	public void display(int n);
}

public class LambdaSingleParameter {

	public static void main(String[] args) {
		Test5 t=n->{System.out.println(n*n);}; //we have single parameter so don't need of curly brackets...
		t.display(99);
		t.display(2);
		t.display(56);
		t.display(12);

	}

}
