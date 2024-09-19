package javapackage;
class Parenty
{
private	int age =18;
	public void setAge(int age)
	{
		this.age =age;
	}
public int getAge()

{
return age;
}
}
public  class Encapsulation_program {
	public static void main(String[] args) {
		Parenty p=new Parenty();
				p.setAge(77);
			System.out.println(	p.getAge());

	}

}
