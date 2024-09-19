package javapackage;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
public class TreeMap_Map {
	public static void main(String[] args) {
	Map<String,String> m1=new TreeMap<String,String>();
		m1.put("vyshu","tester");
	m1.put("vamshi", "sap dev");
	m1.put("ram","data analyst");
	m1.put("ram","data analyst");
	m1.put("ramu", "sap dev");
	//m1.put(null, null);
	//m1.put(null, null);
	Iterator<Entry<String,String>> i1=m1.entrySet().iterator();
	while(i1.hasNext())
	{
		System.out.println(i1.next());
	}

	}

}
