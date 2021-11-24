package 연습문제.level2;

public class 행렬의곱셈 {
	public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];
        for (int i = 0; i < arr1.length; i++) {
        	for (int j = 0; j < arr2.length; j++) {
        		answer[i][j] += arr1[j][i] * arr2[i][j];
			}
		}
        return answer;
    }
}
