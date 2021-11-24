package KAKAOBLINDRECRUITMENT.level1.신규아이디추천_2021;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//신규 아이디 추천
//2시 17분 시작
//질문하기
public class KakaoBlindRecruitment2021 {
	public static void main(String[] args) {
		System.out.println(solution("...!@BaT#*..y.abcdefghijklm"));
		System.out.println(solution("z-+.^."));
		System.out.println(solution("=.="));
		System.out.println(solution("123_.def"));
		System.out.println(solution("abcdefghijklmn.p"));
	}
	public static String solution(String new_id) {
		String answer = "";
        String[] toarr = new_id.split("");
        List<String> arr = new ArrayList<>();
        for(String a : toarr) {
        	arr.add(a);
        }
        //1,2단계 처리
        for (int i = 0; i < arr.size(); i++) {
        	String lower = arr.get(i).toLowerCase();
        	arr.set(i, lower);
			try {
				Integer.parseInt(arr.get(i));
			} catch (NumberFormatException e) {
				if((arr.get(i).toCharArray()[0] >= 'a'  && arr.get(i).toCharArray()[0] <= 'z') == false
						&& arr.get(i).equals("-") == false 
						&& arr.get(i).equals("_") == false 
						&& arr.get(i).equals(".") == false){
					arr.set(i, "*");
				}
			}
		}
        //3,4단계 처리
        for (int i = 0; i < arr.size()-1; i++) {
			if(arr.get(i).equals(".") && arr.get(i+1).equals(".")) {
				arr.set(i, "*");
			}
		}
        
        
        Iterator<String> iter = arr.iterator(); 
        while(iter.hasNext()) { 
        	if(iter.next().equals("*")) {
        		iter.remove();
        	}
        }
        
        while(arr.isEmpty() == false && arr.get(0).equals(".")) {
        	arr.remove(0);
        }
        while(arr.isEmpty() == false && arr.get(arr.size()-1).equals(".")) {
        	arr.remove(arr.size()-1);
        }
        
        //5단계(빈문자열일때 처리)
        if(arr.isEmpty()) {
        	arr.add("a");
        }
        
        //6단계 문자열 수 줄이기
        if(arr.size()>=16) {
        	arr = arr.subList(0, 15);
        	while(arr.get(arr.size()-1).equals(".")) {
        		arr.remove(arr.size()-1);
        	}
        }
        //7단계 아이디 수 2개이하일때 3자 이상으로 늘이기
        if(arr.size()<=2) {
        	while(arr.size()<3) {
        		String plus = arr.get(arr.size()-1);
        		arr.add(plus);
        	}
        }
        for(String ans : arr) {
        	answer += ans;
        }
        return answer;
    }
}
