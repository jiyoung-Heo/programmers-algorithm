package 월간코드챌린지.시즌3.level1.없는숫자더하기;


//없는 숫자 더하기
//시작시간 1시 43분
//끝 시간 1시 56분
public class MonthlyChal3 {
	public static void main(String[] args) {
		
	}
	public int solution(int[] numbers) {
        int answer = 0;
        for (int i = 0; i < 10; i++) {
        	answer+=i;
		}
        for (int i = 0; i < numbers.length; i++) {
        	answer -= numbers[i];
		}
        return answer;
    }
}
