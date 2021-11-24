package DevMatching.level1.로또의최고순위와최저순위;
//최저순위와 최고순위
//1시 15분 시작
//1시 32분 끝
//걸린시간: 17분
public class DevMatching2021 {
	public static void main(String[] args) {
		int[] lottos = {44, 1, 0, 0, 31, 25};
		int[] win_nums = {31, 10, 45, 1, 6, 19};
		System.out.println(solution(lottos, win_nums)[0]+" "+solution(lottos, win_nums)[1]);
	}
	
	public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int zerocnt = 0;
        int cnt = 0;
        for (int i = 0; i < lottos.length; i++) {
        	for (int j = 0; j < win_nums.length; j++) {
        		//두 값이 같으면 cnt 하나증가
        		if(lottos[i] == win_nums[j]) {
        			cnt++;
        		}else if(lottos[i] == 0) {
        			//0이면 zerocnt 하나증가
        			zerocnt++;
        			break;
        		}
			}
		}
        //가장 높은 순위는 0이 모두 로또번호와 일치되는 숫자일 경우이다.
        answer[0] = grade(cnt+zerocnt);
        //가장 낮은 순위는 0이 모두 로또번호와 일치되지 않는 숫자일 경우이다.
        answer[1] = grade(cnt);
        
        return answer;
    }
	public static int grade(int n) {
		switch (n) {
		case 6:
			return 1;
		case 5:
			return 2;
		case 4:
			return 3;
		case 3:
			return 4;
		case 2:
			return 5;
		default:
			return 6;
		}
	}
}
