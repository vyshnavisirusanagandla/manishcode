package javapackage;
import java.util.Arrays;
public class Whitespaces_num_spec_chars {
	public static void main(String[] args) {
		String name="am vyshnavi 123";
		int count_of_numb=0;
		int count_of_alpha=0;
		int count_of_widespaces=0;
		int count_special_chars=0;
		 char c1[]=name.toCharArray();
		 char c2[]=name.toCharArray();
		 char c3[]=name.toCharArray();
		 System.out.println(Arrays.toString(c1));
		 System.out.println(Arrays.toString(c2));
		 System.out.println(Arrays.toString(c3));
		 for(int i=0;i<name.length();i++)
		 {
		 boolean b1=Character.isDigit(c1[i]);
		 if(b1==true) {
			 count_of_numb++;
		 }
		 }
		 System.out.println( "count of numbs"+count_of_numb);
		 for(int i=0;i<name.length();i++)
		 {
		 boolean b2=Character.isAlphabetic(c2[i]);
		 if(b2==true) {
			 count_of_alpha++;
		 }
		 }
		 System.out.println( "count of alphabets..."+count_of_alpha);
		 
		 for(int i=0;i<name.length();i++)
		 {
		 boolean b3=Character.isWhitespace(c3[i]);
		 if(b3==true) {
			 count_of_widespaces++;
		 }
		 }
		 System.out.println( "widespaces are...."+count_of_widespaces);
		 int count_special_chars=input.length()-(count_of_numb+count_of_alpha+ count_of_widespaces);
		 System.out.println(count_special_chars);
		

	}

}
