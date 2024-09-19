package javapackage;
class City12{
	 City12(int a)
	{
		System.out.println("method1 of city");
	}

public class Super_calling_stmt1 extends City12{
	Super_calling_stmt1()
	{
		super(12);
		System.out.println("class 2 or main class is called");
	}
}
	public static void main(String[] args) {
		new City12(12);
	}

}
