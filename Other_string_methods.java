package javapackage;
public class Other_string_methods{
public static void main(String[] args){
	String a="vyshnavi";
	String b="Manish kumar tiwari";
	String c="tom";
	System.out.println(a.isEmpty());
	System.out.println(a.lastIndexOf('v'));
	 String new1=a.replace('v', 'a');
		System.out.println(new1);
		String n3=a.replaceAll("sh","ram");
		System.out.println(n3);
		System.out.println(b);
		System.out.println(b.matches("(.*)i"));
		System.out.println(b.matches("M(.*)"));
		System.out.println(b.matches("(.*)k(.*)"));
		System.out.println(c.matches("..."));
	}

}
