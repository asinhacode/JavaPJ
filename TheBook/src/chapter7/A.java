package chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class A {

	 static int value[];
	 static	Scanner s = new Scanner(System.in);

	public static void main(String[] args) 
	{
		/*
		 * System.out.println("Enter array size:\t");
		 * 
		 * value = new int[s.nextInt()];
		 * 
		 * System.out.println("Enter the starting number:\t");
		 * 
		 * 
		 * doubler(s.nextInt(), value);
		 */
		
		int natural[] = {1, 2, 3, 40, 5, 5, 4, 3, 2, 1};
		
		System.out.println(sumTheNumbers(natural));
	}
	
	public static void doubler(int start, int[] value)
	{
		value[0] = start;
		
		for(int i = 1; i < value.length; i++)
		{
			value[i] = value[i - 1] * 2;
		}
		
		System.out.println(Arrays.toString(value));
	}
	
	public static int sumTheNumbers(int[] values)
	{
		int sum = 0;
		
			for(int i = 0; i < values.length; i++)
			{
				sum += values[i];
			}
			
			return sum;
	}

}
