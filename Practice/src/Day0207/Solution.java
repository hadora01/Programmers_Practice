package Day0207;

/**
 *programmers level 1
 * title : (카카오) 신규아이디 추천  
 */


/*
 * 1단계 소문자로 치환
   2단계 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거
   3단계 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환
   4단계  마침표(.)가 처음이나 끝에 위치한다면 제거
   5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입
   6단계 new_id의 길이가 16자 이상이면, 제거,만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거
  7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
  */


public class Solution {
	public String solution(String new_id) {
		String answer = "";
		//1.소문자 치환
		String step1 = new_id.toLowerCase();
		//2.문자 제거 
		char[] step1_arr = step1.toCharArray();
		StringBuilder step2=new StringBuilder();
		for(char c: step1_arr) {
			if((c>='a'&& c<='z')|| (c>='0'&& c<='9')||c=='-'||c=='_'||c == '.') {
				step2.append(c);
			}
		}
		//3.마침표2개를 1개로 치환
		String step3 = step2.toString().replace("..", ".");
		while(step3.contains("..")) {
			step3=step3.replace("..", ".");
		//4.마침표 제거  substring - 제거 메소드 
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
			
			//5단계 비어있으면 a로 치환 
			String step5 = step4;
			if(step5.equals("")) {
				step5="a";
			}
			//6단계 16자 이상이면 제거 
			String step6 = step5;
			if(step6.length() >=16) {
				step6 = step6.substring(0,15);
			
			if(step6.charAt(step6.length()- 1)=='.') {
				step6=step6.substring(0,step6.length()-1);
			}
		}
		//7단계 
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
