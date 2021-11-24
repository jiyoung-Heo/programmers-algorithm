package 연습문제.level2.피보나치수;

public class Main {
    public static void main(String[] args) {
        Main solution = new Main();
        System.out.println(solution.solution(5));
    }

    public int solution(int n) {
        int[] arr = new int[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i <= n; i++) {
            arr[i] = (arr[i - 2] + arr[i - 1])%1234567;
        }
        return arr[arr.length-1];
    }
}
