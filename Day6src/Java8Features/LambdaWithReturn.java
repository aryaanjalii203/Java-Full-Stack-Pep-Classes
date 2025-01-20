package Java8Features;

@FunctionalInterface 
interface Test7{
	public String display();
}

public class LambdaWithReturn {

	public static void main(String[] args) {
		Test7 t=()-> "My name is Anjali Arya!!!";
		System.out.println(t.display());

	}

}
