package 연습문제.level1.자연수뒤집어배열로만들기;

//자연수 뒤집어 배열로 만들기

public class Main13 {
	public static void main(String[] args) {
		int[] arr = solution(12345);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	public static int[] solution(long n) {
        String[] arr = String.valueOf(n).split("");
        int[] answer = new int[arr.length];
        for (int i = arr.length-1; i >=0 ; i--) {
			answer[arr.length-1-i] = Integer.parseInt(arr[i]);
		}
        return answer;
    }
}
