package Day0208;

import java.util.Arrays;

/**
 * programmers level 1
 * mysolution ���ϸ�
 * �迭�� indexof�̷� ���� �߻�  
 */
public class Solution05 {
	  public int solution(int[] nums) {
	       
	        int[] array = new int[nums.length/2]; //nums�� ������ ũ�⸸ŭ �迭�� ������ 
	        Arrays.fill(array,0);
	        Arrays.sort(nums); //nums �迭 sort
	        array[0]=nums[0]; //�ϴ� �ϳ��� �������������ϱ� 
	        for(int i=1; i<nums.length; i++) {
	        	for(int j=0; j<i; j++) {
	        		if(array[j]!=nums[i]) {
	        			array[i]=nums[i];
	        		}
	        	} //end j for��
	        } //end i for��
	        
	        
	        return array.length;
	    }
 
}
