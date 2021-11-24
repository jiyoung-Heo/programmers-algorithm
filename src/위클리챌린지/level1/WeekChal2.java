package 위클리챌린지.level1;

public class WeekChal2 {
	public static void main(String[] args) {
		int[][] scores = {{100,90,98,88,65},{50,45,99,85,77},{47,88,95,80,67},{61,57,100,80,65},{24,90,94,75,65}};
//		int[][] scores = {{50,90},{50,87}};
		System.out.println(solution(scores));
	}
	public static String solution(int[][] scores) {
		String answer = "";

		for (int i = 0; i < scores.length; i++) {
			int my = scores[i][i];

			int smallCnt = 0;
			int bigCnt = 0;

			for (int j = 0; j < scores.length; j++) {
				if(my > scores[j][i]) {
					smallCnt++;
				}
				if(my < scores[j][i]) {
					bigCnt++;
				}
			}
			int sum = 0;
			int evg = 0;
			for (int j = 0; j < scores.length; j++) {
				sum += scores[j][i];
			}
			if(smallCnt == scores.length-1 || bigCnt == scores.length-1) {
				//유일한 최소값 혹은 유일한 최댓값임
				sum -= scores[i][i];
				evg = sum/(scores.length-1);
			}else {
				evg = sum/scores.length;
			}
			switch (evg/10) {
				case 9:
					answer+="A";
					break;
				case 8:
					answer+="B";
					break;
				case 7:
					answer+="C";
					break;
				case 6:
					answer+="D";
					break;
				case 5:
					answer+="D";
					break;
				default:
					answer+="F";
					break;
			}
		}
		return answer;
	}
}
