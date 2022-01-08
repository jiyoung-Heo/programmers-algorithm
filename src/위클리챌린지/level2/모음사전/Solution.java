package 위클리챌린지.level2.모음사전;

//2:30
//3:05
//35m
//규칙 찾으면 되는 문제였음. 근데 비슷한거 나오면 못풀듯
public class Solution {
	public int solution(String word) {
		int answer = word.length();

		String str = "AEIOU";
		int[] x = {781, 156, 31, 6, 1};

		for (int i = 0; i < word.length(); i++) {
			int idx = str.indexOf(word.charAt(i));
			answer += x[i] * idx;
			System.out.println(answer);
		}

		return answer;
	}
}
