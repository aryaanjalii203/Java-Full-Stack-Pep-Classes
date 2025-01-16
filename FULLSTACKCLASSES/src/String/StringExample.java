package String;

public class StringExample {
	public static void main(String args[]) {
		String str1="JaVaScRipT";
		String str2=str1.toLowerCase();
		int count=0;
		for(int i=0;i<str2.length();i++) {
			if(str2.charAt(i)=='a'||str2.charAt(i)=='e'||str2.charAt(i)=='i'||str2.charAt(i)=='o'||str2.charAt(i)=='u') {
				count++;
			}
		}
		System.out.println("Number of vowels in Strin2:"+count);
	}

}
 