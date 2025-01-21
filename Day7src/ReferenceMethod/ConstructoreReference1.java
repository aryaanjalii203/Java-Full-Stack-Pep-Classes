package ReferenceMethod;

//Functional Interface Method

@FunctionalInterface

interface Test8{
	public void display(String msg);
}

public class ConstructoreReference1 {
	ConstructoreReference1(String msg){
		System.out.println(msg);
	}

	public static void main(String[] args) {
		Test8 t=ConstructoreReference1::new;
		t.display("We are learning Java here!!!!");

	}

}
