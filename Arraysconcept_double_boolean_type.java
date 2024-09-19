package javapackage;
import java.util.Arrays;
import java.util.Scanner;
public class Arraysconcept_double_boolean_type {
	public static void main(String[] args) {
		double numb1[]=new double[3];
		boolean n2[]=new boolean[3];
		Scanner s1=new Scanner(System.in);
		for(double i=0;i<=2;i++)
		{
System.out.println("enter double value for "+i);	
numb1[i]=s1.nextDouble();
		}
		System.out.println(Arrays.toString(numb1));
	}

		for(boolean i=0;i<=2;i++)
		{
System.out.println("enter double value for "+i);	
n2[i]=s1.nextBoolean();
		}
		System.out.println(Arrays.toString(n2));
	}
}
}
