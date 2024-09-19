package javapackage;
public class String_methods{
public static void main(String[] args){
		String name1="School name is vidhya";
	String name2="             vyshnavi        S";
	String name3="school name is vidhya";
System.out.println(name1.length());
		System.out.println(name1.toUpperCase());
	
		System.out.println(name1.toLowerCase());
		System.out.println(name1.indexOf('c'));
		System.out.println(name1.charAt(7));
		System.out.println("before trime"+name2);
		System.out.println(name2.trim());
		System.out.println(name1.equals(name3));
		System.out.println(name1.equalsIgnoreCase(name3));
		System.out.println(name1.contains("School"));
		System.out.println(name1.substring(3));//creates string from that given index
		System.out.println(name1.substring(0,6));
		System.out.println(name1.substring(7,11));
		System.out.println(name1.substring(12,14));
		System.out.println(name1.substring(15,21));
		

	}

}
