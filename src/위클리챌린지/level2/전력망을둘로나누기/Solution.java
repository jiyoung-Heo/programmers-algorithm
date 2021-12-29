package 위클리챌린지.level2.전력망을둘로나누기;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//3:09
//4:13 15점
//4:39 23점
//반례 못찾겠다
public class Solution {
	Set<Integer> right = new HashSet<>();

	public int solution(int n, int[][] wires) {
		int min = wires.length;

		for (int i = 0; i < wires.length; i++) {
			right.clear();
			List<int[]> wiresList = new ArrayList<>();
			for (int k = 0; k < wires.length; k++) {
				if (i == k) {
					continue;
				}
				int[] one = new int[2];
				one[0] = wires[k][0];
				one[1] = wires[k][1];

				wiresList.add(one);
			}
			right.add(wiresList.get(0)[0]);
			right.add(wiresList.get(0)[1]);
			connect(wiresList);

			int temp = 0;
			int leftSize = n - right.size();
			if (right.size() > leftSize) {
				temp = right.size() - leftSize;
			} else {
				temp = leftSize - right.size();
			}

			if (min > temp) {
				min = temp;
			}
		}

		return min;
	}

	public void connect(List<int[]> wires) {
		for (int i = 1; i < wires.size(); i++) {
			if (right.contains(wires.get(i)[0]) || right.contains(wires.get(i)[1])) {
				right.add(wires.get(i)[0]);
				right.add(wires.get(i)[1]);
			}
		}
		for (int i = 1; i < wires.size(); i++) {
			if (right.contains(wires.get(i)[0]) || right.contains(wires.get(i)[1])) {
				right.add(wires.get(i)[0]);
				right.add(wires.get(i)[1]);
			}
		}

	}
}
