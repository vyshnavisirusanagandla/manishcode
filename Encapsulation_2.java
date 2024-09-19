package javapackage;
class parente
{
	private String name="vyshu";

public void setName(String name)
{
	this.name=name;
}
public String getName()
{
	return name;
}
}
public class Encapsulation_2 {

	public static void main(String[] args) {
		parente p4=new parente();
		p4.setName("vyshnavi");
	System.out.println(p4.getName());
	}
	}



