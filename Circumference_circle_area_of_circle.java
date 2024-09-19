package javapackage;

public class Circumference_circle_area_of_circle
{
	final static double pi=3.14;   //global variable
	static  void circlearea()
		{
			int r=2;
		//	double pi=2;changed the pi value ..it is changing should not change becz we made it as final variable
			 double circle_area=pi*r*r;
			 System.out.println(circle_area);
		}
		
		
		

	public static void main(String[] args) 
	{
		

		circlearea();
	}

}
