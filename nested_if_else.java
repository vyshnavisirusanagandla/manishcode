package javapackage;

public class nested_if_else {
	public static void main(String[] args) 
	{
		char gender1='m';
		char gender2='f';
		int age_of_kid=4;// free ticket
		int age_of_adult_male=32;//full ticket
		int age_of_adult_female=30;//free ticket
		if(gender1=='m')
		{
			if(age_of_kid<=4)
			{
				System.out.println("free ticket for kid");
			}
			else if(age_of_adult_male>=32)
			{
				System.out.println("full ticket");
			}
			else if( age_of_adult_female==40)
			{
				System.out.println("else if 2 free ticket for female ");
			}
			else
			{
				System.out.println("else block");
			}
				
		}

	}

}
