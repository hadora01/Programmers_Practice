package Day0208;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *level 1: 완주하지 못한 선수 
 *hash 사용 
 *
 */

public class Solution02 {
	public String solution(String[] participant,  String[] completion) {
		String answer="";
		HashMap<String, Integer> map = new HashMap<>();
		for(String player:participant) {
			map.put(player,map.getOrDefault(player,0)+1);
		}
		for(String player:completion) {
			map.put(player,map.get(player)-1);
		}
		Iterator<Map.Entry<String,Integer>> iter = map.entrySet().iterator();
		while(iter.hasNext()) {
			Map.Entry<String, Integer> entry = iter.next();
			if(entry.getValue() !=0) {
				answer = entry.getKey();
				break;
			}
		}
		return answer;
	}

}
