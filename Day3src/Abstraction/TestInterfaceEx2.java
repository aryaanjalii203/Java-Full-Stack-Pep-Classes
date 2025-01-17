package Abstraction;

interface I5{
public void display();
}

class TestInterfaceI2 implements I5{

public void display(){
System.out.println("I am overridding the methods of Interface I1");
}
}

public class TestInterfaceEx2{
public static void main(String args[]){
TestInterfaceI2 t=new TestInterfaceI2();
t.display();
}}