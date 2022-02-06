package Day0206;

import java.util.HashSet;
import java.util.HashMap;
import java.util.Set;
import java.util.StringTokenizer;

/**
 * programmers level 1 
 * title : (카카오) 신고결과 받기
 */

public class Solution01 {
	public int[] solution(String[] id_list, String[] report, int k) {
		int[] answer = new int[id_list.length]; // id_list기준으로 메일을 몇번받았는지
		HashMap<String, Set<String>> reporterArr = new HashMap<String, Set<String>>();
		HashMap<String, Integer> singoArr = new HashMap<String, Integer>();

		// 초기화
		for (String id : id_list) {
			singoArr.put(id, 0);
			reporterArr.put(id, new HashSet<String>());
		}
		// 신고된 사람들
		for (String cur : report) {
			StringTokenizer st = new StringTokenizer(cur, " ");
			String reporter = st.nextToken(); // 신고한 사람
			String singo = st.nextToken(); // 신고받은사람
			if (reporterArr.get(reporter).add(singo)) {
				singoArr.put(singo, singoArr.get(singo) + 1);
			}
		}

		// 신고한 사람
		for (String cur : report) {
			StringTokenizer st = new StringTokenizer(cur, " ");
			String reporter = st.nextToken(); // 신고한 사람
			String singo = st.nextToken(); // 신고받은사람
			// 본인이 신고한 사람의 신고당한 횟수가 k이상일 경우만 남기기
			if (singoArr.get(singo) < k) {
				reporterArr.get(reporter).remove(singo);
			}
			for (int i = 0; i < id_list.length; i++) {
				answer[i] = reporterArr.get(id_list[i]).size();
			}
		}

		return answer;
	}

	public static void main(String[] args) {

	}

}
