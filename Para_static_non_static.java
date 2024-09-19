package javapackage;

public class Para_static_non_static
{
	static void sub(int a,int b)
	{
		System.out.println(a-b);
	}
     void add(int a, double b)
     {
    	 System.out.println(a+b);
     }
	public static void main(String[] args) 
	{
		Para_static_non_static obj=new Para_static_non_static();
		obj.add(10,20.08);
		sub(40,20);

	}

}
