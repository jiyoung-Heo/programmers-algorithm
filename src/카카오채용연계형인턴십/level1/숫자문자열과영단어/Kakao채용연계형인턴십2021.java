package 카카오채용연계형인턴십.level1.숫자문자열과영단어;
//숫자 문자열과 영단어
//2시 4분시작
//2시 35분 끝
//풀이시간: 30분
//replaceAll 썼으면 쉽고 빠르게 끝날 수 있었음
//풀이법
//class Solution {
//    public int solution(String s) {
//        String[] strArr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
//        for(int i = 0; i < strArr.length; i++) {
//            s = s.replaceAll(strArr[i], Integer.toString(i));
//        }
//        return Integer.parseInt(s);
//    }
//}


public class Kakao채용연계형인턴십2021 {
	public static int solution(String s) {
        String answer = "";
        int startNum = 0;
        int endNum = 1;
        while(true) {
        	boolean stop = false;
        	String num = "";
        	try {
        		num = s.substring(startNum,endNum);
        	}catch(StringIndexOutOfBoundsException e) {
        		break;
        	}
        	try{
        		answer += Integer.parseInt(num);
        		startNum++;
        	}catch(NumberFormatException e) {
        		switch (num) {
        		case "zero":
        			answer += "0";
        			stop = true;
        			break;
        		case "one":
        			answer += "1";
        			stop = true;
        			break;
        		case "two":
        			answer += "2";
        			stop = true;
        			break;
        		case "three":
        			answer += "3";
        			stop = true;
        			break;
        		case "four":
        			answer += "4";
        			stop = true;
        			break;
        		case "five":
        			answer += "5";
        			stop = true;
        			break;
        		case "six":
        			answer += "6";
        			stop = true;
        			break;
        		case "seven":
        			answer += "7";
        			stop = true;
        			break;
        		case "eight":
        			answer += "8";
        			stop = true;
        			break;
        		case "nine":
        			answer += "9";
        			stop = true;
        			break;
        		}
        	}
        	if(stop == true) {
        		startNum = endNum;
        		endNum = startNum+1;
        	}else {
        		endNum++;
        	}
        }
        return Integer.parseInt(answer);
    }
	public static void main(String[] args) {
		System.out.println(solution("one4seveneight"));
	}
}
