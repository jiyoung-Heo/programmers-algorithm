package 연습문제.level2.숫자의표현;

//2시 7분
//2시 27분 종료
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.solution(15));
    }

    public int solution(int n) {
        int answer = 1;
        for (int i = 2; i < n; i++) {
            int sum = 0;
            if (i % 2 == 0) {
                for (int j = 0; j < i; j++) {
                    sum += n / i + j;
                }
            } else {
                sum += n / i;
                for (int j = 1; j <= i / 2; j++) {
                    sum += n / i - j;
                    sum += n / i + j;
                }
            }
            if (sum == n) {
                answer++;
            }
        }
        return answer;
    }
}