package javapackage;
public class Throw_throws {
	int globala;//0
	double globalb;//0.0
	void add(int a,double b1)
	{
	this.globala=a;
	this.globalb=b1;
	}
	public static void main(String[] args) {
		Throw_throws t1=new Throw_throws ();
		t1.add(21, 33.980);
		System.out.println(t1.globala);
		System.out.println(t1.globalb);
		

	}

}
