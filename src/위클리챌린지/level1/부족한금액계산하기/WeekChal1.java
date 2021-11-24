package 위클리챌린지.level1.부족한금액계산하기;
//7시 5분 시작
public class WeekChal1 {
	public static void main(String[] args) {
		long ans = solution(3,20,4);
		System.out.println(ans);
	}
	//놀이기구 이용료, 처음 가지고 있던 금액, 놀이기구 이용 횟수
	public static long solution(int price, int money, int count) {
		long answer = -1;
		long ans = money;
		for (int i = 1; i <= count; i++) {
			ans -= ((long)price * i);
		}
		if(ans >= 0) {
			answer = 0;
		}else {
			answer = -ans;
		}
		return answer;
	}
}
