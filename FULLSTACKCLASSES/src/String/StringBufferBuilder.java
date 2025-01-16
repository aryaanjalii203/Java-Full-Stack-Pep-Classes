package String;

public class StringBufferBuilder {

	public static void main(String[] args) {
		StringBuffer s1=new StringBuffer("Hiii");
		StringBuilder s2=new StringBuilder("hello guys...");
		System.out.println(s1.capacity());
		System.out.println(s2.capacity());
		System.out.println(s1.length());
		System.out.println(s2.append("I am Anjali"));
		System.out.println(s1.reverse());
		System.out.println(s1.indexOf("H"));

	}

}
