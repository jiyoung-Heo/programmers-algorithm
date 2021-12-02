package 연습문제.level2.가장큰정사각형찾기;
//2시 40분시작
//dp 문제 라는데 모르게씀,,

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int[][] board = {{0,1,1,1}, {1,1,1,1}, {1,1,1,1}, {0,0,1,0}};
//        int[][] board = {{0,0,1,1},{1,1,1,1}};
        System.out.println(main.solution(board));
    }
    public int solution(int[][] board) {
        int last = 0;
        if (board[0].length > board.length) {
            last = board.length-1;
        } else {
            last = board[0].length-1;
        }
        int answer = 0;

        for (int i = 0; i < board.length; i++) {
            int cnt = 1;
            boolean check = true;
            for (int j = 0; j < board[0].length; j++) {
                if(i+cnt <= last && j+cnt <= last){
                    for (int k = 0; k <= cnt; k++) {
                        for (int kk = 0; kk <= cnt; kk++) {
                            if (board[i + k][j + kk] == 0) {
                                check = false;
                                break;
                            }
                        }
                    }
                }
            }
            System.out.println(cnt);
            if (check) {
                answer = (cnt + 1) * (cnt + 1);
                cnt++;
            }
        }
        return answer;
    }
}
