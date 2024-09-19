package javapackage;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
public class Map_interface {
	public static void main(String[] args) {
		//common way to do upcasting from HashMap to Map
		Map m1=new HashMap();
		m1.put("vyshu", 10);
		m1.put(11, "bbb");
		m1.put(10, 19);
		System.out.println(m1);
	// OUTPUT {vyshu=10, 10=19, 11=bbb}
		
		Map<String,Integer> m2=new HashMap<String,Integer>(); //Recomended way to do 
		m2.put("ram", 10);                                                             //put() to add the elements
		m2.put("sita",68);
		m2.put("lakshman", 19);
		System.out.println(m2);

		m2.putIfAbsent("vamshi",25);                                           // putIfAbsent(key,value) will add this key and value if it is not existed
		m2.putIfAbsent("lakshman", 19);                                      // Duplicate values not allowed
		System.out.println(m2);
		

		Map<String,Integer> m3=new HashMap<String,Integer>(); 
		m3.put("vvv", 10);                                                            
		m3.put("ccc",68);
		m3.put("mmm", 19);
		System.out.println(m3);
      System.out.println ( m3.containsKey("nnn"));                         // gives true or false if key is present    
      System.out.println(m3.containsValue(10));                            //gives true or false if value is present  
   
   m3.putAll(m2);
   System.out.println(m3);
   m3.replace("vvv", 10,44);
   System.out.println(m3);
 //  m3.equals(m2);
   System.out.println(m3.equals(m2));                                          //equals()  .....checks if both are equal
   System.out.println(m3.keySet());                                              //keySet() ......gives only keys ass output
   System.out.println(m3.values());                                               //values().........gives only values as output
      
	System.out.println(m3.entrySet());                                           //enterySet().....gives both keys and values
	
		m3.remove("vvv",44);                                                          // remove().....delete that particular given key,value
		System.out.println(m3);
		
		for(String key: m3.keySet())
		{
			System.out.println("only key values"+key);
		}
		for(Integer value:m3.values())
		{
			System.out.println("values only"+value);
		}
		for(Entry<String,Integer>keyvalue:m3.entrySet())
		{
			System.out.println("............"+keyvalue);
			
		}
	}

}
