package javapackage;

public class Para_non_static_method 
{
void add(int a,int b)
{
	int sum=a+b;
	System.out.println(sum);
}
static void add(double c,int d)
{
	double sum2=c+d;
	System.out.println(sum2);
}
	public static void main(String[] args)
	{
		Para_non_static_method p1=new Para_non_static_method();
		p1.add(110,110);
		add(10.20,20);

	}

}
