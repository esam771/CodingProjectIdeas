package CodingProjects;

public class mergingSortedArrays {

	public static void main(String[] args)
	{
		int[] nums1 = {1,2,2,5};
		int[] nums2 = {1,3,5,6234};
		
		mergingSortedArrays a = new mergingSortedArrays();
		
		System.out.println(a.findMedianSortedArrays(nums1, nums2));
	}

	 public double findMedianSortedArrays(int[] nums1, int[] nums2) {
	        
		 //https://leetcode.com/problems/median-of-two-sorted-arrays/
		 
	        int i = 0; //updated index of nums1
	        int j = 0; //updated index of nums2
	        int x = 0; //updated index of final array, arr[]
	        
	        int length = nums1.length + nums2.length;
	        
	        double[] arr = new double[length];
	        
	        while(i < nums1.length && j < nums2.length)
	        {
	            if(nums1[i] <= nums2[j]) //if updated index of num1 is less than equal to num2
	            {
	                arr[x] = nums1[i];
	                i++;
	            }
	            else if (nums1[i] > nums2[j]) //if nums1 index greater than num2 index
	            {
	                arr[x] = nums2[j];
	                j++;
	            }
	            
	            x++; //updating final array index
	        }
	        
	        while(i < nums1.length) //if nums1 has unused indexes
	        {
	        	arr[x] = nums1[i];
	        	x++;
	        	i++;
	        }

	        while(j < nums2.length) //if nums1 has unused indexes
	        {
	        	arr[x] = nums2[j];
	        	x++;
	        	j++;
	        }
	        
	        for(int y = 0; y < arr.length; y++) //prints array
	        {
	        	System.out.print(arr[y] + " ");
	        }
	        System.out.println();
	        
	        double num = 0;
	        
	        if(length % 2 == 1) //finding median if final array is odd number length
	        {
	            num = arr[length / 2];
	            return(num);
	        }
	        else
	        {
	            num = (arr[length / 2 - 1] + arr[length / 2]) / 2; //median if average of 2
	            return(num);
	        }
	    }

	
}
