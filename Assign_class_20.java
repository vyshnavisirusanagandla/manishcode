package javapackage;
abstract class Name1{
abstract void  meth1();
abstract  void meth2();
static void meth3()
{
	System.out.println("oncrete method 1 om abst_concrete");
}
static void meth4()
{
	System.out.println("oncrete method2from abst_concrete");
}
}
public class Assign_class_20 extends  Name1{
	static void add()
	{
		System.out.println("concrete method1 add");
	}
	static void sub()
	{
		System.out.println("concrete method2 sub");
	}
	void meth1()
	{
		System.out.println("abstract method1");
	}
	void meth2()
	{
		System.out.println("abstract method2");
	}
	public static void main(String[] args)
	{
		Assign_class_20 obj=new Assign_class_20();
		obj.meth1();
		obj.meth2();
		add();
		sub();
		meth3();
		meth4();
		

	}

}
