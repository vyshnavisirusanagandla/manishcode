package javapackage;
import java.util.Arrays;
import java.util.Scanner;
public class Exceptionhandling_and_input_Scannerclass {
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		//name[2]=s1.next();
String name[]=new String[3];

name[0]="name1";
name[1]="name2";
name[2]="name3";
System.out.println("enter the name4");
try
{
name[3]=s1.next();
System.out.println(Arrays.toString(name));
}
catch(ArrayIndexOutOfBoundsException a)
{
	System.out.println("handled ArrayIndexOutOfBoundsException");
}
	}
}
