package Day0207;

import java.util.Arrays;

public class NumberSum {
	 public int solution(int[] numbers) {
	        int sum=0;
	        //�迭����� ,fill�Լ� �̿��ؼ� �迭 �ʱ�ȭ ��� 
	       boolean[] array = new boolean[10];
	       Arrays.fill(array,false);
	       for(int n:numbers){
	           array[n]=true; //���� ȣ��Ǹ� true
	       }
	        //array�ϼ� (ȣ��Ǹ� true, ȣ����� ������ false)
	       for(int i=0; i<array.length;i++){
	           if(array[i]==false){
	               sum+=i;
	           }
	       }
	        return sum;
	    }

}
