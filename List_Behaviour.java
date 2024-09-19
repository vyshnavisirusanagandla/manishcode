package javapackage;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class List_Behaviour 
{
	static void list_beh()
	{
		List l1=new ArrayList();
		l1.add("vyshu");
		l1.add(89);
		l1.add('b');
		l1.add("ram");
		l1.add("vyshu");
		l1.add(null);
		l1.add(null);
		System.out.println(l1);	
	}
	static void set_beh()
	{
		 Set s1=new HashSet();
		 s1.add("ram");
		 s1.add("sita");
		 s1.add("lll");
		 s1.add("ram");
		 s1.add(null);
		 s1.add(null);
		 System.out.println(s1);
	}
public static void main(String[] args) 
{
	list_beh();
	set_beh();
}
}
