package javapackage;
import java.util.Collections;
import java.util.LinkedHashSet;
public class LinkedHashSet_1 {
	public static void main(String[] args) {
		LinkedHashSet l2=new LinkedHashSet();
		l2.add("vyshu");
		l2.add("vyshu");
		l2.add("abhi");
		l2.add("bhim");
		l2.add("vyshu");		
		l2.add("vyshu");
		l2.add(11);
	//	Collections.sort(l2);
		l2.add(null);
		l2.add(null);
		System.out.println(l2);

	}

}
