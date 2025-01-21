package ReferenceMethod;

//static reference method 

@FunctionalInterface
interface Testt{
	public void display();
}


public class ReferenceMethodEx1 {
	public static void show() {
		System.out.println("I am implemented through show method in static way");
	}
	public static void get() {
		System.out.println("I am Anjali Arya here!!!!!!!!");
	}
	public static void getdata() {
		System.out.println("here is one more method to implements this method....");
	}
	public static void main(String[] args) {
		Testt t=ReferenceMethodEx1::show;//binding class'methods and interface's methods 
		Testt t1=ReferenceMethodEx1::get;
		Testt t2=ReferenceMethodEx1::getdata;//here we are referring multiple methods through display which is in interface 
		t.display();
		t1.display();
		t2.display();
	}

}
