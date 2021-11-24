package KAKAOBLINDRECRUITMENT.level1.다트게임_1차_2018;

//[1차] 다트 게임

public class Main31 {
	public static void main(String[] args) {
		int sum = solution("1S*2T*3S");
		System.out.println("답은 "+sum);
	}
	public static int solution(String dartResult) {
        int answer = 0;
        String[] arr = dartResult.split("");
        
        //점수가 10점인 경우 
        //0이 들어있는 배열의 값을 10으로 바꾸고 1이 들어있는 배열을 빈 배열로 만든다. 
        for (int i = 0; i < arr.length; i++) {
			if(arr[i].equals("1") && arr[i+1].equals("0")) {
				arr[i+1]=arr[i]+arr[i+1];
				arr[i] = "";
			}
		}
        
        for (int i = 0; i < arr.length; i++) {
        	//D일경우 2승, T일경우 3승
			if(arr[i].equals("D")) {
				arr[i-1] = (int)Math.pow((double) Integer.parseInt(arr[i-1]), 2)+"";
			}else if(arr[i].equals("T")){
				arr[i-1] = (int)Math.pow((double) Integer.parseInt(arr[i-1]), 3)+"";
			}
			
			//*가 있을경우 해당점수와 이전점수 2배
			if(arr[i].equals("*")) {
				arr[i-2] = Integer.parseInt(arr[i-2]) * 2 + "";
				//*가 첫번째 기회에서 나온 경우는 해당점수만 2배 해야하므로 if조건설정
				if(i>3) {
					for (int j = 3; j <= 6; j++) {
						try {
							arr[i-j] = Integer.parseInt(arr[i-j]) * 2 + "";
							break;
						}catch (NumberFormatException e) {
							continue;
						}
					}
				}
			//#가 있을경우 해당점수를 마이너스로 만든다.
			}else if(arr[i].equals("#")) {
				arr[i-2] = Integer.parseInt(arr[i-2])*(-1) + "";
			}
		}
        //숫자가 들어있는 배열값들을 answer에 더해준다.
        for (int i = 0; i < arr.length; i++) {
        	try {
    			answer += Integer.parseInt(arr[i]);
			} catch (NumberFormatException e) {
				continue;
			}
		}
        return answer;
    }
}
