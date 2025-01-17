package Abstraction;

public interface I4 {
	void show();
	default void display() { //Default Method in Interface
		System.out.println("I am default Method");
		showdata(100);
	}
	static void getdata(int a) { //Static Method in Interface
		System.out.println("Value of a is: "+a);
	}
	private void showdata(int b) { //Private Method in Interface
		System.out.println("Value of b is: "+b); // you can not call private method in other class or interface
		//so we are calling it in display method in the same class...
		
	}
	
}
