package 정렬.level1.K번째수;

import java.util.Arrays;

//k번째 수
//시작 3시 38분
//끝 3시 52분 
//걸린시간: 14분
public class Sort {
	public static void main(String[] args) {
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		int[] ans = solution(array,commands);
		for (int i = 0; i < ans.length; i++) {
			System.out.println(ans[i]);
		}
	}
	public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for (int i = 0; i < commands.length; i++) {
//        	int cnt = 0;
//        	int[] splitArr = new int[commands[i][1]-commands[i][0]+1];
//        	
//        	for (int j = commands[i][0]-1; j < commands[i][1]; j++) {
//        		splitArr[cnt] = array[j];
//        		cnt++;
//			}
        	//배열 잘라서 splitArr배열에 담아주기
        	int[] splitArr =Arrays.copyOfRange(array,  commands[i][0]-1, commands[i][1]);
        	//splitArr정렬
        	Arrays.sort(splitArr);
        	//splitArr의 특정번째 인덱스를 추출한다.
        	answer[i] = splitArr[commands[i][2]-1];
		}
        return answer;
    }
}
