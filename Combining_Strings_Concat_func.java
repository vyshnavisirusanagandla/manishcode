package javapackage;

import java.util.Arrays;

public class Combining_Strings_Concat_func {
	public static void main(String[] args) {
		
String fname="vyshnavi welcome to java programing";
String lname="s";
String s[]=fname.split("v");
                System.out.println( fname.concat(" ").concat(lname));
                System.out.println(Arrays.toString(s));
	}

}
