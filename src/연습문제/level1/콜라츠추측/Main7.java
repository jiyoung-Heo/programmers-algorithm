package 연습문제.level1.콜라츠추측;

public class Main7 {
	public static void main(String[] args) {
		int ans = solution(6);
		System.out.println(ans);
	}
    public static int solution(int num) {
        double temp = num;
        
        //for사용
        for (int i = 0; i < 500; i++) {
        	if(temp==1) {
        		return i;
        	}
        	//삼항연산자 사용한다면!
        	temp = (temp%2==0) ? temp/2 : temp*3+1;
        	
//        	if(temp%2==0) {
//        		temp/=2;
//        	}else {
//        		temp=temp*3+1;
//        	}
		}
        return -1;
        
        //while사용
//        int cnt=0;
//        
//        while(temp!=1) {
//        	if(cnt>500) {
//        		cnt=-1;
//        		break;
//        	}
//        	if(temp%2==0) {
//        		temp/=2;
//        	}else {
//        		temp=temp*3+1;
//        	}
//        	cnt++;
//        }
//        
//        return cnt;
    }
}
