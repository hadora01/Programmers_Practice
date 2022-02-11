package day0211;

import java.util.Arrays;

/**
 * k번째수 
 * 배열의 크기는 알고있으면 넣어주는게 좋다.
 */
public class Solution03 {
	 public int[] solution(int[] array, int[][] commands) {
	        int[] answer = new int[commands.length];
	        for(int i =0; i<commands.length; i++){
	        	int min=commands[i][0];
	        	int max = commands[i][1];
	            int fin = commands[i][2];
	            int[] rarray =new int[(max-min)+1];
	            for(int k=0; k<rarray.length; k++){
	                rarray[k]=array[min-1+k];
	            }
	            Arrays.sort(rarray);
	            answer[i]=rarray[fin-1];
	            
	        }
	        return answer;
	    }
	 public static void main(String[] args) {
			// TODO Auto-generated method stub

		}


}
