package chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class Six3_5 
{
	
	static Scanner input = new Scanner(System.in);
	static int input1, input2;
	
	public static void main(String[] args)
	{
		System.out.println("Welcome to multiplication:");
		System.out.println("Enter Y to continue and N to exit");
		
		String choice = input.next();
		
		while(choice.equals("Y"))
		{
		
			input1 = numberGenerated();
			input2 = numberGenerated();
			
			getResponse(input1, input2);
		
			System.out.println("Enter Y to continue and N to exit");
		    choice = input.next();
		}
		
		System.out.println("EXITING multiplication game!");

	}
	
	public static int numberGenerated()
	{
		SecureRandom s = new SecureRandom();
		
		int data = s.nextInt(100);
		
		return data;
	}
	
	public static void getResponse(int data1, int data2)
	{
		
		System.out.printf("Enter product of %d time %d = ", data1, data2);
		int result = input.nextInt();
		
		checkResult(result, (data1 * data2));
		
	}

	private static void checkResult(int result, int correctResult) 
	{
			
			if(result == correctResult)
			{
				System.out.println("GREAT JOB");
			}
			
			else
			{
				System.out.println("INCORRECT!\nTry again");
				// estimation(input1, input2);
				getResponse(input1, input2);
			}

	}
	

}
