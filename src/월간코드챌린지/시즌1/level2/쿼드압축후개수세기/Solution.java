package 월간코드챌린지.시즌1.level2.쿼드압축후개수세기;

//7시 16분시작
//재귀문제인데,, 재귀너무어려움 어떻게해야할지 잘 모르겠음.
//분할정복, dfs 사용하기!

public class Solution {
	int[] answer;

	public int[] solution(int[][] arr) {
		answer = new int[2];
		quad(arr.length, 0, 0, arr);
		return answer;
	}

	//n : 변의 길이
	//x,y : 시작지점의 위치
	public void quad(int n, int y, int x, int[][] arr) {
		if (n == 1) {
			answer[arr[y][x]]++;
			return;
		}
		if (isBlock(n, y, x, arr)) {
			return;
		}
		quad(n / 2, y, x, arr);
		quad(n / 2, y + n / 2, x, arr);
		quad(n / 2, y, x + n / 2, arr);
		quad(n / 2, y + n / 2, x + n / 2, arr);
	}

	public boolean isBlock(int n, int y, int x, int[][] arr) {
		for (int i = y; i < y + n; i++) {
			for (int k = x; k < x + n; k++) {
				if (arr[i][k] != arr[y][x]) {
					return false;
				}
			}
		}
		answer[arr[y][x]]++;
		return true;
	}

}
