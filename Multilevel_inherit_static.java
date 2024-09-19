package javapackage;
class amaz
{
	static void auth1()
	{
		System.out.println("parent class auth1");
	}
}
class Amazon extends amaz
{
	static void auth2() {
		System.out.println("super class  of amaz parent");
}}
public class Multilevel_inherit_static extends Amazon
{
	static void auth3()
	{
		System.out.println("child class");
	}
	public static void main(String[] args)
	{	
auth3();
auth1();
auth2();
}

}
