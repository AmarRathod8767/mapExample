package mapExample;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {

	    public static void main(String[] args) {
	       HashMap<String,String> obj=new HashMap<String,String>();
	       obj.put("rno", "101");
	       obj.put("name","Amar");
	       obj.put("fee", "20000");
	       Set<Map.Entry<String,String>>se=obj.entrySet();
	       for(Map.Entry<String,String>obj1:se)
	       {
	    	   System.out.println("Key "+obj1.getKey()+"value is "+obj1.getValue());
	       }  
	     
	     
	     
	    }
	 

}
