package 연습문제.level1.소수찾기;

//소수 찾기

public class Main20 {
	public static void main(String[] args) {
		int ans = solution(5);
		System.out.println(ans);
	}
	public static int solution(int n) {
        int answer = 0;
        boolean prime[] = new boolean[n+1];
        //소수는 false 소수가 아니면 true
        prime[0] = prime[1] = true;
        for (int i = 2; i*i <= n; i++) {
			//prime[i]가 소수라면
        	if(prime[i] == false) {
        		for (int j = i*i; j <= n; j+=i) {
        			//소수의 배수들은 소수가 아니다.
					prime[j] = true;
				}
        	}
		}
        //소수 출력
        for (int i = 1; i <= n; i++) {
			if(prime[i]==false) answer++;
		}
        return answer;
    }
}
