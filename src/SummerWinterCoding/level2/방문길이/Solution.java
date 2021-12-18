package SummerWinterCoding.level2.방문길이;

//6:27시작
//7:13 실패
//방향성을 가져야 하는데 그렇게 구현하지 못했다
//25점맞음
public class Solution {
	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.solution("UDU"));
	}
	public int solution(String dirs) {
		int answer = 0;
		int[][] arr = new int[11][11];
		int x = 5;
		int y = 5;

		String[] dirArr = dirs.split("");
		for (String s : dirArr) {
			if (arr[x][y] == 0) {
				System.out.println(x+","+y+"방문함");
				arr[x][y] = 1;
				answer++;
			}
			switch (s) {
				case "U":
					if (y > 0) {
						y -= 1;
					}
					break;
				case "D":
					if (y < 10) {
						y += 1;
					}
					break;
				case "L":
					if (x > 0) {
						x -= 1;
					}
					break;
				case "R":
					if (x < 10) {
						x += 1;
					}
					break;
			}
		}
		return answer;
	}
}
