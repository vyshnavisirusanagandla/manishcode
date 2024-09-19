package javapackage;
class Randomclass
{
 void add(int a)
{
	System.out.println("meth1 parent");
}
}
public class Method_overriding_super_keyword  extends Randomclass{
 void add()
{
super.add(12);
super.add(13);
System.out.println("meth2 child");
}
	public static void main(String[] args) 
	{
		Method_overriding_super_keyword m1=new Method_overriding_super_keyword();
 m1.add();
	}
}

	

