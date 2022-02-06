package Day0206;

import java.util.HashSet;
import java.util.HashMap;
import java.util.Set;
import java.util.StringTokenizer;

/**
 * programmers level 1 
 * title : (īī��) �Ű��� �ޱ�
 */

public class Solution01 {
	public int[] solution(String[] id_list, String[] report, int k) {
		int[] answer = new int[id_list.length]; // id_list�������� ������ ����޾Ҵ���
		HashMap<String, Set<String>> reporterArr = new HashMap<String, Set<String>>();
		HashMap<String, Integer> singoArr = new HashMap<String, Integer>();

		// �ʱ�ȭ
		for (String id : id_list) {
			singoArr.put(id, 0);
			reporterArr.put(id, new HashSet<String>());
		}
		// �Ű�� �����
		for (String cur : report) {
			StringTokenizer st = new StringTokenizer(cur, " ");
			String reporter = st.nextToken(); // �Ű��� ���
			String singo = st.nextToken(); // �Ű�������
			if (reporterArr.get(reporter).add(singo)) {
				singoArr.put(singo, singoArr.get(singo) + 1);
			}
		}

		// �Ű��� ���
		for (String cur : report) {
			StringTokenizer st = new StringTokenizer(cur, " ");
			String reporter = st.nextToken(); // �Ű��� ���
			String singo = st.nextToken(); // �Ű�������
			// ������ �Ű��� ����� �Ű���� Ƚ���� k�̻��� ��츸 �����
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
