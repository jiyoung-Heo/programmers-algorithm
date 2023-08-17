package 연습문제.level1.달리기경주;

import java.util.HashMap;
import java.util.Map;

//5:10
//5:36
//걸린시간: 26min
public class Test {
	public static void main(String[] args) {
		Test test = new Test();
		test.solution(new String[] {"mumu", "soe", "poe", "kai", "mine"}, new String[] {"kai", "kai", "mine", "mine"});
	}
	public String[] solution(String[] players, String[] callings) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < players.length; i++) {
			map.put(players[i], i);
		}
		for (int i = 0; i < callings.length; i++) {
			String key = callings[i];
			int value = map.get(key);
			
			String front = players[value-1];
			players[value-1] = key;
			players[value] = front;
			
			map.put(key, value-1);
			map.put(front, value);
		}
		
        return players;
    }
}
