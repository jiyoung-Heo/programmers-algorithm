package dfsbfs.level2.타겟넘버;

import java.util.ArrayList;
import java.util.List;

//3시 35분
//fail
//어떻게푸는지 방법을 모르겠음 dfsbfs 다시 보기
public class Solution {
	public int solution(int[] numbers, int target) {
		int answer = 0;

		List<String> list = new ArrayList<>();
		for(int i = 1; i<numbers.length; i++){
		}

		return answer;
	}
	public String calc(int minusCount,int numberLength, String tempCalc){
		String answer = "";

		minusCount--;
		if(minusCount > 0){
			calc(minusCount,numberLength,tempCalc);
		}

		return answer;
	}
}
