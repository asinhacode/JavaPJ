package chapter7;

public class Distribution 
{

	public static void main(String[] args) 
	{
		int[] distribution = {10, 5, 14, 3};
		String[] items = {"JAVA: ", "ALGORITHMS: ", "WEB DEVELOPMENT: ", "MISCELLENEOUS: "};
		for(int counter = 0; counter < distribution.length; counter++)
		{
			System.out.print(items[counter]);
			for(int stars = 0; stars < distribution[counter]; stars++) {
				System.out.print("* ");
			}
			
			System.out.println();
			
		}
	}
	
	

}
