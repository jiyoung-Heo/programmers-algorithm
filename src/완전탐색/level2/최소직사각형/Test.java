package 완전탐색.level2.최소직사각형;

import java.util.Arrays;
import java.util.Collections;

//14:12 ~ 12:17
//5min
public class Test {
	public static void main(String[] args) {
		Test test = new Test();
		System.out.println(test.solution(new int[][] { { 60, 50 }, { 30, 70 }, { 60, 30 }, { 80, 40 } }));
//		[[60, 50], [30, 70], [60, 30], [80, 40]]	4000
//		[[10, 7], [12, 3], [8, 15], [14, 7], [5, 15]]	120
//		[[14, 4], [19, 6], [6, 16], [18, 7], [7, 11]]	133
	}

	public int solution(int[][] sizes) {

		Integer[] length = new Integer[sizes.length];
		Integer[] height = new Integer[sizes.length];

		for (int i = 0; i < sizes.length; i++) {
			if (sizes[i][0] > sizes[i][1]) {
				length[i] = sizes[i][0];
				height[i] = sizes[i][1];
			} else {
				length[i] = sizes[i][1];
				height[i] = sizes[i][0];
			}
		}
		// 다른풀이: min max 사용
		int length2 = 0;
		int height2 = 0;
		for(int[] sizeArr : sizes) {
			length2 = Math.max(length2,Math.max(sizeArr[0], sizeArr[1]));
			height2 = Math.max(height2,Math.min(sizeArr[0], sizeArr[1]));
		}
		//return length2 * height2;
		
		Arrays.sort(length, Collections.reverseOrder());
		Arrays.sort(height, Collections.reverseOrder());

		return length[0] * height[0];
	}
}
