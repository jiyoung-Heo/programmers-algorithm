package 연습문제.level1.문자열내p와y의개수;
//문자열 내 p와 y의 개수
public class Main24 {
	public static void main(String[] args) {
		
	}
	boolean solution(String s) {
        boolean answer = true;
        char[] arr = s.toCharArray();
        int cnt=0;
        for (int i = 0; i < arr.length; i++) {
        	if(arr[i]=='p' || arr[i]=='P') {
        		cnt++;
        	}else if(arr[i]=='y' || arr[i]=='Y') {
        		cnt--;
        	}
		}
        if(cnt!=0) answer = false;
        return answer;
    }
}
