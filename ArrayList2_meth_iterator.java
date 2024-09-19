package javapackage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;
public class ArrayList2_meth_iterator {
	public static void main(String[] args) {
		ArrayList a1=new  ArrayList();
		a1.add("vvv");
		a1.add("hhh");
		a1.add("ppp");
		System.out.println(a1);
		//3 lines along with while loop
		Iterator i1=	a1.iterator();
		while(i1.hasNext())
		{
		System.out.println(i1.next());
	}
		//till here
		//new concept ListIterator
	ListIterator i2	=a1.listIterator();
	while(i2.hasNext())
	{
		System.out.println(i2.next());
		
	}
	while(i2.hasPrevious())
	{
		System.out.println(i2.previous());
}
}
}
