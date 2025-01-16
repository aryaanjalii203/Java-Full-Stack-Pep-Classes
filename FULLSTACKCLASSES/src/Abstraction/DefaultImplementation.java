package Abstraction;

class TestDefault implements I4{

	@Override
	public void show() {
		System.out.println("I am abstract show method from interface");
		
	}
	
}

public class DefaultImplementation {

	public static void main(String[] args) {
		TestDefault td=new TestDefault();
		td.display();
		td.show();
		I4.getdata(10);
	}

}
