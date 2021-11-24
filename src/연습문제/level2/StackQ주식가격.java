package 연습문제.level2;

public class StackQ주식가격 {
	public static void main(String[] args) {
		
	}
	public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        
        for (int i = 0; i < prices.length-1; i++) {
        	for (int j = i+1; j < answer.length; j++) {
        		if(prices[i] > prices[j]) {
        			answer[i] = j-i;
        			break;
        		}
        		answer[i] = answer.length - 1 - i;
			}
		}
        
        return answer;
    }
}
