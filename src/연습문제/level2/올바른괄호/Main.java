package 연습문제.level2.올바른괄호;
//올바른 괄호
//2시 시작
//2시 08분 끝
public class Main {
    boolean solution(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                count++;
            } else {
                count--;
            }
            if (count < 0) {
                return false;
            }
        }
        return count == 0;
    }
}
