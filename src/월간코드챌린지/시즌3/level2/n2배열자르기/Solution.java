package 월간코드챌린지.시즌3.level2.n2배열자르기;
//11시47분 시작
//12시 17분 메모리초과
//12시 31분 끝 -> 실패뜸.. 이유가 뭘까
public class Solution {
	public int[] solution(int n, long left, long right) {
		int[] arr = new int[(int)right - (int)left + 1];
		int cnt = 0;
		for (int i = (int)left; i <= (int)right; i++) {
			arr[cnt++] = (Math.max(i / n, i % n) + 1);
		}

		return arr;
	}
}
// 메모리초과코드
// int[] answer = new int[(int)right - (int)left + 1];
//
// int[][] arr = new int[n][n];
// 	arr[0][0] = 1;
// 		for (int i = 1; i < n; i++) {
// for (int k = 0; k <= i; k++) {
// arr[i][k] = i + 1;
// arr[k][i] = i + 1;
// }
// }
//
// ArrayList<Integer> array = new ArrayList<>();
// for (int i = 0; i < n; i++) {
// for (int k = 0; k < n; k++) {
// array.add(arr[i][k]);
// }
// }
//
// Object[] list = array.stream().toArray();
//
// for (int i = (int)left; i <= (int)right; i++) {
// answer[i - (int)left] = array.get(i);
// }
// return answer;