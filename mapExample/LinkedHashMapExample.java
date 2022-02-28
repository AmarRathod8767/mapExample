package mapExample;
import java.util.*;
public class LinkedHashMapExample {

	public static void main(String[] args) {
		LinkedHashMap<String,String> obj=new LinkedHashMap<String,String>();
		obj.put("b","ams");
		obj.put("e","vdv");
		obj.put("c","vd");
		obj.put("d","amdsds");
		obj.put("a","bdams");
		Set<Map.Entry<String,String>> sd=obj.entrySet();
		for(Map.Entry<String,String> o:sd)
		{
			System.out.println("key is "+o.getKey()+" value "+o.getValue());
		}

	}

}
