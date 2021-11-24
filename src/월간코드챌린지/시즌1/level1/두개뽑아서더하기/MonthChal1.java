package 월간코드챌린지.시즌1.level1.두개뽑아서더하기;

import java.util.Iterator;
import java.util.TreeSet;


//두개 뽑아서 더하기
//3시 2분 시작
//3시 25분 끝
//걸린시간: 23분

public class MonthChal1 {
    public static void main(String[] args) {
        int[] numbers = {2,1,3,4,1};
        int[] ans = solution(numbers);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
    public static int[] solution(int[] numbers) {
        TreeSet<Integer> set = new TreeSet<>();

        for(int i=0; i<numbers.length-1; i++) {
            for(int j=i+1; j<numbers.length; j++) {
                //두개 더한 값을 set에 담아준다. Set은 중복이 허용되지 않기 때문에 다 담아도 된다.
                //TreeSet은 자동으로 정렬해주기 때문에 따로 정렬해주지 않아도 된다.
                set.add(numbers[i] + numbers[j]);
            }
        }

        int[] answer = new int[set.size()];
        //set의 내용을 꺼내올 수 있게 iterator에 담아준다.
        Iterator<Integer> iter = set.iterator();
        for (int i = 0; i < set.size(); i++) {
            //int배열에 iter를 담는다.
            answer[i] = iter.next();
        }
        return answer;

//        ArrayList<Integer> arr = new ArrayList<>();
//
//        //두개 더한 값 담아둘곳
//        int sum = 0;
//        for (int i = 0; i < numbers.length-1; i++) {
//			for (int j = i+1; j < numbers.length; j++) {
//				sum = numbers[i]+numbers[j];
//
//				boolean flag = false;
//				for(int ans : arr) {
//					//arr배열을 돌면서 sum과 같은값이 있다면 flag를 true로 바꿔준다.
//					if(ans == sum) {
//						flag = true;
//						break;
//					}
//				}
//				//만약 flag가 false면(arr배열에 sum과 같은값이 없을경우) arr에 sum을 담아준다.
//				if(flag == false) {
//					arr.add(sum);
//				}
//			}
//		}
//        //오름차순으로 정렬
//        Collections.sort(arr);
//
//        //int 배열에 차례대로 담아준다.
//        int[] answer = new int[arr.size()];
//        for (int i = 0; i < arr.size(); i++) {
//        	answer[i] = arr.get(i);
//		}
//        return answer;
    }
}
