package CodingProjects;

public class ConsecutivePrimeSum {

	public void ConsecutivePrime(int num) {

		int currentsum = 0;
		int i = 2; //possible prime numbers
		
		System.out.println("Max prime sum below " + num + "\n");
		
		while(currentsum + i < num)
		{
			if(isPrime(i))
			{
				currentsum = currentsum + i;
				System.out.println(i);
			}
			
			i++;
		} 
		
		System.out.println("\nTotal of: " + currentsum);
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
