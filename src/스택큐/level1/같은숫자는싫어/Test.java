package 스택큐.level1.같은숫자는싫어;

import java.util.Stack;

//6:12  ~ 6:44
//32min
public class Test {
	public static void main(String[] args) {
		Test test = new Test();
		test.solution(new int[] {1,1,3,3,0,1,1});
	}
	public int[] solution(int[] arr) {
		
		Stack<Integer> stack = new Stack<Integer>();
		
		for (int data : arr) {
			if(!stack.isEmpty()) {
				if(stack.peek() == data) {
					continue;
				}
			}
			stack.push(data);
		}
		
		int[] answer = new int[stack.size()];
		
		for (int i = stack.size()-1; i >= 0; i--) {
			answer[i] = stack.pop();
		}		
		
		return answer;
	}
}
