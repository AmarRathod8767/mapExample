package mapExample;

import java.util.*;

public class TreeMapExample {

	public static void main(String[] args) {
		
		TreeMap<String,String>obj=new TreeMap<String,String>();
		obj.put("W","a");
		obj.put("V","c");
		obj.put("Y","b");
		obj.put("X", "e");
		obj.put("Z",null);
		Set<Map.Entry<String,String>> oo=obj.entrySet();
		for(Map.Entry<String,String> o:oo)
		{
			System.out.println("Key is "+o.getKey()+" Value is "+o.getValue());
		}

	}

}
