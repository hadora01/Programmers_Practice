package day0211;

/**
 * 소수만들기 
 */
public class Solution02 {
	public int solution(int[] nums) {
		int count=0;
		for(int i=0; i<nums.length; i++) {
			for(int j=i+1; j<nums.length; j++) {
				for(int k=j+1; k<nums.length; k++) {
					if(isPrime(nums[i]+nums[j]+nums[k]))
						count++;
				}
			}
		}
		return count;
	}
	//소수구하기 method
public static boolean isPrime(int num) {
	boolean result = true;
	for(int i=2; i<num; i++) {
		if(num%i==0) {
			result = false;
			break;
		}
	}
	return result;
	
}
	

}
