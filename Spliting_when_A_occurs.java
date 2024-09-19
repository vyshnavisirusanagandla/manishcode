package javapackage;

import java.util.Arrays;

public class Spliting_when_A_occurs {

	public static void main(String[] args) {
		String name="helao this is a split function in a string concept,";
		System.out.println(name); 
		String[] n1=name.split( "a",2);
		System.out.println(Arrays.toString(n1));
	}

}
