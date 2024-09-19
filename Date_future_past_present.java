package javapackage;
import java.util.Date;
public class Date_future_past_present
{
	public static void main(String[] args) {
		Date d1=new Date();
		System.out.println("epoch time is coming............"+d1.getTime());
		Date d2=new Date(d1.getTime());
		System.out.println("present time..........."+d2);
		Date d3=new Date(d1.getTime()+(1000*60*60*24*54));
	System.out.println("future date........"+d3);
	Date d4=new Date(d1.getTime()-(1000*60*60*24*1));
	System.out.println("past time..........."+d4);
	//converting the above Date into String in order to perform String operations
	String s1=d2.toString();
	System.out.println("to get the present month"+s1.substring(3, 7));
	System.out.println("present date"+s1.substring(7, 10));
	System.out.println("present year"+s1.substring(23, 28));
	
	}

	
		
	}
	
