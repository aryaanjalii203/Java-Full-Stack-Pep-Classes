package Final;


abstract class TestFinalMethod{
	//final int a=100;
	//a=500; we can't write as a id fixed
	
	abstract void show();
	final void display() {
		System.out.println("I am final method from abstract class");
	}
}

class GetFinalMethod extends TestFinalMethod{//Error when TestFinalMethod class would be "final"

	@Override
	void show() {
		System.out.println("I am abstract method from abstract class");
		
	}
	
}


public class TestFinal {
public static void main(String args[]) {
	 TestFinalMethod t= new GetFinalMethod();
	 t.display();
	 t.show();
	 
	 
}
}
