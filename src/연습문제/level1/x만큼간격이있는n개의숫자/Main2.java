package 연습문제.level1.x만큼간격이있는n개의숫자;

public class Main2 {
	public static void main(String[] args) {
		long[] arr = solution(4,3);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static long[] solution(int x, int n) {
		long[] answer = new long[n];
		for (int i = 0; i < n; i++) {
			answer[i] = x*(1+i);
		}
        return answer;
    }
}
