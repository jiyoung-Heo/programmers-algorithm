package 월간코드챌린지.시즌3.level1.나머지가1이되는수찾기;

public class MonthChal3 {
	public static void main(String[] args) {

	}
	public int solution(int n) {
		int answer = 0;
		for (int i = 1; i < n; i++) {
			if(n % i == 1) {
				answer = i;
				break;
			}
		}
		return answer;
	}
}
