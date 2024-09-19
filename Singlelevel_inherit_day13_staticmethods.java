package javapackage;
class Parent
{
	static void house()
	{
		System.out.println("parent class house");		
	}
}
public class Singlelevel_inherit_day13_staticmethods extends Parent{
     static	void laptop()
     {
    	 System.out.println("child class laptop");
     }

	public static void main(String[] args){
house();
laptop();
	}
}
