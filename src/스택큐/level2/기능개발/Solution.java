package 스택큐.level2.기능개발;

import java.util.ArrayList;
import java.util.List;

//1:50
//2:29
//40분
public class Solution {
	public int[] solution(int[] progresses, int[] speeds) {
		List<Integer> list = new ArrayList<>();

		for(int i = 0; i< progresses.length; i++){
			int count = (100-progresses[i])/speeds[i];
			if((100-progresses[i])%speeds[i] !=0){
				count++;
			}
			list.add(count);
		}
		List<Integer> ans = new ArrayList<>();
		for(int i = 0; i<list.size(); i++){
			int cnt = 1;
			int a = list.get(i);
			for(int k =i+1; k<list.size()-1; k++){
				if(a>=list.get(k)){
					cnt++;
				}else{
					i = k;
					System.out.println(i);
					break;
				}
			}
			ans.add(cnt);
		}

		int[] answer = new int[ans.size()];
		for(int i = 0; i<ans.size(); i++){
			answer[i] = ans.get(i);
		}
		return answer;
	}
	//다른사람풀이
	//import java.util.Arrays;
	// import java.util.ArrayList;
	//
	// class Solution {
	//     public int[] solution(int[] progresses, int[] speeds) {
	//         int[] answer = new int[100];
	//         int date = 0;
	//         for( int i=0; i < progresses.length; i++) {
	//             System.out.println(date);
	//             while(progresses[i] + (date*speeds[i]) < 100) {
	//                 date++;
	//             }
	//             answer[date]++;
	//         }
	//         return Arrays.stream(answer).filter(i -> i!=0).toArray();
	//     }
	// }
}
