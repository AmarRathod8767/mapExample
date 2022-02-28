package mapExample;
import java.util.*;

public class HashTableExample {

	public static void main(String[] args) {
		Hashtable<String,String> obj=new Hashtable<String,String>();
		obj.put("b","E");
		obj.put("e","A");
		obj.put("c","B");
		obj.put("d","C");
		obj.put("a","D");
		Set<Map.Entry<String,String>> st=obj.entrySet();
		for(Map.Entry<String,String>o:st)
		{
			System.out.println("Key "+o.getKey()+" value "+o.getValue());
		}

	}

}
