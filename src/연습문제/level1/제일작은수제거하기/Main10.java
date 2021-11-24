package 연습문제.level1.제일작은수제거하기;

import java.util.Iterator;

public class Main10 {
	public static void main(String[] args) {
		int[] answer = {3,2,1,4};
		int[] a = solution(answer);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
    public static int[] solution(int[] arr) {
        int[] answer = {};
        if(arr.length==1) {
            answer = new int[1];
            answer[0] = -1;
        }else {
            answer = new int[arr.length-1];

            int small = arr[0];
            int cnt = 0;

            for (int i = 0; i < arr.length; i++) {
                if(small>arr[i]) {
                    small = arr[i];
                    cnt=i;
                }
            }

            for (int i = cnt; i < arr.length-1; i++) {
                arr[i]=arr[i+1];
            }
            for (int i = 0; i < answer.length; i++) {
                answer[i] = arr[i];
            }
        }
        return answer;
    }
}
