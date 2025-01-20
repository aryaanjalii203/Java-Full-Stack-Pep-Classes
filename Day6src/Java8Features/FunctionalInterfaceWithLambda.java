package Java8Features;

@FunctionalInterface 
interface Test4{
	public void display();
}

public class FunctionalInterfaceWithLambda {

	public static void main(String[] args) {
		Test4 t1=()->{System.out.println("I am implemented here with the lambda expression");};
		t1.display();
		System.out.println("------------------------");
	}

}
