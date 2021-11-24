package 연습문제.level2;

import java.util.ArrayList;

//문자열 압축
//3시 53분 시작
//5시 13분 32점 끝
//걸린시간 1시간 20분..
//정확성 32나옴

//중복횟수가 10이 넘어가도 상관없을것같은데 실패 뜨는 이유?
public class KaKaoBlindRecruitment2020 {
	public static void main(String[] args) {
//		System.out.println(solution("a"));
		System.out.println(solution("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
//		System.out.println(solution("aabbaccc"));
//		System.out.println(solution("ababcdcdababcdcd"));
//		System.out.println(solution("abcabcdede"));
//		System.out.println(solution("abcabcabcabcdededededede"));
//		System.out.println(solution("xababcdcdababcdcd"));
	}
	public static int solution(String s) {
        int len = s.length();
        ArrayList<String> arr = new ArrayList<>();
        //k 는 자를갯수
        for (int k = 1; k <= s.length()/2; k++) {
        	//arr초기화
        	arr.removeAll(arr);
        	
        	//k개만큼 잘라서 arr에 담아주는 for문
        	for (int i = 0; i < s.length(); i+=k) {
        		if(i+k >= s.length()) {
        			arr.add(s.substring(i));
        		}else {
        			arr.add(s.substring(i,i+k));
        		}
        	}
        	for (int i = 0; i < arr.size()-1; i++) {
        		System.out.println("X"+arr.get(i));
        		//i번째와 i+1번째가 같은 문자면
        		if(arr.get(i).equals(arr.get(i+1))) {
        			try {
        				if(i != 0) {
        					//i-1이 공백이면 i-2를 i-2도 공백이면 그 앞에것을 찾아 비교한다.
        					//i-1을 int타입으로 변환시킨다. 이때 이게 숫자면 밑에구문실행. 숫자가 아니면 catch로 넘어감
        					for (int j = 1; j == i; j++) {
        						if(arr.get(i-j).isEmpty()) {
        							System.out.println("여기");
        							continue;
        						}else {
        							Integer.parseInt(arr.get(i-j));
        							break;
        						}
							}
        					//i-1의 숫자를 하나 증가시킴
        					arr.set(i-1, (Integer.parseInt(arr.get(i-1))+1)+"");
        					System.out.println(arr.toString());
        					//i를 공백으로 변경함(중복제거)
        					arr.set(i, "");
        					System.out.println(arr.toString());
        				}else {
        					//i가 0이라면 i-1이 존재하지 않으므로 catch로 넘겨준다
        					throw new NumberFormatException();
        				}
        			} catch (NumberFormatException e) {
        				//i-1이 숫자가 아닌 경우 혹은 i가 0인경우 실행
        				//i가 0이고 i+i과 i가 같은경우 i를 2로 변환해줌.
        				//i-1이 숫자가 아니라는것은 i가 앞에 문자와 같지 않다는 것이다.
        				//i가 0인 경우와 마찬가지고 i를 2로 변환해줌.
        				arr.set(i, "2");
        				System.out.println(arr.toString());
        			}
        		}
        	}
        	System.out.println(arr.toString());
        	//결과를 string에 담아서 길이를 구하고 최소길이면 len을 result길이로 정의
        	String result = "";
        	for(String a : arr) {
        		result += a;
        	}
        	if(len > result.length()) {
        		len = result.length();
        	}
		}
        return len;
    }
}
