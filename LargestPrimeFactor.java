package CodingProjects;

public class LargestPrimeFactor {

	public void FindPrimeFactor(int num) {
		
		System.out.println("Prime factors of " + num + ": "); //output format
		
		for(int i = num - 1; i > 1; i--) //searches to find possible factors
			{
			if(num % i == 0) //when factor is found
				{
				if(this.isPrime(i)) //to see if factor is prime
					System.out.print(i + ", ");
				}
			}	
		}
	
	public boolean isPrime(int num)
	{
		for(int i = num - 1; i > 1; i--) //searches from 1 to num-1
		{
			if(num % i == 0)
				return false; //when num isn't prime
		}	
		return true; //returns true if prime
	}
}
