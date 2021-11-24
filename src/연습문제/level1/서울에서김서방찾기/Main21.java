package 연습문제.level1.서울에서김서방찾기;
//서울에서 김서방찾기
public class Main21 {
	public static void main(String[] args) {
		
	}
	public String solution(String[] seoul) {
        String answer = "";
        for (int i = 0; i < seoul.length; i++) {
			if(seoul[i].equals("Kim")) {
				answer += "김서방은 "+i+"에 있다";
			};
		}
        return answer;
    }
}
