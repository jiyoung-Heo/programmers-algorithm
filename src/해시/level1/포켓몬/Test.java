package 해시.level1.포켓몬;

import java.util.HashSet;
import java.util.Set;

//5:42 ~ 5:50 
//8분 소요
public class Test {
	public static void main(String[] args) {
		
	}
	public int solution(int[] nums) {
		Set<Integer> set = new HashSet<>();
		int answer = 0;
		
		for (int i = 0; i < nums.length; i++) {
			set.add(nums[i]);
		}
		if(set.size() >= nums.length/2) {
			answer = nums.length/2;
		}else {
			answer = set.size();
		}
		
        return answer;
    }
}
