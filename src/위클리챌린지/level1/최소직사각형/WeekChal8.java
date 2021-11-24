package 위클리챌린지.level1.최소직사각형;

//최소직사각형구하기
//2시 25분 시작

public class WeekChal8 {
	public static void main(String[] args) {
		int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
		System.out.println(solution(sizes));
	}
	public static int solution(int[][] sizes) {
		//카드의 가로 세로중 큰 값 저장
		int bigweight = 0;
		//카드의 가로 세로중 작은값 저장
		int bigheight = 0;

		for (int i = 0; i < sizes.length; i++) {
			//둘 중에 큰값을 big에 저장
			int big = Math.max(sizes[i][0], sizes[i][1]);
			//둘 중에 작은값을 small에 저장
			int small = Math.min(sizes[i][0], sizes[i][1]);
			if(big > bigweight) {
				bigweight = big;
			}
			if(small > bigheight) {
				bigheight = small;
			}
		}

		return bigweight*bigheight;
//        //하나의 명함의 가로 세로 길이중 긴 변을 0번째에 넣고 짧은 변을 1번째에 넣도록 재배치한다.
//        for (int i = 0; i < sizes.length; i++) {
//        	if(sizes[i][0]<sizes[i][1]) {
//        		int temp = sizes[i][0];
//        		sizes[i][0] = sizes[i][1];
//        		sizes[i][1] = temp;
//        	}
//        }
//
//        int big1 = 0;
//        int big2 = 0;
//        //가로의 가장 최대 길이는 big1, 세로의 가장 최대 길이는 big2
//        for (int i = 0; i < sizes.length; i++) {
//        	if(big1 < sizes[i][0]) {
//        		big1 = sizes[i][0];
//        	}
//        	if(big2 < sizes[i][1]) {
//        		big2 = sizes[i][1];
//        	}
//        }
//        
//        return big1*big2;
	}
}
