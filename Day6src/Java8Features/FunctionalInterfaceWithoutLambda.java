package Java8Features;

@FunctionalInterface  //it is mandatory
interface Test{
	public void display();
}

public class FunctionalInterfaceWithoutLambda {

	public static void main(String[] args) {
		Test t=new Test() {

			@Override
			public void display() {
				System.out.println("I am implemented here");
			}
		};
		t.display();
	}
}
