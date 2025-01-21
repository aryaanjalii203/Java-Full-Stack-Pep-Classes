package ReferenceMethod;


//non static reference method

@FunctionalInterface
interface test3{
	public void display();
}



public class InstanceMethodEx {
	public void show() {
		System.out.println("I am bindded with the instance method here!!!!");
	}
	public void getdata() {
		System.out.println("Hello everyone Good Morning Guys!!!!!! Anjali Arya is here and this my insta account @anuarya___   ha ha ha ");
	}
	public void getdata1() {
		System.out.println("here is one more method to implements this method....");
	}

	public static void main(String[] args) {
		InstanceMethodEx t=new InstanceMethodEx();
		test3 t1=t::show;
		test3 t2=t::getdata;
		test3 t3=t::getdata1;//here we are accessing it through object of the class that we have created
		t1.display();
		t2.display();
		t3.display();
		
	}

}
