package javapackage;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
public class MapInterface_LinkedHashMap_Map {
	public static void main(String[] args) {
	HashMap<String,String> m1=new LinkedHashMap<String,String>();
	m1.put("vyshu","tester");
	m1.put("vamshi", "sap dev");
	m1.put("ram","data analyst");
	System.out.println(m1);
	Iterator<Entry<String, String>> i1=m1.entrySet().iterator();
while(i1.hasNext())
{
	System.out.println(i1.next());
}
	}

}
