package MapsEx;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
public class TreeMapEX1 {

	public static void main(String[] args) {
		TreeMap<Integer, String> hm=new TreeMap<Integer,String>();//Key value pair is there;
		hm.put(108,"Sanjay Kumar");
		hm.put(102,"Anjali Arya");
		hm.put(103,"Gurmeet Arya");
		hm.put(104,"Abhishek gola");
		hm.put(105,"Radhika Arya");
		hm.put(106,"Veerwati Arya"); 
		hm.put(107, null);//key shouldn't be null
		for(Map.Entry en:hm.entrySet()){
			System.out.println(en.getKey()+" "+en.getValue());//according to your key it provide sorted output 
		}
	}

}
