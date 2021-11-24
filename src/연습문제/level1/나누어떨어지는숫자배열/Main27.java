package 연습문제.level1.나누어떨어지는숫자배열;

import java.util.ArrayList;
import java.util.Arrays;

public class Main27 {
	public static void main(String[] args) {
		int[] arr = {2, 36, 1, 3};
		int[] ans = solution(arr, 1);
		for (int i = 0; i < ans.length; i++) {
			System.out.println(ans[i]);
		}
	}
	public static int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> arrTemp = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
			if(arr[i] % divisor == 0) {
				arrTemp.add(arr[i]);
			}
		}
        
        if(arrTemp.isEmpty()) {
        	arrTemp.add(-1);
        }
        
        int[] answer = new int[arrTemp.size()];
        for (int i = 0; i < arrTemp.size(); i++) {
			answer[i] = arrTemp.get(i);
		}
        //오름차순으로 정렬
        Arrays.sort(answer);
        
        return answer;
	}
}
