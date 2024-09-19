package javapackage;
class Country
{
	Country()
	{
		System.out.println("parent");
	}
}
class New extends Country
{
	New(int a)
	{
		System.out.println("new 2nd sub class");
	}
	
}
public class State extends New
{
	State()
	{
	super(10);
		System.out.println("child");
	}

	public static void main(String[] args) {
	new State();

	}

}
