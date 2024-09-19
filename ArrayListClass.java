package javapackage;
import java.util.ArrayList;
public class ArrayListClass 
{
public static void main(String[] args) 
{
	ArrayList a1=new ArrayList();
	a1.add("ram");;
	a1.add("sita");
	a1.add("laxman");
	System.out.println("a1 is -> "+a1);
	ArrayList a2=new ArrayList();
	a2.addAll(a1);
	a2.add("vamshi");
	a2.add("vishal");
	System.out.println("a2 is -> "+a2);
	
	a1.add(1, "ashwini");
	System.out.println("a1 is -> "+a1);
	
	a2.remove("laxman");
	System.out.println("a2 is -> "+a2);
	System.out.println(	a2.contains("vamshi"));
	
	a2.removeAll(a1);
	System.out.println("a2 is -> "+a2);
	
	System.out.println(	a2.size());
	System.out.println(	a1.size());
	System.out.println(a1.isEmpty());
	
	
}
}
