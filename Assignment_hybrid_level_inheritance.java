package javapackage;
class grandparent extends  Assignment16_hybrid_demo
{
	static void display()
	{
		System.out.println("grand parent is invoked");
	}
}
class parent extends grandparent
{
	static void show()
	{
		System.out.println(" show() parent class,method is called");
	}
}
class hybrid extends parent{
	static void login2()
	{
	System.out.println(" login2()hybrid level inheritance");
}
	}
public class Assignment_hybrid_level_inheritance extends Assignment16_hybrid_demo
{
static void show1()
{
	System.out.println(" show1 methodchild class");
}
public static void main(String[] args)
	{
         //show();
		show1();
		// display();
		login();
//login2();
	}
}
