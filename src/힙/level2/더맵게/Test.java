package 힙.level2.더맵게;

import java.util.PriorityQueue;

//7:20~ 7:48
//28min
public class Test {

	public int solution(int[] scoville, int K) {
		PriorityQueue<Integer> que = new PriorityQueue<Integer>();
		for (int a : scoville) {
			que.add(a);
		}
		int cnt = 0;
		while(que.peek() < K) {
			if(que.size() == 1) {
				return -1;
			}
			
			// 첫번째 작은 수
			int first = que.poll();
			// 두번째로 작은 수
			int second = que.poll();
			
			int sum = first + second * 2;
			que.add(sum);
			cnt ++;
			
		}

		return cnt;
	}
}
