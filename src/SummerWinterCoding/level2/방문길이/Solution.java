package SummerWinterCoding.level2.방문길이;

//6:27시작
//7:13 실패
//방향성을 가져야 하는데 그렇게 구현하지 못했다
//25점맞음
public class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("LULLLLLLU"));
    }

    public int solution(String dirs) {
        int answer = 0;
        //왼 오 위 아래
        boolean[][][][] visited = new boolean[11][11][11][11];

        int x = 5;
        int y = 5;

        String[] dirArr = dirs.split("");
        for (String s : dirArr) {
            int moveX = x;
            int moveY = y;
            switch (s) {
                case "U":
                    if (y < 10) {
                        moveY++;
                        answer = answerPlus(visited,x,y,moveX,moveY,answer);
                        y = moveY;
                    }
                    break;
                case "D":
                    if (y > 0) {
                        moveY--;
                        answer = answerPlus(visited,x,y,moveX,moveY,answer);
                        y = moveY;
                    }
                    break;
                case "L":
                    if (x > 0) {
                        moveX--;
                        answer = answerPlus(visited,x,y,moveX,moveY,answer);
                        x = moveX;
                    }
                    break;
                case "R":
                    if (x < 10) {
                        moveX++;
                        answer = answerPlus(visited,x,y,moveX,moveY,answer);
                        x = moveX;
                    }
                    break;
            }
        }
        return answer;
    }
    public int answerPlus(boolean[][][][] visited,int x,int y,int moveX,int moveY, int answer){
        if(!visited[x][y][moveX][moveY] && !visited[moveX][moveY][x][y]){
            visited[x][y][moveX][moveY] = true;
            visited[moveX][moveY][x][y] = true;
            answer++;
        }
        return answer;
    }
}
