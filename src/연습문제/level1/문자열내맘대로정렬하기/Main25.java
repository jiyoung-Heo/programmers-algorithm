package 연습문제.level1.문자열내맘대로정렬하기;
//문자열 내 마음대로 정렬하기
public class Main25 {
	public static void main(String[] args) {
//		String[] q = {"bace","aace","bdce"};
//		String[] q = {"a","a","ab"};
		String[] q = {"bace","aace","bdce"};
		String[] ans = solution(q, 0);
		for (int i = 0; i < ans.length; i++) {
			System.out.println(ans[i]);
		}
	}
	public static String[] solution(String[] strings, int n) {
        for (int i = 0; i < strings.length-1; i++) {
        	for (int j = i+1; j < strings.length; j++) {
        		char[] arr = strings[i].toCharArray();
        		char[] qArr = strings[j].toCharArray();
        		if(arr[n] > qArr[n]) {
        			String temp = strings[j];
        			strings[j] = strings[i];
        			strings[i] = temp;
        		}else if(arr[n] == qArr[n]) {
        			if(strings[i].compareTo(strings[j]) > 0) {
        				String temp = strings[j];
            			strings[j] = strings[i];
            			strings[i] = temp;
        			}
        		}
				
			}
		}
        return strings;
    }
}
