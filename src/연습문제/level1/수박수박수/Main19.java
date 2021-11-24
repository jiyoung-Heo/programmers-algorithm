package 연습문제.level1.수박수박수;

//수박수박수박수박수?

public class Main19 {
	public static void main(String[] args) {
		
	}
	public String solution(int n) {
        String answer = "";
        for (int i = 1; i <= n; i++) {
        	answer += (i % 2 == 0) ? "박" : "수";
		}
        return answer;
        //다른풀이
//        return new String(new char [n/2+1])
//        		.replace("\0", "수박").substring(0,n);
    }
}
