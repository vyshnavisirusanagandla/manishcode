package javapackage;
import java.util.Collections;
import java.util.LinkedList;
public class Linkedlist_checking {
	public static void main(String[] args) {
		LinkedList l1=new Linkedlist();
		l1.add("vyshu");
		l1.add("ayshu1");
		l1.add("byshu2");
		l1.add("cyshu3");
		l1.add("vdshu4");
		l1.add("shu5");
		Collections.sort(l1);
		
		l1.add(11);
		l1.add('c');
		l1.add(11);
		l1.add(null);
		l1.add(null);
		l1.add("vyshu");
		l1.add(11);
		l1.add('c');
		l1.add(11);
		l1.add(null);
		l1.add(null);
		l1.add("vyshu");
		l1.add(11);
		l1.add('c');
		l1.add(11);
		l1.add(null);
		l1.add(null);
		System.out.println(l1);
	

	}

}
