package MapsEx;

import java.util.HashMap;
import java.util.Map;
public class HashMapEX1 {

	public static void main(String[] args) {
		HashMap<Integer, String> hm=new HashMap<Integer,String>();//Key value pair is there;
		hm.put(101,"Sanjay Kumar");
		hm.put(102,"Anjali Arya");
		hm.put(103,"Gurmeet Arya");
		hm.put(104,"Abhishek gola");
		hm.put(105,"Radhika Arya");
		hm.put(106,"Veerwati Arya");
		for(Map.Entry en:hm.entrySet()){
			System.out.println(en.getKey()+" "+en.getValue());
		}
	}

}
