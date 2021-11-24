package KAKAOBLINDRECRUITMENT.level1.비밀지도_1차_2018;
//6 : 51시작
//7 : 44 끝
//걸린시간 -> 53분
//미쳤나 이거하나에이렇게오래걸려? ㅜ
public class KaKaoBlind2018 {
	public static void main(String[] args) {
		int[] arr1 = {9,20,28,18,11};
		int[] arr2 = {30,1,21,17,28};
		String[] ans = solution(5,arr1,arr2);
		for (int i = 0; i < 5; i++) {
			System.out.println(ans[i]);
		}
	}
	public static String[] solution(int n, int[] arr1, int[] arr2) {
		int[][] reArr1 = new int[n][n];
		int[][] reArr2 = new int[n][n];
		for (int i = 0; i < n; i++) {
			//10진수를 2진수로 변환하기
			String temp = Integer.toBinaryString(arr1[i]);
			String temp2 = Integer.toBinaryString(arr2[i]);

			//cnt는 2진수로 변환 + 자리수 맞추기 까지 한 값
			String cnt = "";
			String cnt2 = "";

			//2진수로 변환한 값이 n자리가 아니면 부족한 자리수만큼 앞에 0을 채워야 한다.
			if(temp.length()<n) {
				for (int j = 0; j < n-temp.length(); j++) {
					cnt += 0;
				}
			}
			cnt += temp;
			if(temp2.length()<n) {
				for (int j = 0; j < n-temp2.length(); j++) {
					cnt2 += 0;
				}
			}
			cnt2 += temp2;

			//cnt를 한자리씩 쪼개서 int[][] 배열에 담는다.
			for (int j = 0; j < n; j++) {
				reArr1[i][j] = Integer.parseInt(cnt.charAt(j)+"");
				reArr2[i][j] = Integer.parseInt(cnt2.charAt(j)+"");
			}
		}

		String[] ans = new String[n];

		for (int i = 0; i < n; i++) {
			ans[i] = "";
			for (int j = 0; j < n; j++) {
				//두 배열의 값이 모두 0이면 공백, 그렇지않으면 #으로 치환하여 저장한다.
				if(reArr1[i][j]==0 && reArr2[i][j]==0) {
					ans[i] += " ";
				}else {
					ans[i] += "#";
				}
			}
		}

		return ans;
	}
}














