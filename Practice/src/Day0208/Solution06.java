package Day0208;

import java.util.HashSet;

/**
 * programmers level 1
 *  ���ϸ�
 * �ߺ����Ÿ� ���ؼ� set���
 */
public class Solution06 {
	public int solution(int[] nums) {
		int max =nums.length/2;
		//�ߺ�����
		HashSet<Integer> numsSet = new HashSet<>();
		for(int num:nums) {
			numsSet.add(num); //�ߺ��̸� ����Ұ���
		}
		//�ߺ��� �����ߴµ� max���� ũ�� return max
		//max���� ������ set�� size�� ����
		if(numsSet.size()>max) {
			return max;
		}else {
			return numsSet.size();
		}
	}

}
