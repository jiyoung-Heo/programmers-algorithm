package 연습문제.level1.정수제곱근판별;

//정수 제곱근 판별

public class Main11 {
	public static void main(String[] args) {
		long answer = solution(3);
		System.out.println(answer);
	}
	public static long solution(long n) {
		long answer;
		
		long sqrt = (long) Math.sqrt(n);
		
		if(n == Math.pow(sqrt,2)) { 
			answer = (long)(Math.pow(sqrt+1, 2)); 
		}else {
			answer = -1; 
		}
		
		return answer;
    }
//        long answer = -1;
//        
//        for (long i = 0; i*i<= n; i++) {
//			if(i*i==n) {
//				answer = (i+1)*(i+1);
//        		break;
//			}
//		}
//        
//        return answer;
	//삼항연산자로 바꾼다면
//		answer = (n == Math.pow(sqrt,2)) ? (long)(Math.pow(sqrt+1, 2)) : -1;
}
