package CodingProjects;

public class PascalsTriangle {
	
	public void pascalGenerator(int rows, int num)
	{
		//Creates 2d array and adds pascal's values
		
		int[][] pascal = new int[rows][rows];
		pascal = clearPascal(pascal); //sets all values to 0
		
		for(int i = 0; i < rows; i++)
		{
			pascal[i][0] = 1; //leading 1 in every row
			
			for(int j = 0; j < i - 1; j++) //everything between 1s
			{
				pascal[i][j+1] = pascal[i-1][j] + pascal[i-1][j+1];
			}
			pascal[i][i] = 1; //tailing 1 in every row
		}
		
		pascalPrinter(pascal); //sends array to printing method
		divisorScanner(pascal, num); //finds nums divisible by num
	}
	
	
	public void pascalPrinter(int[][] pascal)
	{
		for(int i = 0; i < pascal.length; i++)
		{
			/*formatting for early layers, pyramid looks cleaner, doesn't 
			  account for 3 digit layers as overflow is reached*/
			
			System.out.print("Layer " + (i + 1) + " ");
			if(i < 9)
				System.out.print(" "); 
			
			for(int z = 0; z < pascal.length - i; z++)
				System.out.print(" "); //formatting for looking triangular
			
			for(int j = 0; j < pascal.length; j++)
			{
				if(pascal[i][j] != 0) //leaves blank spaces after valuable nums
					System.out.print(pascal[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public int[][] clearPascal(int[][] pascal)
	{
		/* clears pyramid and sets original 2d array to have
		 all 0's for cleaner printing */
		
		for(int i = 0; i < pascal.length; i++)
		{
			for(int j = 1; j < pascal.length; j++)
			{
			pascal[i][j] = 0;
			}
		}
		return pascal;
	}
	
	public void divisorScanner(int[][] pascal, int num)
	{
		int x = 0;
		
		for(int i = 0; i < pascal.length; i++)
		{
			for(int j = 0; j < pascal.length; j++)
			{
				if(pascal[i][j] != 0 && pascal[i][j] % num == 0)
				{
					x++;
				}
			}
		}
		System.out.println("\n" + x + " Numbers are divisible by " + num);
	}
}
