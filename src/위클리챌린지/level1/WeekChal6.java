package 위클리챌린지.level1;
//6주차 복서 정리하기
//시작시간 5시 32분

public class WeekChal6 {
	public static void main(String[] args) {
		int[] weights = {50,82,75,120};
		String[] head2head = {"NLWL","WNLL","LWNW","WWLN"};
		int[] arr = solution(weights,head2head);
		for (int i = 0; i < head2head.length; i++) {
			System.out.println(arr[i]);
		}
	}
	public static int[] solution(int[] weights, String[] head2head) {
		String[][] head2headArr = new String[head2head.length][head2head.length];
		for (int i = 0; i < head2head.length; i++) {
			head2headArr[i] = head2head[i].split("");
		}
		//승률
		int[] winEvg = new int[head2head.length];

		//본인보다 무거운상대를 이긴 횟수
		int[] wintoWeightCnt = new int[head2head.length];

		for (int i = 0; i < head2headArr.length; i++) {
			for (int j = 0; j < head2headArr.length; j++) {
				if(head2headArr[i][j].equals("W")) {
					int test = (weights[i] > weights[j]) ? wintoWeightCnt[i]++ : wintoWeightCnt[j]++;
					winEvg[i]++;
				}
			}
		}
		for (int i = 0; i < winEvg.length; i++) {
			winEvg[i] = winEvg[i]/head2head.length;
		}

		int[] ans = new int[head2head.length];

		for (int i = 0; i < head2headArr.length-1; i++) {
			for (int j = i; j < head2headArr.length; j++) {
				if(winEvg[i] > winEvg[j]) {
					ans[j]++;
				}else if(winEvg[i] < winEvg[j]) {
					ans[i]++;
				}else {
//        			두 값이 같은경우
					if(wintoWeightCnt[i]>wintoWeightCnt[j]) {
						ans[j]++;
					}else if(wintoWeightCnt[i]<wintoWeightCnt[j]) {
						ans[i]++;
					}else {
//        				무거운사람 이긴횟수같은경우
						if(weights[i]>weights[j]) {
							ans[j]++;
						}else if(weights[i]<weights[j]) {
							ans[i]++;
						}else {
							ans[j]++;
						}
					}
				}
			}
		}

		int[] answer = new int[head2head.length];
		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < answer.length; j++) {

			}
		}

		return answer;
	}
}
