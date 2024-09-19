package javapackage;
class Methoverriding_parent
{
	void login()
	{
		System.out.println("parent method phone number,pswd");
	}
}
public class Method_overriding extends Methoverriding_parent
{
	void login()
	{
	super.login();
	System.out.println("child method phone number,pswd");
	}

	public static void main(String[] args)
	{
		
		Method_overriding m1=new Method_overriding();
		m1.login();
	
	}

}
