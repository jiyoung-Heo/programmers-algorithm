package dfsbfs.level2.타겟넘버;

// 5:00~5:22 22min
// dfs 풀이 참고함
public class Test {
	public static void main(String[] args) {
		Test test = new Test();
		test.solution(new int[] {1,1,1,1,1}, 3);
	}
	int answer = 0;

	public int solution(int[] numbers, int target) {
		dfs(numbers, target, 0, 0);
		return answer;
	}

	public void dfs(int[] numbers, int target, int sum, int depth) {
		if (numbers.length == depth) {
			if (target == sum)
				answer++;
		}else {
			dfs(numbers, target, sum + numbers[depth], depth + 1);
			dfs(numbers, target, sum - numbers[depth], depth + 1);
			
		}

	}
}
