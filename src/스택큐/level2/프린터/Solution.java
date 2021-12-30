package 스택큐.level2.프린터;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

//2:52
//3:45 40점
//3:51 75점
public class Solution {
	public int solution(int[] priorities, int location) {
		Queue<Integer> queqe = new LinkedList<>();
		Set<Integer> set = new HashSet<>();

		for (int i : priorities) {
			queqe.offer(i);
			set.add(i);
		}

		List<Integer> list = new ArrayList<>(set);
		Collections.reverse(list);
		List<Integer> deleteIndexList = new ArrayList<>();

		int nowLocation = 0;
		int index = 0;
		int printCnt = 0;
		while (true) {
			if(deleteIndexList.contains(nowLocation)){
				nowLocation++;
				continue;
			}
			if(nowLocation > priorities.length-1){
				nowLocation = 0;
			}

			if (queqe.contains(list.get(index))) {
				if (queqe.peek() != list.get(index)) {
					queqe.offer(queqe.poll());
				} else if (queqe.peek() == list.get(index)) {
					printCnt++;
					deleteIndexList.add(nowLocation);
					queqe.remove();
					if (nowLocation == location) {
						return printCnt;
					}
				}
				nowLocation++;
			} else {
				index++;
			}

		}
	}
}
