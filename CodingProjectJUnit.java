package CodingProjects;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CodingProjectJUnit {

	@Test
	void test() {
		LargestPrimeFactor s = new LargestPrimeFactor();
		s.FindPrimeFactor(13195); //prints every prime factor
		
		CollatzConjectureTest c = new CollatzConjectureTest();
		c.CollatzConjecture(23954533); //prints collatz conjecture process
	}

}
