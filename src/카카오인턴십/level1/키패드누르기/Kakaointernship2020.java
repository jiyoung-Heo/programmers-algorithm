package 카카오인턴십.level1.키패드누르기;

//키패드누르기

public class Kakaointernship2020 {
	public static void main(String[] args) {
		int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
		String ans = solution(numbers,"right");
		System.out.println(ans);
	}
	public static String solution(int[] numbers, String hand) {
        String answer = "";
        String right = "10";
        String left = "12";
        for (int i = 0; i < numbers.length; i++) {
        	if(numbers[i] == 0) {
        		numbers[i] = 11;
        	}
        	
			if(numbers[i]==1 || numbers[i]==4 || numbers[i]==7) {
				answer += "L";
				left = numbers[i]+"";
			}else if(numbers[i]==3 || numbers[i]==6 || numbers[i]==9) {
				answer += "R";
				right = numbers[i]+"";
			}else {
				int leftcnt = 0;
				int rightcnt = 0;
				int a = numbers[i] - Integer.parseInt(left);
				int b = numbers[i] - Integer.parseInt(right);
				if(a < 0) {
					a = -a;
				}
				if(b < 0) {
					b = -b;
				}
				while(a>=1) {
					if(a == 1) {
						leftcnt++;
						break;
					}else {
						a = a-3;
						leftcnt++;
					}
				}
				if(a<0) {
					leftcnt += -a;
				}
				while(b>=1) {
					if(b == 1) {
						rightcnt++;
						break;
					}else {
						b = b-3;
						rightcnt++;
					}
				}
				if(b<0) {
					rightcnt += -b;
				}
				if(leftcnt>rightcnt) {
					answer += "R";
					right = numbers[i]+"";
				}else if(leftcnt < rightcnt) {
					answer += "L";
					left = numbers[i]+"";
				}else {
					if(hand.equals("right")) {
						answer += "R";
						right = numbers[i] + "";
					}else {
						answer += "L";
						left = numbers[i] + "";
					}
				}
			}
		}
        return answer;
    }
}
