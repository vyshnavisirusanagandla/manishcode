package javapackage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;
public class RandomArrayList {
	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add("ram");;
		a1.add("sita");
		a1.add("laxman");
		a1.add('v');
		a1.add(11);
		System.out.println("a1 is -> "+a1);
		
		ListIterator i2=			a1.listIterator();
						
		while(i2.hasNext())
		{
			System.out.println("farward iteartion-> "+i2.next());
		}
		while(i2.hasPrevious())
		{
			System.out.println("backward iteartion-> "+i2.previous());
		}
/*		Iterator i1=			a1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	*/	
		
	}
}
