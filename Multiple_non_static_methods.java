package javapackage;
public class Multiple_non_static_methods {
	void add()
	{
		int a=1;
		int b=2;
		 int add=a+b;
		
	System.out.println(" calling multiple non static methods "+add);
	}
	void sub()
	{
		int a=30;
		int b=20;
		 int sub=a-b;
		
		System.out.println(" calling multiple non static methods "+sub);
	}
	public static void main(String[] args){	
Multiple_non_static_methods ns=new Multiple_non_static_methods(); 
				ns.add();
				ns.sub();
}

}
