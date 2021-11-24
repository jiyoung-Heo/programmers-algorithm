package 월간코드챌린지.시즌1.level1.내적;
//내적
//시작시간 2시 4분
//끝난시간 2시 6분
public class MonthlyChal1 {
	public int solution(int[] a, int[] b) {
		
        int answer = 0;
        for (int i = 0; i < b.length; i++) {
			answer += a[i]*b[i];
		}
        return answer;
    }
}
