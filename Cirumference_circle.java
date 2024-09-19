package javapackage;

public class Cirumference_circle
{
	final static double pi=3.14;//global variable
	 final static int r=8;//y static,if we remove it  y error is cmg
  static void circlearea()
  {
	  double formula=pi*r*r;
	  System.out.println( formula);
  }
	 static void circlecircumference() 
	{
	//	int r=2;
	  double formula=2*pi*r;
	System.out.println(formula);
	}

	public static void main(String[] args)
	{
		circlecircumference();
		 circlearea();
		
	}

}
