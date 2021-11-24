package 월간코드챌린지.시즌2.음양더하기;
//음양 더하기
//시작시간 1시 54분
//끝 1시 56분
public class MonthlyChal2 {
	public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i = 0; i < signs.length; i++) {
			if(signs[i] == true) {
				answer += absolutes[i];
			}else {
				answer -= absolutes[i];
			}
		}
        return answer;
    }
}
