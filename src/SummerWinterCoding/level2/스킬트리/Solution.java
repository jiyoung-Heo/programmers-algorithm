package programmers.src.SummerWinterCoding.level2.스킬트리;

import java.util.Arrays;
import java.util.List;

//1:55
//2:30
//걸린시간: 35분
//코드가 더러움 리팩토링 필요 다른사람풀이 보고 개선할것

public class Solution {
	public int solution(String skill, String[] skill_trees) {
		int answer = 0;
		List<String> skillArray = Arrays.asList(skill.split(""));
		for (String skill_tree : skill_trees) {
			int count = 0;
			List<String> treeArray = Arrays.asList(skill_tree.split(""));
			for (int k = 0; k < skillArray.size() - 1; k++) {
				if (!checkIndex(skillArray, treeArray, k)) {
					break;
				}
				count++;
			}
			if (skillArray.size() - 1 == count) {
				answer++;
			}
		}

		return answer;
	}

	public boolean checkIndex(List<String> skillArray, List<String> treeArray, int index) {
		int firstIndex = treeArray.indexOf(skillArray.get(index));
		int secondIndex = treeArray.indexOf(skillArray.get(index + 1));

		return (firstIndex < secondIndex || secondIndex == -1) && firstIndex != -1 || (firstIndex == -1
			&& secondIndex == -1);
	}
}
