package javapackage;
class amazon
{
	void auth1()
	{
		System.out.println("parent class auth1");
	}
}
class flipcart extends amazon
{
	 void auth2() 
	{
		System.out.println("super class  of amazon parent");
	}
}
class snapdeal extends flipcart
{
	void auth3()
	{
		System.out.println("child class");
	}
}


public class Nonstat_multilevel extends Amazon
{
	void auth4()
	{
		System.out.println("child class in main method");
	}
	


	public static void main(String[] args)
	{
		Nonstat_multilevel n1=new Nonstat_multilevel();
		n1.auth4();
	n1.auth2();
	}

}
