package javapackage;
abstract class class3
{
	abstract void add();
	abstract void subtract();
}
abstract class class2 extends class3
{
static 	void login_logic()
	{
		System.out.println("login logic");
	}
	static void logout_logic()
	{
		System.out.println("logout  logic");

	}
	
}
public class class1 extends class2
{
	void add() {
		
	}
	void subtract() {
		
	}
	void voice_chat()
	{
		System.out.println("chatting via voice");
	}
	static void video_chat()
	{
		System.out.println("chatting via video");

	}
	
	public static void main(String[] args) 
	{
		class1 c1=new class1();
		c1.voice_chat();
	}

}
