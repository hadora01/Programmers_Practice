package day0211;

/**
 *programmers:������ϱ� 
 *��������� ->*-1 ���ϱ� 
 */
public class Solution01 {
	 public int solution(int[] absolutes, boolean[] signs) {
	        int result = 0;
	        for(int i =0; i<signs.length; i++){
	            if(signs[i]==false){
	                absolutes[i]=absolutes[i]*-1;
	            }
	            result +=absolutes[i];
	        }
	        return result;
	    }

}
