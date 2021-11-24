package 연습문제.level1.가운데글자가져오기;
//가운데 글자 가져오기
public class Main29 {
	public String solution(String s) {
        String answer = "";
        String[] arr = s.split("");
        if(s.length() % 2 == 0) {
        	answer = arr[s.length()/2-1]+arr[s.length()/2];
        }else {
        	answer = arr[s.length()/2];
        }
        return answer;
    }
}
