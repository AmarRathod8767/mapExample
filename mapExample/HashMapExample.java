package mapExample;
import java.util.*;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HashMap<String,String> obj=new HashMap<String,String>();
        obj.put("E","java");
        obj.put("D","Adv.JAVA");
        obj.put("A","c++");
        obj.put("C","Paython");
        obj.put("B","Nitin");
        //obj.put(null, null);
        Set<Map.Entry<String,String>>se=obj.entrySet();
        for(Map.Entry<String,String>me:se)
        	
        {
        	System.out.println("Key is "+me.getKey()+" Value is "+me.getValue());
        }
	}

}
