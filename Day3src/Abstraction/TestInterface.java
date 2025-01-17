package Abstraction;

class TestInterfaceI1 implements I2,I1{//Multiple Inheritance and class TestInterfaceI1 implements I2,I1 will be multilevel inheritance
	

	@Override
	public void show() {
	System.out.println("I am overridding the methods of Interface I2");
	}

	@Override
	public void display() {
		System.out.println("I am overridding the methods of Interface I1");
		
	}
}

public class TestInterface{
	public static void main(String args[]){
TestInterfaceI1 t=new TestInterfaceI1 ();
t.display();
t.show();
}}