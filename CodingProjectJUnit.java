package CodingProjects;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CodingProjectJUnit {

	@Test
	void test() {
		LargestPrimeFactor s = new LargestPrimeFactor();
		s.FindPrimeFactor(13195); //prints every prime factor
	}

}
