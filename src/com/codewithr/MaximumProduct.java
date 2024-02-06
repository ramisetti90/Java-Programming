package com.codewithr;
/*Given the array of integers nums, you will choose two 
different indices i and j of that array. Return the maximum value of (nums[i]-1)*(nums[j]-1).*/

public class MaximumProduct {
	
	
	public static int maxProduct(int [] nums) {
		
		int max =0;
		int secondMax=0;
		
		for(int num: nums) {
			if(num>max) {
				secondMax = max;
				max=num;
				continue;
			}
			
			if(num>secondMax) {
				secondMax = num;
			}
		}
		return (max-1)*(secondMax-1);
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int nums[]= {3,4,5,2};
		System.out.println("Print Max Product of: "+MaximumProduct.maxProduct(nums));
	}

}
