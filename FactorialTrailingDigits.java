package CodingProjects;

public class FactorialTrailingDigits {

	public void FactorialTrailing(int orignum) {

		int num = orignum;
		
		//finding factorial of 'num' input
		for(int i = orignum; i > 2; i--)
			num = num * (i - 1);
		
		System.out.println(orignum + "! = " + num + "\n");
		
		int[] digits = digitSeparator(num);
		
		for(int i = 0; i < digits.length; i++)
			System.out.print(digits[i]+ " ");
	}
	
	
	public int[] digitSeparator(int num)
	{
		int length = 1; //eventual size of array
		int tempnum = num;
		
		while(tempnum > 10)
		{
			length++;	//finding length of num
			tempnum = tempnum / 10;
		}
		
		int[] digits = new int[length];
		int i = 0;
		
		while(num > 0) //adds digits to array
		{
			digits[i] = num % 10; 
			num = num / 10;
			i++;
		}
			
		return reverseArray(digits); //returns after reversing
	}
	
	
	public int[] reverseArray(int[] digits)
	{
		int z = 0; //holds array data while reversing	
		int low = 0;
		int high = digits.length - 1;
		
		while(low < high) //accounts for even and odd length
		{
			z = digits[high];
			digits[high] = digits[low];
			digits[low] = z;
			
			high--;
			low++;
		}
		
		return digits;
	}
}
