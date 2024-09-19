package javapackage;
import java.util.ArrayList;
import java.util.Collections;
public class Newclass {
	static void sorting_method()
	{
		ArrayList a1=new ArrayList();
		//add(Object )
		a1.add(11);
		a1.add(1);
		a1.add(10);                  
		a1.add(88);
		Collections.sort(a1);//Math.addexact, Thread.sleep , 
		System.out.println(a1);
	}
	
	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		//add(Object )
		a1.add("Ram");
		a1.add("Vamshi");
		a1.add("Arbind");                  
		a1.add("Ashwath");
		Collections.sort(a1);
		System.out.println(a1);
		sorting_method();
	}

}
//nextint();