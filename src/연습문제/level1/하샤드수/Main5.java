package 연습문제.level1.하샤드수;

import java.util.Iterator;

//문제 설명
//양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다. 
//예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다. 
//자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.
//제한 조건
//x는 1 이상, 10000 이하인 정수입니다.


public class Main5 {
	public static void main(String[] args) {
		boolean answer = solution(12);
		System.out.println("ans"+answer);
	}
	public static boolean solution(int x) {
        boolean answer = true;
//        
//        String[] stringX = String.valueOf(x).split("");
//        int sum = 0;
//        for(String i : stringX) {
//        	sum+=Integer.parseInt(i);
//        }
//        if(x%sum!=0) {
//        	answer=false;
//        }
        
        String stringX = String.valueOf(x);
        char[] arr = stringX.toCharArray();
        int sum = 0;
        
        for(char i : arr) {
			sum+=Integer.parseInt(String.valueOf(i));
		}
        
        
        if(x%sum!=0) {
        	answer=false;
        }
        
        return answer;
    }
}
