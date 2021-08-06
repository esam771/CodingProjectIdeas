package CodingProjects;

public class CollatzConjectureTest {

	/* Can use to test Collatz Conjecture or '3x+1 problem'
	 * which will tell you how many loops before
	 * you reach an eventual 1,4,2, repeating loop. 
	 * No number that avoids this ending has been found and
	 * the problem is generally regarded as a waste of time.
	 */
	
	int loops = 0;
	
	public void CollatzConjecture(int num) {
		
		System.out.println(num);
		
			if(num == 1) { //end case for process
				//System.out.println(1);
				System.out.println("\n" + loops + 
						" steps before continuous loop");
				
			} else if (num % 2 == 1) { //odd case
				num = (num * 3) + 1;
				loops++;
				CollatzConjecture(num);
				
			} else { //even case
				num = num / 2;
				loops++;
				CollatzConjecture(num);
			}
		}
	}
