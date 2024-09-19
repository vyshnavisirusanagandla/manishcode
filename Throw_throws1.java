package javapackage;
public class Throw_throws1 {
	public static void main(String[] args) throws  java.lang.ArithmeticException
	{
		//throw new  java.lang.ArithmeticException();
		int a=50;
		int b=5;
		double div=a/b;
		System.out.println(div);
		throw new  java.lang.ArithmeticException();

	}

}
