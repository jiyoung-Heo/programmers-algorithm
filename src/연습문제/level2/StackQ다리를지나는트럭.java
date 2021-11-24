package 연습문제.level2;

import java.util.ArrayList;

//다리를 지나는 트럭

public class StackQ다리를지나는트럭 {
	public static void main(String[] args) {
		int[] truck_weights = {10,10,10,10,10,10,10,10,10,10};
		int ans = solution(100,100,truck_weights);
		System.out.println(ans);
	}
	public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        ArrayList<Integer> truckList = new ArrayList<Integer>();
        for(int a : truck_weights) {
        	truckList.add(a);
        }
        int[] bridge_ing = new int[bridge_length];
        ArrayList<Integer> passed_bridge = new ArrayList<Integer>();
        
        while(passed_bridge.size() != truck_weights.length) {
        	if(bridge_ing[bridge_ing.length-1] !=0) {
        		passed_bridge.add(bridge_ing[bridge_ing.length-1]);
        		bridge_ing[bridge_ing.length-1] = 0;
        	}
        	
        	for (int i = bridge_ing.length-1; i > 0; i--) {
        		bridge_ing[i] = bridge_ing[i-1];
			}
        	bridge_ing[0] = 0;
        	
        	//다리에 실려있는 차의 무게 총 합
        	int weightSum = 0;
        	for (int i = 0; i < bridge_ing.length; i++) {
        		weightSum += bridge_ing[i];
			}
        	
        	//무게가 적을경우에만 추가하기
        	if(truckList.size() != 0 && weightSum + truckList.get(0) <= weight) {
        		bridge_ing[0] = truckList.get(0);
        		truckList.remove(0);
        	}else {
        		bridge_ing[0] = 0;
        	}
        	answer++;
        	
        }
        return answer;
    }
}
