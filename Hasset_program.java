package javapackage;
import java.util.Collections;
import java.util.HashSet;
public class Hasset_program {
	public static void main(String[] args) {
	HashSet h1=new HashSet();
	h1.add("vyshu");
	h1.add("abhi");
	//Collections.sort(h1);
	h1.add(null);
	h1.add(null);
	h1.add("vyshu");
	h1.add("abhi");
	h1.add("vyshu");
	h1.add('v');
	h1.add(10);
	h1.add(false);
	h1.add("yshu");
	h1.add("abhi");
	System.out.println(h1);
	}

}
