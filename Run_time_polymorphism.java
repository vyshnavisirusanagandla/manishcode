package javapackage;
class Mother
{
	void add()
	{
		System.out.println("add parent");
	}
}
public class Run_time_polymorphism extends Mother
{
	void add()
	{
		System.out.println(" child");//only the child class implementation is coming
	}
	public static void main(String[] args) {
		
		Run_time_polymorphism r1=new Run_time_polymorphism();
		r1.add();
		Mother m1=new Mother();
		m1.add();
	}

}
