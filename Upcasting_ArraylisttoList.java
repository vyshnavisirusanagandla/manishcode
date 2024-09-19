package javapackage;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
public class Upcasting_ArraylisttoList {
	public static void main(String[] args) {
		List l1=new ArrayList();
		l1.add("vyshu");
		l1.add(89);
		l1.add('b');
		l1.add("ram");
		System.out.println("Arraylist"+l1);
	Iterator 	k1=l1.iterator();
		while(k1.hasNext())
		{
			System.out.println("hasNext........"+k1.next());
		}
		ListIterator k2=l1.listIterator();
		while(k2.hasNext())
		{
			System.out.println("Farward Iteration-> ."+k2.next());
		}
		while( k2.hasPrevious())
		{
			System.out.println("Backward Iteration -> ."+k2.previous());
		}
		 Set s1=new HashSet();
		 s1.add("ram");
		 s1.add("sita");
		 s1.add("lll");
		 System.out.println(s1);
	Iterator k3	=s1. iterator();
	while(k3.hasNext())
	{
		System.out.println("hasNext  k3........"+k3.next());
	}
//while( k3.hasPreviou\s())
	{
	//System.out.println("hasPrevious   k3........"+k3.previous());
	}
		 }

}
