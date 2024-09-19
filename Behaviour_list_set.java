package javapackage;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
public class Behaviour_list_set {
	public static void main(String[] args) {
		System.out.println("Arraylist to list");
		List i1=new ArrayList();
		i1.add("one");
		i1.add("two");
		i1.add("three");
		System.out.println(i1);
		Iterator k1=i1.iterator();
	while(	k1.hasNext())
	{
		System.out.println("iterator"+k1.next());
	}
	ListIterator k2=i1.listIterator();
	while(	k2.hasNext())
	{
		System.out.println("Listiterator...."+k2.next());
	}
	while(	k2.hasPrevious())
	{
		System.out.println("Listiterator...."+k2.previous());
	}
	//LinkedList to list
	List link1=new LinkedList();
	link1.add("linked");
	link1.add("list");
	System.out.println("linkedlist....."+link1);
	Iterator m2=link1.iterator();
	while(m2.hasNext())
	{
		System.out.println("linkedlist"+m2.next());
	}
	ListIterator v1=link1.listIterator();
	while(v1.hasNext())
	{
		System.out.println("linkedlist"+v1.next());
	}
	while(v1.hasPrevious())
	{
		System.out.println("linkedlist"+v1.previous());
	}
			
	Set s1	 =new HashSet();
	s1.add("vvv");
	s1.add("bbb");
	s1.add(null);
	s1.add(null);
	System.out.println(s1);
	Iterator i2=s1.iterator();
	while(i2.hasNext())
	{
		System.out.println("set...."+i2.next());
	}
	
	}

}
