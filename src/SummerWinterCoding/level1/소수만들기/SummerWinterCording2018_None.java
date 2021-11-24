package SummerWinterCoding.level1.소수만들기;
//소수 만들기
//2시 17분 시작
//에라토스테레스의 체에 의하면 2,3,5,7의 배수를 제외한 값이 소수라고 했는데 왜 반이 틀린지,,?
public class SummerWinterCording2018_None {
	public static void main(String[] args) {
		
	}
	public int solution(int[] nums) {
        int answer = 0;
        for (int i = 0; i < nums.length-2; i++) {
			for (int j = i+1; j < nums.length-1; j++) {
				for (int j2 = j+1; j2 < nums.length; j2++) {
					System.out.println(nums[i]+","+nums[j]+","+nums[j2]);
					int num = nums[i]+nums[j]+nums[j2];
					if((num % 2 != 0 && num % 3 != 0 && num % 5 != 0 && num % 7 !=0)
							|| num == 2 || num == 3|| num == 5|| num == 7) {
						answer++;
					}
				}
			}
		}

        return answer;
    }
}
