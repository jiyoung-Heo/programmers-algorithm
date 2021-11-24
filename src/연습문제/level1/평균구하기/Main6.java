package 연습문제.level1.평균구하기;

public class Main6 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		double ans = solution(arr);
		System.out.println(ans);
	}
	public static double solution(int[] arr) {
        int sum = 0;
        
        for (int i : arr) {
			sum+=i;
		}
        return (double)sum/(double)arr.length;
    }
}
