package Day0207;

/**
 *programmers level 1
 * title : (īī��) �űԾ��̵� ��õ  
 */


/*
 * 1�ܰ� �ҹ��ڷ� ġȯ
   2�ܰ� ���ĺ� �ҹ���, ����, ����(-), ����(_), ��ħǥ(.)�� ������ ��� ���ڸ� ����
   3�ܰ� ��ħǥ(.)�� 2�� �̻� ���ӵ� �κ��� �ϳ��� ��ħǥ(.)�� ġȯ
   4�ܰ�  ��ħǥ(.)�� ó���̳� ���� ��ġ�Ѵٸ� ����
   5�ܰ� new_id�� �� ���ڿ��̶��, new_id�� "a"�� ����
   6�ܰ� new_id�� ���̰� 16�� �̻��̸�, ����,���� ���� �� ��ħǥ(.)�� new_id�� ���� ��ġ�Ѵٸ� ���� ��ġ�� ��ħǥ(.) ���ڸ� ����
  7�ܰ� new_id�� ���̰� 2�� ���϶��, new_id�� ������ ���ڸ� new_id�� ���̰� 3�� �� ������ �ݺ��ؼ� ���� ���Դϴ�.
  */


public class Solution {
	public String solution(String new_id) {
		String answer = "";
		//1.�ҹ��� ġȯ
		String step1 = new_id.toLowerCase();
		//2.���� ���� 
		char[] step1_arr = step1.toCharArray();
		StringBuilder step2=new StringBuilder();
		for(char c: step1_arr) {
			if((c>='a'&& c<='z')|| (c>='0'&& c<='9')||c=='-'||c=='_'||c == '.') {
				step2.append(c);
			}
		}
		//3.��ħǥ2���� 1���� ġȯ
		String step3 = step2.toString().replace("..", ".");
		while(step3.contains("..")) {
			step3=step3.replace("..", ".");
		//4.��ħǥ ����  substring - ���� �޼ҵ� 
			String step4 = step3;
			if(step4.length()>0) {
				if(step4.charAt(0)=='.') {
					step4=step4.substring(1,step4.length());
				}
			}
			if(step4.length()>0) {
				if(step4.charAt(step4.length()-1)=='.') {
					step4=step4.substring(0,step4.length()-1);
				}
			}
			
			//5�ܰ� ��������� a�� ġȯ 
			String step5 = step4;
			if(step5.equals("")) {
				step5="a";
			}
			//6�ܰ� 16�� �̻��̸� ���� 
			String step6 = step5;
			if(step6.length() >=16) {
				step6 = step6.substring(0,15);
			
			if(step6.charAt(step6.length()- 1)=='.') {
				step6=step6.substring(0,step6.length()-1);
			}
		}
		//7�ܰ� 
		StringBuilder step7 = new StringBuilder(step6);
		if(step7.length() <=2) {
			char last = step7.charAt(step7.length() -1);
			while(step7.length() <3) {
				step7.append(last);
			}
		}
		
		
		
	}
		return answer;
}}
