package javapackage;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Enumeration_class {
	public static void main(String[] args) {
	Vector v=new Vector();
	v.add("vyshnavi");
	v.add(10);
	v.add("neha");
	v.add("swati");
	System.out.println(v);
	Iterator i1=  v. iterator();
	while(i1.hasNext())
	{
System.out.println(("iterator op..............."+i1.next()));
	}
	
	Enumeration e=v.elements();
	while(e.hasMoreElements())
	{
System.out.println(e.nextElement());
	}
	}
}
