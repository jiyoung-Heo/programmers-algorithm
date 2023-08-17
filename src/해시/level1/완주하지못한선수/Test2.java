package 해시.level1.완주하지못한선수;

import java.util.HashMap;
import java.util.Map;

//5:51~6:09
//18min
public class Test2 {

	public String solution(String[] participant, String[] completion) {
		Map<String, Integer> map = new HashMap<>();
		
		for (int i = 0; i < participant.length; i++) {
			if (map.get(participant[i]) == null) {
				map.put(participant[i], 1);
			} else {
				map.put(participant[i], map.get(participant[i]) + 1);
			}
		}
		for (int i = 0; i < completion.length; i++) {
			map.put(completion[i], map.get(completion[i]) - 1);
			if (map.get(completion[i]) == 0) {
				map.remove(completion[i]);
			}
		}
		String answer = "";

		for(String key : map.keySet()) {
			answer = key;
		}
		
		return answer;
	}
}
