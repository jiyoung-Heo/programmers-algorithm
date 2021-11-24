package 연습문제.level1.시저암호;
//시저 암호
public class Main17 {
	public static void main(String[] args) {
		String ans = solution("AaZz", 25);
		System.out.println(ans);
	}
	public static String solution(String s, int n) {
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
			if(arr[i] != ' ') {
				if(arr[i]>='A' && arr[i]<='Z') {
					arr[i] += n;
					if(arr[i]>'Z') {
						arr[i] -= 26;
					}
				}else {
					arr[i] += n;
					if(arr[i]>'z') {
						arr[i] -= 26;
					}
				}
			}
		}
        return String.valueOf(arr);
    }
}
