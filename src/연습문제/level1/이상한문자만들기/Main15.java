package 연습문제.level1.이상한문자만들기;
//이상한 문자 만들기
public class Main15 {
	public static void main(String[] args) {
		String ans = solution("try hello world");
		String ans1 = solution("TRY HELLO world ");
		String ans2 = solution("sp  ace");
		System.out.println(ans);
		System.out.println(ans1);
		System.out.println(ans2);
	}
	public static String solution(String s) {
		String answer = "";
		//s 를 char배열에 쪼개서 담기
		char[] arr =s.toCharArray();
		int cnt = 0;
		//s 길이만큼 for 돌면서
        for (int i = 0; i < arr.length; i++) {
        	//만약 공백이면
        	if(arr[i] == ' ') {
        		//answer에 공백을 더해주기
        		answer += " ";
        		//cnt초기화
        		cnt = 0;
        	}else {
        		//공백이아니면
        		//cnt가 짝수일경우 i번째 글자를 대문자로 바꾸기 홀수일경우 소문자로 바꾸기 
        		//그리고 그 바꾼 값을 answer에 더해주기
        		answer += (cnt % 2 == 0) ? 
        				(arr[i]+"").toUpperCase() : (arr[i]+"").toLowerCase();
        		//cnt하나 늘리기
        		cnt++;
        	}
		}
        //cnt 늘리고 초기화하는 원리: 공백은 제외하고 대소문자로 바꿔줘야하니까
        //ex)sp  ace->Sp  Ace 이런식으로 나와야한다고 치고 저 for문을 돌아보면
        // 첫번째 roop
        // 's' 는 공백이 아니니까 else조건 수행함. 이때 cnt는 0이니까 's'는 대문자로 바뀌어 answer에 더해짐. 그 이후 cnt 하나 늘리기
        // 결과: cnt = 1, answer = "S"
        // 두번째 roop
        // 'p' 는 공백이 아니니까 else조건 수행함. 이때 cnt는 1이니까 'p'는 소문자로 바뀌어 answer에 더해짐. 그 이후 cnt 하나 늘리기
        // 결과: cnt = 2, answer = "Sp"
        // 세번째 roop
        // ' ' 는 공백이니까 if조건 수행함. answer에 공백하나 더해주고 그이후 cnt 0 으로 초기화
        // 결과: cnt = 0, answer = "Sp "
        // 네번째 roop 
        // ' ' 는 공백이니까 if조건 수행함. answer에 공백하나 더해주고 그이후 cnt 0 으로 초기화
        // 결과: cnt = 0, answer = "Sp  "
        // 다섯번째 roop 
        // 'a' 는 공백이 아니니까 else조건 수행함. 이때 cnt는 0이니까 'A'는 대문자로 바뀌어 answer에 더해짐. 그 이후 cnt 하나 늘리기
        // 결과: cnt = 1, answer = "Sp  A"
        return answer;
    }
}
