package 탐욕법.level1.체육복;

import java.util.ArrayList;

//체육복
//시작시간 9시 14분
//끝시간 
public class Greedy_None {
	public static void main(String[] args) {
		int[] lost = {3};
		int[] reserve = {1};
		System.out.println(solution(3, lost, reserve));
	}
	public static int solution(int n, int[] lost, int[] reserve) {
        int answer = n-lost.length;
        ArrayList<Integer> lostList =new ArrayList<Integer>();
        ArrayList<Integer> reserveList =new ArrayList<Integer>();
        for (int i = 0; i < lost.length; i++) {
        	lostList.add(lost[i]);
        }
        for (int i = 0; i < reserve.length; i++) {
        	reserveList.add(reserve[i]);
		}
        //여벌체육복을 가져온 학생이 도난당한 경우
        for (int i = 0; i < lost.length; i++) {
        	if(reserveList.contains(lostList.get(i))) {
        		reserveList.remove((Integer)lostList.get(i));
        		lostList.remove(i);
        		answer++;
        	}
		}
        
        //도난당한 학생에게 체육복을 빌려주는 경우
        for (int i = 0; i < lostList.size(); i++) {
			if(reserveList.contains(lostList.get(i)-1)) {
				answer++;
				reserveList.remove((Integer)(lostList.get(i)-1));
			}else if(reserveList.contains(lostList.get(i)+1)) {
				answer++;
				reserveList.remove((Integer)(lostList.get(i)+1));
			};
		}
//        for (int i = lostList.size()/2; i < lostList.size(); i++) {
//        	if(reserveList.contains(lostList.get(i)+1)) {
//				answer++;
//				reserveList.remove((Integer)(lostList.get(i)+1));
//			}else if(reserveList.contains(lostList.get(i)-1)){
//				answer++;
//				reserveList.remove((Integer)(lostList.get(i)-1));
//			};
//		}
        
        return answer;
    }
}
