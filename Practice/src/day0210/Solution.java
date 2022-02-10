package day0210;

/**
 * 프로그래머스 level 1
 * 약수의 개수와 덧셈 
 * 약수구하기: 0부터 나눠본다. 나머지 0이면 그 수의 약수
 */
public class Solution {
	public int solution(int left, int right) {
		int answer = 0;
		for(int i=left; i<=right; i++) {
			int cnt = 0;
			for(int j=1; j<=i; j++) {
				if(i%j ==0) cnt++;
			}
			if(cnt%2==0) answer+=i;
			else answer-=i;
		}
		return answer;
	}

}
