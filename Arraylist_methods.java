package javapackage;

import java.util.ArrayList;

public class Arraylist_methods {
	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add("vyshu");
		//a1.add('c');
		a1.add("vamshi");
		a1.add("viyu");
		//a1.add(13);
		//a1.add(null);
		System.out.println(a1);
		ArrayList a2=new ArrayList();
		//a2.addAll(a1);
a2.add("ram");
a2.add("lakshman");
a2.add("sita");
a2.add(1,"hanuman");
ArrayList a3=new ArrayList();
a3.add("kkk");
a3.add("mmmm");
//System.out.println(a3);
a3.add("fff");
a3.remove("mmmm");
System.out.println(a3);
a2.addAll(3,a3);
a1.addAll(1,a3);
a2.addAll(a1);
a3.remove(0);
a2.removeAll(a3);
System.out.println(a3.contains("fff"));
System.out.println(a2.containsAll(a1));
System.out.println(a2);
System.out.println(a3);
System.out.println(a3.isEmpty());
System.out.println(a3.size());

	}

}
