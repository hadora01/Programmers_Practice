package Day0207;

import java.util.Arrays;

public class NumberSum {
	 public int solution(int[] numbers) {
	        int sum=0;
	        //배열선언과 ,fill함수 이용해서 배열 초기화 사용 
	       boolean[] array = new boolean[10];
	       Arrays.fill(array,false);
	       for(int n:numbers){
	           array[n]=true; //숫자 호명되면 true
	       }
	        //array완성 (호출되면 true, 호출되지 않으면 false)
	       for(int i=0; i<array.length;i++){
	           if(array[i]==false){
	               sum+=i;
	           }
	       }
	        return sum;
	    }

}
