package Day0208;

import java.util.HashMap;

/**
 *level 1: �������� ���� ���� 
 *my solution => �ߺ��� ��� �ذ��� �ȉ� 
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
	        //�����ѻ���� map value�� 1
	        for(String key:map.keySet()){
	            if(map.get(key)==0){
	                 answer =key;
	            }
	        }//end  for
	      return answer;
	    }

}
