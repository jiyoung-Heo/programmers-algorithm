package 연습문제.level1.같은숫자는싫어;
//같은 숫자는 싫어
import java.util.ArrayList;

public class Main28 {
	public static int[] solution(int []arr) {
        ArrayList<Integer> array = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
        	//1. 중복 되지 않는 수 추가하기
        	//2. 중복 되는 수인 경우 바로 앞 인덱스에 위치한 값이 
        	//	 본인의 값과 같은지 확인후 같지않다면 추가하기
        	
        	//arr[i]값에 해당하는 마지막 인덱스가 존재하지 않으면 -1리턴함.
        	//즉 if조건이 성립한다면 arr[i]는 중복되지 않는 수이다.
        	if(array.lastIndexOf(arr[i]) == -1) {
        		array.add(arr[i]);
        	//첫번째 if에서 arr[0]이 무조건 성립되기 때문에 
        	//indexoutofboundsException이 발생하지 않는다.
        	}else if(arr[i-1] != arr[i]) {
        		array.add(arr[i]);
        	}
		}
        
        int[] answer = new int[array.size()];
        for (int i = 0; i < array.size(); i++) {
			answer[i] = array.get(i);
		}
        return answer;
    }
	public static void main(String[] args) {
		int[] arr = {1,1,3,3,0,1,1};
		int[] ans = solution(arr);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i]+" ");
		}
	}
}
