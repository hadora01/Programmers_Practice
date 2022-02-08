package Day0208;

import java.util.HashSet;

/**
 * programmers level 1
 *  폰켓몬
 * 중복제거를 위해서 set사용
 */
public class Solution06 {
	public int solution(int[] nums) {
		int max =nums.length/2;
		//중복제거
		HashSet<Integer> numsSet = new HashSet<>();
		for(int num:nums) {
			numsSet.add(num); //중복이면 저장불가능
		}
		//중복을 제거했는데 max보다 크면 return max
		//max보다 작으면 set의 size를 리턴
		if(numsSet.size()>max) {
			return max;
		}else {
			return numsSet.size();
		}
	}

}
