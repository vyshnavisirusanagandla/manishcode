package javapackage;
public class Thiskeyword {
		int globala;//0
		double globalb;//0.0
		void add(int a,double b1)
		{
		this.globala=a;
		this.globalb=b1;
		}
		public static void main(String[] args)
		 {
			Thiskeyword t1=new Thiskeyword ();
			t1.add(21, 33.980);
			System.out.println(t1.globala);
			System.out.println(t1.globalb);
		}
	}


