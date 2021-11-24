package 연습문제.level2;

import java.util.ArrayList;
import java.util.HashMap;

//오픈채팅방
//걸린시간 : 약 15분

public class KaKaoBlindRecruitment2019 {
	public static void main(String[] args) {
		String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
		System.out.println(solution(record));
	}
	public static String[] solution(String[] record) {
		
        String[][] arr = new String[record.length][3];
        
        for (int i = 0; i < record.length; i++) {
			arr[i] = record[i].split(" ");
		}
        
        HashMap<String, Object> map = new HashMap<String, Object>();
        
        for (int i = 0; i < arr.length; i++) {
        	try {
        		map.put(arr[i][1], arr[i][2]);
			} catch (ArrayIndexOutOfBoundsException e) {
			}
		}
        
        
        ArrayList<String> ans = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
        	String ment = "";
			if(arr[i][0].equals("Enter")) {
				ment+= map.get(arr[i][1]) + "님이 들어왔습니다.";
			}else if(arr[i][0].equals("Leave")) {
				ment+= map.get(arr[i][1]) + "님이 나갔습니다.";
			}else {
				continue;
			}
			ans.add(ment);
		}
        
        String[] answer = new String[ans.size()];
        for (int i = 0; i < answer.length; i++) {
			answer[i] = ans.get(i);
		}
        
        return answer;
    }
}
