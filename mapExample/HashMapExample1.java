package mapExample;
import java.util.*;

public class HashMapExample1 {

	public static void main(String[] args) {
		HashMap<Integer,String> obj=new HashMap<Integer,String>();
		obj.put(30,"Hi I Amar");
		obj.put(29, null);
		obj.put(27,"nitin");
		obj.put(28,"Nitesh");
		obj.put(25, null);
		Set<Map.Entry<Integer,String>> me=obj.entrySet();
		for(Map.Entry<Integer,String> o:me)
		{
			System.out.println("ID:"+o.getKey()+"\nValue:"+o.getValue());
		}

	}

}
