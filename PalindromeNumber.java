package CodingProjects;

public class PalindromeNumber {

	 public static void main(String[] args)
	 {
		 PalindromeNumber a = new PalindromeNumber();
		 System.out.println(a.isPalindrome(124121));
	 }
	
	 public boolean isPalindrome(int x) {
	        
          //https://leetcode.com/problems/palindrome-number/
     
	        if(x < 0)
	            return false;
	        
	        int[] arr = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,}; //highest case, 2^31, is 10 digits
	        int digit = 0;
	        
	        while(x >= 1)
	        {
	            arr[digit] = x % 10;
	            x = x / 10;
	            digit++;
	        }
	        /*
	        for(int k = 0; k < digit; k++)
	        	System.out.print(arr[k] + " ");
	        
	        System.out.println();
	        System.out.println();
	        */
	        
	        int i = 0;
	        
	        while(digit > i)
	        {
	        	//System.out.println(arr[digit - 1] + " " + arr[i]);
	        	
	            if(arr[digit - 1] != arr[i])
	                return false;
	                
	            i++;
	            digit--;
	        }
	        
	        return true;
	    }

}
