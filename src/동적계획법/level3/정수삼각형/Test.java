package 동적계획법.level3.정수삼각형;

import java.util.Arrays;

//3:40 ~ 4:32
//걸린시간: 52min
public class Test {
	public static void main(String[] args) {
		Test test = new Test();
		System.out.println(
				test.solution(new int[][] { { 7 }, { 3, 8 }, { 8, 1, 0 }, { 2, 7, 4, 4 }, { 4, 5, 2, 6, 5 } }));
	}

	public int solution(int[][] triangle) {

		for (int i = triangle.length - 1; i > 0; i--) {
			for (int j = 0; j < triangle[i].length - 1; j++) {
				int max = Math.max(triangle[i][j], triangle[i][j + 1]);
				triangle[i - 1][j] += max;
			}
		}

		return triangle[0][0];
	}
}
