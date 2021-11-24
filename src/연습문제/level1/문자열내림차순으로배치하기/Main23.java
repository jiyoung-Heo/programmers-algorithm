package 연습문제.level1.문자열내림차순으로배치하기;

import java.util.Arrays;
import java.util.Collections;

public class Main23 {
	public static void main(String[] args) {
		String flag = solution("Zbcdefg");
		System.out.println(flag);
	}
	public static String solution(String s) {
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length-1; i++) {
        	for (int j = i; j < arr.length; j++) {
				if(arr[i]<arr[j]) {
					char temp;
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
        return String.valueOf(arr);
		
//        char[] sol = s.toCharArray();
//		  Arrays.sort(sol);
//        return new StringBuilder(new String(sol)).reverse().toString();
    }
}
