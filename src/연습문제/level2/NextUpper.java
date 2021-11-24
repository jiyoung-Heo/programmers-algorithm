package 연습문제.level2;

public class NextUpper {
	public static void main(String[] args) {
		System.out.println(solution(78));
	}
	public static int solution(int n) {
        int answer = n+1;
        String n2 = Integer.toBinaryString(n);
        int[] arr = new int[2];
        for (int i = 0; i < n2.length(); i++) {
        	arr[n2.charAt(i)-48]++;
		}
        boolean flag = false;
        while(flag == false) {
        	String answer2 = Integer.toBinaryString(answer);
        	int sum = 0;
        	for (int i = 0; i < answer2.length(); i++) {
				if(answer2.charAt(i)-48 == 1) {
					sum++;
				}
			}
        	if(sum == arr[1]) {
        		break;
        	}
        	answer++;
        }
        return answer;
    }
}
