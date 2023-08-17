package 정렬.level1.K번째수;

import java.util.ArrayList;
import java.util.Comparator;

//7:48~8:12
// 24min
public class Test {
	public static void main(String[] args) {
		Test t = new Test();
		t.solution(new int[] { 1, 5, 2, 6, 3, 7, 4 }, new int[][] { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } });
	}

	public int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		for (int i = 0; i < commands.length; i++) {
			ArrayList<Integer> a = new ArrayList<Integer>();
			for (int j = commands[i][0] - 1; j < commands[i][1]; j++) {
				a.add(array[j]);
			}
			a.sort(Comparator.naturalOrder());
			answer[i] = a.get(commands[i][2] - 1);
		}
		return answer;
	}
}
