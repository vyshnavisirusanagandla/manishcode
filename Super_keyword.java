package javapackage;
class Parent1{
	void login(long mobile)
	{
	System.out.println("parent class ........");
}
}
public class Super_keyword extends  Parent1{
	void login(long mobile)
	{
		System.out.println("Child class........");
		super.login(24523432);
	}
	public static void main(String[] args) {
		Super_keyword s1=new Super_keyword();
		s1.login(2434335);
	}

}
