package 연습문제.level1.문자열다루기기본;

public class Main22 {
	public boolean solution(String s) {
        boolean answer = true;
        if(s.length()!=4 && s.length()!=6) answer=false;
        try {
        	Integer.parseInt(s);
		} catch (NumberFormatException e) {
			answer=false;
		}
        return answer;
    }
}
