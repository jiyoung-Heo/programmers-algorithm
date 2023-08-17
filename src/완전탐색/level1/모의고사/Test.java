package 완전탐색.level1.모의고사;

import java.util.ArrayList;
import java.util.List;

//14:37~15:05
//28min
public class Test {
	public static void main(String[] args) {
		Test test = new Test();
		System.out.println(test.solution(new int[] { 1, 2, 3, 4, 5 }));

	}

	public int[] solution(int[] answers) {

		int[] one = new int[] { 1, 2, 3, 4, 5 };
		int[] two = new int[] { 2, 1, 2, 3, 2, 4, 2, 5 };
		int[] three = new int[] { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };

		int[] correctCount = new int[3];

		for (int i = 0; i < answers.length; i++) {

			if (answers[i] == one[i % one.length]) {
				correctCount[0]++;
			}
			if (answers[i] == two[i % two.length]) {
				correctCount[1]++;
			}
			if (answers[i] == three[i % three.length]) {
				correctCount[2]++;
			}
		}
		int maxCount = Math.max(correctCount[0], Math.max(correctCount[1],correctCount[2]));
		List<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < correctCount.length; i++) {
			if(maxCount == correctCount[i]) {
				list.add(i+1);
			}
		}
		int[] answer = new int[list.size()];
		
		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
		
		return answer;
	}
}
