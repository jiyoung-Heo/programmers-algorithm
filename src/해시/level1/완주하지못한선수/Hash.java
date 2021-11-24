package 해시.level1.완주하지못한선수;

import java.util.Arrays;

//완주하지 못한 선수
//2시 45시작
//3시 13분 끝 걸린시간 28분
public class Hash {
	public static void main(String[] args) {
		String[] participant = {"leo", "kiki", "eden","marina", "josipa", "nikola", "vinko", "filipa"};
		String[] completion = {"eden", "kiki","josipa", "filipa", "marina", "nikola", "vinko"};
		System.out.println(solution(participant, completion));
	}
	public static String solution(String[] participant, String[] completion) {
		String answer="";
        Arrays.sort(participant);
		Arrays.sort(completion);
        
		for (int i = 0; i < completion.length; i++) {
			System.out.println(participant[i]);
			System.out.println(completion[i]);
			if(participant[i].equals(completion[i]) == false) {
	            answer = participant[i];
	            break;
			}
		}
		if(answer.equals("")) {
			answer = participant[participant.length-1];
		}
        return answer;
    }
}
