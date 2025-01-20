package ClassLists;

import java.util.LinkedHashMap;
import java.util.Map;
public class LinkedHashMapEX1 {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> hm=new LinkedHashMap<Integer,String>();//it will maintain insertion order
		hm.put(101,"Sanjay Kumar");
		hm.put(102,"Anjali Arya");
		hm.put(103,"Gurmeet Arya");
		hm.put(104,"Abhishek gola");
		hm.put(105,"Radhika Arya");
		hm.put(106,"Veerwati Arya");
		hm.put(null, null);
		hm.put(null, null);// null key and value is once allowed 
		for(Map.Entry en:hm.entrySet()){
			System.out.println(en.getKey()+" "+en.getValue());
		}
	}

}
