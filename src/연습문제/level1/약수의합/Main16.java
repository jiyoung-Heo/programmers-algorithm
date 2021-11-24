package 연습문제.level1.약수의합;

//약수의 합

public class Main16 {
	public static void main(String[] args) {
		
	}
	public int solution(int n) {
        int answer = 0;
        if(n != 0) {
        	for (int i = 1; i <= n; i++) {
        		if(n % i == 0) {
        			answer += i;
        		}
        	}
        }
        return answer;
    }
}
