package javapackage;
public class SIB_IIB_Block {
	static
	{
		System.out.println("static block");
	}
	{
		System.out.println("iib block");
	}
	SIB_IIB_Block()
	{
		System.out.println("constructor");
	}
	public static void main(String[] args) {
		new SIB_IIB_Block();
		System.out.println("main method");
		new  SIB_IIB_Block();
		
		
		
	}

}
