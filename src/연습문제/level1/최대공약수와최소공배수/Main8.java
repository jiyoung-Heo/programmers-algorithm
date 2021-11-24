package 연습문제.level1.최대공약수와최소공배수;

//문제 설명
//두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 함수, solution을 완성해 보세요. 
//배열의 맨 앞에 최대공약수, 그다음 최소공배수를 넣어 반환하면 됩니다. 
//예를 들어 두 수 3, 12의 최대공약수는 3, 최소공배수는 12이므로 solution(3, 12)는 [3, 12]를 반환해야 합니다.
//제한 사항
//두 수는 1이상 1000000이하의 자연수입니다.
//입출력 예 #2
//자연수 2와 5의 최대공약수는 1, 최소공배수는 10이므로 [1, 10]을 리턴해야 합니다.

public class Main8 {
	public static void main(String[] args) {
		int[] answer = solution(3,12);
		System.out.println(answer[0]+","+answer[1]);
	}
	public static int[] solution(int n, int m) {
        int[] answer = new int[2];
        //최대공약수는 i로 n이랑 m을 나눴을때 나머지가 0인것. (n과 m중에 작은수부터 for룹 1까지)
        //최소공배수는 앞에수가 뒤에수의 배수인지 확인하고 배수가 아니면 두 수를 곱한값 배수면 뒤에값이 최소공배수
        
        int small;
        int big;
        
        if(n>m) {
        	big=n;
        	small=m;
        }else {
        	big = m;
        	small = n;
        }
        
        //최대공약수
        for (int i = small; i > 0; i--) {
			if(small%i==0 && big%i==0) {
                answer[0]=i;
				break;
			}
		}
        
        //최소공배수
        //최소공배수 구하는 식!!
        answer[1]=big*small/answer[0];
        
        return answer;
    }
}
