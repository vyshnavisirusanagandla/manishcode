package javapackage;
public class Area_of_the_circle{
static final  double pi=3.14;
	 static int r=20;
	static void circlearea()
	{
		double circlearea=pi*r*r;
		System.out.println("area of the circle"+circlearea);
	}
	static void circlecircumference()
	{
		double circlecircumference=2*pi*r;
		System.out.println("area of the circle"+circlecircumference);
	}
	public static void main(String[] args){
		circlearea();
		circlecircumference();
	}
}
