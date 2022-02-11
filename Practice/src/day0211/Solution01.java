package day0211;

/**
 *programmers:음양더하기 
 *음수만들기 ->*-1 곱하기 
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
