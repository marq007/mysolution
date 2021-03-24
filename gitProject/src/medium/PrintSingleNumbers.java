package medium;

import java.util.HashMap;

public class PrintSingleNumbers {

	public static void main(String[] args) {
		PrintSingleNumbers sol = new PrintSingleNumbers();
		
		int [] result = sol.singleNumber(new int[]{1,2,2,3,1,5});
		System.out.print("[");
		for(int res : result) {
			System.out.print(res+",");
		}
		System.out.print("]");
	}
	
	public int[] singleNumberSlow(int[] nums) {
        
		HashMap<Integer,Integer> resultMap = new HashMap<>();
		int[] result = new int[2];
		for(int num : nums) {			
			resultMap.put(num,resultMap.getOrDefault(num, 0)+1);					
		}
		int resultIndex = 0;
		for(int num : nums) {
			
			if(1==resultMap.get(num)) {
				result[resultIndex] = num;
				resultIndex++;
			}
			if(resultIndex==2) {
				break;
			}
		}
		
		
		return result;
    }
	
	//Second Solution
	public int[] singleNumber(int[] nums) {
		int[] result = new int[2];
		int count = 0;
		int resultIndex = 0;
		for(int i=0;i<nums.length;i++) {
			count++;
			for(int j=0;j<nums.length;j++) {
				if(nums[i]==nums[j]&&i!=j) {
					count++;
				}
			}
			if(count==1) {
				result[resultIndex]=nums[i];
				resultIndex++;
			}
			if(resultIndex==2) {
				break;
			}
			count=0;
		}
		
		
		return result;
    }

}
