package javapackage;
  class Testing_if_parent_is_final_to_override
{
 void login()
	{
		System.out.println("parent method phone number,pswd");
	}}
public class Method_overriding_parent_method_final extends  Testing_if_parent_is_final_to_override
{
	void login()
	{
	super.login();
	System.out.println("child method phone number,pswd");
	}
	public static void main(String[] args)
	{
		Method_overriding_parent_method_final m1=new Method_overriding_parent_method_final();
		m1.login();
	}

}
