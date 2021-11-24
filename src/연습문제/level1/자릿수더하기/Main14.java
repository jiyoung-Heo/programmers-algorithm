package 연습문제.level1.자릿수더하기;

//자릿수더하기

public class Main14 {
	public static void main(String[] args) {
		int ans = solution(987);
		System.out.println(ans);
	}
	public static int solution(int n) {
		int answer = 0;
		
		while(n>0) {
			answer += n%10;
			n /= 10;
		}
		
		return answer;
	}
}
