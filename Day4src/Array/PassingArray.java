package Array;

public class PassingArray {
	public static void getArray(int a[]) {
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(max<a[i]) {
				max=a[i];
			}
		}
		System.out.println("Maximum element is: "+max);
	}

	public static void main(String[] args) {
	int[]b= {12,45,56,2,6};
	getArray(b);
	//getArray(new int {12,45,56,2,3})

	}

}
