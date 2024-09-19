package javapackage;

import java.util.Arrays;

public class Copying_Array_to_Array {
	public static void main(String[] args) {
int input[]=new int[3];
input[0]=41;
input[1]=92;
input[2]=133;
int output[]=new int[3];
for(int i=0;i<=2;i++)
{
	output[i]=input[i];
}
	System.out.println(Arrays.toString(output));

	}

}
