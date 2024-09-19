package javapackage;
class State1_class
{
	 State1_class(int a)
	{
		System.out.println("parent method");
	}
}
public class Super_calling_stmt_program6 extends State1_class{
	 Super_calling_stmt_program6()
	{
		 super(2);
		System.out.println("child method");
	}
	public static void main(String[] args) {
	new	Super_calling_stmt_program6();
	

	}

}
