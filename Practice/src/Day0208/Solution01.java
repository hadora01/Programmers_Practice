package Day0208;

import java.util.Arrays;

/**
 *level 1: �������� ���� ���� 
 *sort����� ��� 
 *
 */
public class Solution01 {
	public String solution(String[] participant, String[] completion) {
		//�� �迭�� ����
		Arrays.sort(participant);
		Arrays.sort(completion);
		//�� �迭�� �ٸ��κб��� ã�´�. 
		int i =0; 
		for(i=0; i<completion.length; i++) {
			if(!participant[i].equals(completion[i]))
				break;
		}
	
	return participant[i];
	

}
	}
