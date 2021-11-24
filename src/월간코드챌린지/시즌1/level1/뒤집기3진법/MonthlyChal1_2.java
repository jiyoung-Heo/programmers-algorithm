package 월간코드챌린지.시즌1.level1.뒤집기3진법;
//3진법 뒤집기
//시작시간: 5시 25분
//끝시간: 5시 35분
public class MonthlyChal1_2 {
	public int solution(int n) {
//		<다른풀이2>
		//n을 3진수로 바꿔서 저장할곳
        String three = "";
        //3진수로 바꾸기
        while(n>0) {
        	three = (n % 3) + three;
        	n /= 3;
        }
        //앞뒤 뒤집기
        three = new StringBuilder(three).reverse().toString();
        
        //3진수 다시 10진수로 바꾸기
        int answer = Integer.parseInt(three,3);
        
        return answer;
    }
//        <다른풀이1>
//        //n을 3진수로 바꿔서 저장할곳
//        String three = "";
//        //3진수로 바꾸기 + 뒤집기
//        while(n>0) {
//        	three = three + (n % 3);
//        	n /= 3;
//        }
//        
//        //3진수 다시 10진수로 바꾸기
//        int answer = Integer.parseInt(three,3);
//        
//        return answer;
//        <처음풀이>
//        n을 3진수로 바꿔서 저장할곳
//        String three = "";
//        //3진수로 바꾸기
//        while(n>0) {
//        	three = (n % 3) + three;
//        	n /= 3;
//        }
//        
//        String[] sh = three.split("");
//        //앞뒤바꾼3진수 저장할곳
//        String shake = "";
//        
//        for (int i = sh.length-1; i >= 0; i--) {
//        	shake += sh[i];
//        }
//        
//        //3진수 다시 10진수로 바꾸기
//        int answer = Integer.parseInt(shake,3);
//        
//        return answer;
}
