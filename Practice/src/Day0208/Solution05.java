package Day0208;

import java.util.Arrays;

/**
 * programmers level 1
 * mysolution 폰켓몬
 * 배열의 indexof이런 문제 발생  
 */
public class Solution05 {
	  public int solution(int[] nums) {
	       
	        int[] array = new int[nums.length/2]; //nums의 절반의 크기만큼 배열이 생성됌 
	        Arrays.fill(array,0);
	        Arrays.sort(nums); //nums 배열 sort
	        array[0]=nums[0]; //일단 하나는 가져갈수있으니까 
	        for(int i=1; i<nums.length; i++) {
	        	for(int j=0; j<i; j++) {
	        		if(array[j]!=nums[i]) {
	        			array[i]=nums[i];
	        		}
	        	} //end j for문
	        } //end i for문
	        
	        
	        return array.length;
	    }
 
}
