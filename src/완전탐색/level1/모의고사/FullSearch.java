package 완전탐색.level1.모의고사;

import java.util.ArrayList;

//모의고사
//4시 24분 시작
//5시 12분 끝 
//걸린시간 48분
public class FullSearch {
	public static void main(String[] args) {
		int[] answers= {1,2,3,4,5};
//		int[] answers= {1,3,2,4,2};
		int[] ans = solution(answers);
	}
	public static int[] solution(int[] answers) {
        int[] one = {1, 2, 3, 4, 5};
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int[] score = new int[3];
        
        for (int i = 0; i < answers.length; i++) {
        	if(answers[i] == one[i%one.length]) {
        		score[0]++;
        	}
        	if(answers[i] == two[i%(two.length)]) {
        		score[1]++;
        	}
        	if(answers[i] == three[i%(three.length)]) {
        		score[2]++;
        	}
		}
        //최대값 구하기
        int maxCount = Math.max(score[0], Math.max(score[1], score[2]));
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(maxCount==score[0]) list.add(1);
        if(maxCount==score[1]) list.add(2);
        if(maxCount==score[2]) list.add(3);
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
        
        return answer;
    }
}
