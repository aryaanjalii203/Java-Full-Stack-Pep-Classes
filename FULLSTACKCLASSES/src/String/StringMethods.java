package String;

public class StringMethods {

	public static void main(String[] args) {
		String str1="lpu";
		String str2="LPU";
		String str3=new String(" Welcome to LPU ");
		System.out.println(str1+" "+str2+" "+str3);
		//Comparison
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		System.out.println(str1.compareTo(str2)); //As both strings are of same length
		System.out.println(str3.compareTo(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		System.out.println(str1.startsWith("l"));
		System.out.println(str1.endsWith("l"));
		//Conversion
		System.out.println(str1.toUpperCase());
		System.out.println(str1.toLowerCase());
		
		System.out.println(str3.length());
		System.out.println(str3.replace("o","a"));
		System.out.println(str3.replaceAll("co","a"));
		
		System.out.println(str3.trim());
		System.out.println(str3.substring(7,11));
	}
}