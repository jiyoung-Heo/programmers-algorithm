package 월간코드챌린지.시즌2.약수의개수와덧셈;
//약수의 개수와 덧셈
//시작시간 10시 19분
//끝시간 10시 23분
//걸린시간 4분
public class MonthlyChal2_2 {
	public int solution(int left, int right) {
        int answer = 0;
        for (int i = left; i <= right; i++) {
        	int cnt = 0;
			for (int j = 1; j <= i; j++) {
				if(i%j == 0) {
					cnt++;
				}
			}
			if(cnt/2 == 0) {
				answer += i;
			}else {
				answer -= i;
			}
		}
        return answer;
    }
//        <다른풀이>
//        for (int i=left;i<=right;i++) {
//            //제곱수인 경우 약수의 개수가 홀수
//            if (i % Math.sqrt(i) == 0) {
//                answer -= i;
//            }
//            //제곱수가 아닌 경우 약수의 개수가 짝수
//            else {
//                answer += i;
//            }
//        }
}
