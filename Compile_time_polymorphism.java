package javapackage;
public class Compile_time_polymorphism {
	void add()
	{
		System.out.println("no para");
	}
	void add(int i)
	{
		System.out.println("1 para");
	}
	void add(char c)
	{
		System.out.println("float value");
	}
	public static void main(String[] args) {
		
		Compile_time_polymorphism c1=new Compile_time_polymorphism();
		c1.add();
		c1.add('v');
		c1.add(11);
	}

}
