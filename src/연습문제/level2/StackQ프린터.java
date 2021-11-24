package 연습문제.level2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class StackQ프린터 {
	public static void main(String[] args) {
		int[] priorities = {2, 1, 3, 2};
		System.out.println(solution(priorities,2));
	}
	public static int solution(int[] priorities, int location) {
        int answer = 0;
        ArrayList<HashMap<Integer, Integer>> list = new ArrayList<>();
        for (int i = 0; i < priorities.length; i++) {
        	HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        	map.put(i, priorities[i]);
        	list.add(map);
		}
        int print = 1;
        while(true) {
//        	int cnt = 0;
//        	for (int i = 1; i < list.size(); i++) {
//				if(list.get(0).values() < list.get(i).get(list.get(i).values())) {
//					list.add(list.get(0));
//					list.remove(0);
//				}else{
//					cnt++;
//				};
//			}
//        	print++;
//        	if(cnt == list.size()) {
//        		if(list.get(0).containsKey(location)){
//        			answer = print;
//        			break;
//        		}
//        	}
        }
//        return answer;
    }
}
