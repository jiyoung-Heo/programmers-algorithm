package 연습문제.level2.가장큰정사각형찾기;
//2시 40분시작
//dp 문제 라는데 모르게씀,,

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		int[][] board = {{0, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {0, 0, 1, 0}};
		//        int[][] board = {{0,0,1,1},{1,1,1,1}};
		System.out.println(main.solution(board));
	}

	public int solution(int[][] board) {
		int[][] arr = new int[board.length + 1][board[0].length + 1];
		for (int i = 0; i < board.length; i++) {
			for (int k = 0; k < board[0].length; k++) {
				arr[i + 1][k + 1] = board[i][k];
            }
        }

        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int k = 0; k < arr[0].length; k++) {
                if(arr[i][k] != 0){
                    arr[i][k] = Math.min(arr[i-1][k],Math.min(arr[i][k-1],arr[i-1][k-1]))+1;
                    if(arr[i][k] >= max){
                        max = arr[i][k];
                    }
                }
            }
        }

        return max*max;
    }
}
