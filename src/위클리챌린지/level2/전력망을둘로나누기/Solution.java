package 위클리챌린지.level2.전력망을둘로나누기;

import java.util.HashSet;
import java.util.Set;

//3:09
//4:13 15점
//4:39 23점
//풀이완료!
public class Solution {
	public int solution(int n, int[][] wires) {
		Set<Integer> right = new HashSet<>();
		Set<Integer> left = new HashSet<>();

		int min = n;

		for (int i = 0; i < wires.length; i++) {
			right.clear();
			left.clear();
			right.add(wires[i][0]);
			left.add(wires[i][1]);

			while(n != (right.size()+ left.size())){

				for (int k = 0; k < wires.length; k++) {
					if(i==k){
						continue;
					}
					if(right.contains(wires[k][0])||right.contains(wires[k][1])){
						right.add(wires[k][0]);
						right.add(wires[k][1]);
					}
					if(left.contains(wires[k][0])||left.contains(wires[k][1])){
						left.add(wires[k][0]);
						left.add(wires[k][1]);
					}
				}

			}

			int temp = 0;
			if (right.size() > left.size()) {
				temp = right.size() - left.size();
			} else {
				temp = left.size() - right.size();
			}

			if (min > temp) {
				min = temp;
			}
		}

		return min;
	}
}
