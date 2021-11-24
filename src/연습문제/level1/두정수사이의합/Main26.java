package 연습문제.level1.두정수사이의합;

public class Main26 {
	public long solution(int a, int b) {
        long answer = 0;
        int big = 0;
        int small = 0;
        
        if(a>b) {
        	big = a;
        	small = b;
        }else if(a<b) {
        	big = b;
        	small = a;
        }
        
        if(a==b) {
        	answer=a;
        }else {
        	for (int i = small; i <= big; i++) {
        		answer +=i;
        	}
        }
        
        return answer;
    }
//	if(a==b) {
//		answer=a;
//	}else {
//		for (int i = Math.min(a, b); i <= Math.max(a, b); i++) {
//			answer += i;
//		}
//	}
}
