package chapter6;

import java.util.Scanner;

public class Uneducated 
{
	// instance variables
	static Scanner s = new Scanner(System.in);
	static double input1, input2, response;
	
	// general methods
	public static <E> void p(E type)
	{
		System.out.println(type);
	}

	public static void main(String[] args) 
	{
		p("Enter 2 numbers:\t");
		
		input1 = s.nextInt();
		input2 = s.nextInt();
		
		p(simpleMultiply(input1, input2));

	}

	private static double simpleMultiply(double input12, double input22) 
	{
		
		response = input1 * input2;
		
		return response;
	}
	

}
