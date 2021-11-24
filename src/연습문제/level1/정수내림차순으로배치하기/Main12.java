package 연습문제.level1.정수내림차순으로배치하기;

//정수 내림차순으로 배치하기

public class Main12 {
	public static void main(String[] args) {
		long ans = solution(118372);
		System.out.println(ans);
	}
	public static long solution(long n) {
        String stringN = String.valueOf(n);
        char[] arr = stringN.toCharArray();
        
        for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]<arr[j]) {
					char temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
        return Long.parseLong(String.valueOf(arr));
    }
}
