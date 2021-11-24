package 연습문제.level2.최댓값과최솟값;
//최댓값과 최솟값
//1시 59분 시작
//2시 4분 종료 -- 걸린시간: 5분
public class Main {
    public String solution(String s) {
        String[] array = s.split(" ");
        int small = Integer.parseInt(array[0]);
        int big = Integer.parseInt(array[0]);
        for (String value : array) {
            if (Integer.parseInt(value) > big) {
                big = Integer.parseInt(value);
            } else if (Integer.parseInt(value) < small) {
                small = Integer.parseInt(value);
            }
        }

        return small + " " + big;
    }
}
