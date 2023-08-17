package dfsbfs.level2.게임맵최단거리;

import java.util.LinkedList;
import java.util.Queue;

//5:25
//bfs 사용
public class Test {
	int[] dx = { 1, 0, -1, 0 };
	int[] dy = { 0, 1, 0, -1 };

	public static void main(String[] args) {
		Test test = new Test();
		System.out.println(test.solution(new int[][] { { 1, 0, 1, 1, 1 }, { 1, 0, 1, 0, 1 }, { 1, 0, 1, 1, 1 },
				{ 1, 1, 1, 0, 1 }, { 0, 0, 0, 0, 1 } }));
	}

	public int solution(int[][] maps) {
		int[][] visited = new int[maps.length][maps[0].length];
		bfs(maps, visited);
		return visited[maps.length - 1][maps[0].length - 1] == 0 ? -1 : visited[maps.length - 1][maps[0].length - 1];
	}

	public void bfs(int[][] maps, int[][] visited) {
		int x = 0;
		int y = 0;

		visited[x][y] = 1;

		Queue<int[]> que = new LinkedList<>();
		que.add(new int[] { x, y });

		while (!que.isEmpty()) {
			int[] current = que.remove();
			int curruntX = current[0];
			int curruntY = current[1];

			for (int i = 0; i < dx.length; i++) {
				int nextX = curruntX + dx[i];
				int nextY = curruntY + dy[i];

				if (nextX < 0 || nextY < 0 || nextX > maps.length - 1 || nextY > maps[0].length - 1) {
					continue;
				}

				if (visited[nextX][nextY] == 0 && maps[nextX][nextY] == 1) {
					visited[nextX][nextY] = visited[curruntX][curruntY] + 1;
					que.add(new int[] { nextX, nextY });
				}
			}
		}
	}

}
