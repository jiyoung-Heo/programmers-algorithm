package 월간코드챌린지.시즌1.level2.이진변환반복하기;

//2:57
//3:22
//걸린시간: 25분
class Solution {
	// public int[] solution(String s) {
	// 	int[] answer = new int[2];
	// 	answer = go(s,0,0);
	// 	return answer;
	// }
	// public int[] go(String s, int zerocnt, int number){
	// 	if(s.equals("1")){
	// 		int[] answer = new int[2];
	// 		answer[0] = number;
	// 		answer[1] = zerocnt;
	// 		return answer;
	// 	}
	//
	// 	number++;
	//
	// 	String[] arr = s.split("");
	// 	int cnt = 0;
	// 	for (String value : arr) {
	// 		if (value.equals("0")) {
	// 			zerocnt++;
	// 		} else {
	// 			cnt++;
	// 		}
	// 	}
	//
	// 	String res = "";
	// 	while(cnt !=0 ){
	// 		res = cnt % 2 + res;
	// 		cnt /=2;
	// 	}
	//
	// 	return go(res,zerocnt,number);
	// }
//다른사람풀이
	public int[] solution(String s) {
		int[] answer = new int[2];
		int temp;
		while( !s.equals("1") ) {
			answer[1] += s.length();
			s = s.replaceAll("0", "");
			temp = s.length();
			s = Integer.toBinaryString(temp);
			answer[0]++;
			answer[1] -= temp;
		}
		return answer;
	}
}