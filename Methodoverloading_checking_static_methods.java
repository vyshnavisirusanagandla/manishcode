package javapackage;
class Methover_parent{
	static void login()
	{
		System.out.println("checking if static methods are called in method overriding concept");
	}
}
public class Methodoverloading_checking_static_methods extends Methover_parent{
static void login()
{
	System.out.println("child class");
}
	public static void main(String[] args)
	{	
 login();
}

}
