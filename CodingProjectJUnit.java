package CodingProjects;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CodingProjectJUnit {

	@Test
	void test() {
		
		//switch for choosing class to test
		 int testnum = 0;
		 
	        switch (testnum) {
	            case 1:  
	        	//https:projecteuler.net/problem=3
	        	LargestPrimeFactor a = new LargestPrimeFactor();
	        	a.FindPrimeFactor(5643); //prints every prime factor
	                     break;
	            case 2:  
	            	//inspired by youtube video
	            	CollatzConjectureTest b = new CollatzConjectureTest();
	        	b.CollatzConjecture(3456); //prints collatz conjecture process
	                     break;
	            case 3:  
	            	//https://projecteuler.net/problem=50
	        	ConsecutivePrimeSum c = new ConsecutivePrimeSum();
	        	c.ConsecutivePrime(2345); //finds
	                     break;
	            case 4:  
	            	//https://projecteuler.net/problem=160
	            	FactorialTrailingDigits d = new FactorialTrailingDigits();
	            	d.FactorialTrailing(13);
	                     break;
	            case 5:  
			//https://projecteuler.net/problem=148
	            	PascalsTriangle e = new PascalsTriangle();
	            	e.pascalGenerator(15, 7); //1st row count, 2nd dividor num
	                     break;
	            case 6:  

	                     break;
	            case 7:  

	                     break;
	            case 8:  

	                     break;
	            case 9:  

	                     break;
	            case 10: 

	                     break;
	            case 11: 

	                     break;
	            case 12: 

	                     break;
	                     
	            default: System.out.println("No case to test for input");
	                     break;
	        }
	}
}
