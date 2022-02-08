package Day0208;

import java.util.Arrays;

/**
 *level 1: 완주하지 못한 선수 
 *sort사용일 경우 
 *
 */
public class Solution01 {
	public String solution(String[] participant, String[] completion) {
		//두 배열을 정렬
		Arrays.sort(participant);
		Arrays.sort(completion);
		//두 배열이 다른부분까지 찾는다. 
		int i =0; 
		for(i=0; i<completion.length; i++) {
			if(!participant[i].equals(completion[i]))
				break;
		}
	
	return participant[i];
	

}
	}
