package arrays.sum.closest;

import java.util.Arrays;

public class ClosestSumToTarget {

	public static void main(String[] args) {
		
		
		ClosestSumToTarget ob = new ClosestSumToTarget(); 
        int ar1[] = {1, 4, 5, 7}; 
        int ar2[] = {10, 20, 30, 40}; 
       
        int x = 38; 
        for(int res : ob.solution(ar1, ar2,x)){
        	System.out.println(res);
        }
		
		
		

	}
	
	
	public int[] solution(int[] x, int[] y, int target) {
		
		int[] result = new int[2];
		int diff = Integer.MAX_VALUE;
		Arrays.sort(x);
		Arrays.sort(y);
		int j=y.length-1,i=0;
		while(j>0 && i<x.length ) {
			
			if(Math.abs(x[i] + y[j] - target) <diff ) {
				result[0] = x[i];
				result[1] = y[j];
				diff = Math.abs(x[i] + y[j] - target);
			}
			
			if(x[i] + y[j] < target) {
				i++;
			}else {
				j--;
			}
		}
		
		
		
		return result;
	}

}
