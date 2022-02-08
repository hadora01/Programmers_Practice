package Day0208;

import java.util.HashMap;

/**
 *level 1: 완주하지 못한 선수 
 *my solution => 중복의 경우 해결이 안됌 
 *
 */

public class Solution {
	  public String solution(String[] participant, String[] completion) {
		  String answer = "";
	       HashMap<String,Integer> map = new HashMap<>();
	        for(String s: participant){
	            map.put(s,0);
	        }
	        for(String s: completion){
	          for(int i =0; i<participant.length; i++){
	              if(s.equals(participant[i]))
	                  map.put(participant[i],1);
	          }
	        }
	        //완주한사람은 map value값 1
	        for(String key:map.keySet()){
	            if(map.get(key)==0){
	                 answer =key;
	            }
	        }//end  for
	      return answer;
	    }

}
