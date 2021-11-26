package 연습문제.level2.땅따먹기;

import java.util.Arrays;
//2시39분
//3시12분
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int[][] land = {{1, 2, 3, 5}, {5, 6, 7, 8}, {4, 3, 2, 1}};
        System.out.println(main.solution(land));
    }

    int solution(int[][] land) {
        int[] ans = new int[land[0].length];

        for (int i = 0; i < land[0].length; i++) {
            boolean[] visited = new boolean[land[0].length];

            int answer = land[0][i];
            visited[i] = true;

            for (int j = 1; j < land.length; j++) {
                int big = 0;
                int check = 0;
                for (int k = 0; k < land[0].length; k++) {
                    if (visited[k] == false) {
                        if (big <= land[j][k]) {
                            big = land[j][k];
                            check = k;
                            break;
                        }
                    }
                }
                answer += big;
                visited[check] = true;
            }
            ans[i] = answer;
        }
        Arrays.sort(ans);
        return ans[land[0].length - 1];
    }
}
