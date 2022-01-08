package 정렬.level2.가장큰수;

import java.util.ArrayList;
import java.util.List;

//12:50
//2:33
// 26.7점
public class Solution {
	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] numbers = {1,2,21,21};
		System.out.println(solution.solution(numbers));
	}
	public String solution(int[] numbers) {
		List<String> list = new ArrayList<>();
		for (int i = 0; i < numbers.length; i++) {
			list.add(numbers[i] + "");
		}

		List<String> sortResult = new ArrayList<>();
		List<String> ans = goSort(list, sortResult, 0, 9);
		String answer = "";
		
		for(String s : ans){
			answer += s;
		}
		if(ans.get(0) == "0"){
			answer = "0";
		}

		return answer;
	}

	public List<String> goSort(List<String> list, List<String> sortResult, int index, int count) {
		System.out.println(count);
		System.out.println(index);
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).split("").length == index + 1) {
				if(list.get(i).equals("0")){
					continue;
				}
				if (list.get(i).split("").length == index + 1) {
					if (list.get(i).split("")[index].equals(count + "")) {
						System.out.println(list.get(i));
						sortResult.add(list.get(i));
					}
				}
			}
		}

		if (index >= 4) {
			if (count-1 < 0) {
				for (int i = 0; i < list.size(); i++) {
					if(list.get(i).equals("0")){
						sortResult.add("0");
					}
				}
				return sortResult;
			}
			 return goSort(list, sortResult, 0, count - 1);
		}

		return goSort(list, sortResult, index + 1, count);
	}
}
// [[6, 10, 2], "6210"],
// 	[[3, 30, 34, 5, 9], "9534330"],
// 	[[10, 101], '10110'],
// 	[[1, 11, 111, 1111], '1111111111'],
// 	[[0, 0, 0, 0, 0, 0], '0'],
// 	[[2,20,200], '220200'],
// 	[[0,0,70], '7000'],
// 	[[0,0,0,1000], '1000000'],
// 	[[0,0,1000,0], '1000000'],
// 	[[1000,0,0], '100000'],
// 	[[12,121], '12121'],
// 	[[21,212], '21221'],
// 	[[11, 12, 10], '121110'],
// 	[[0,0,0,1], '1000'],
// 	[[1,2,3,1,1,3], '332111'],
// 	[[1,2,21,21], '221211']