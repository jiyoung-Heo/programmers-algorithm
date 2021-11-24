package 연습문제.level1.year2016;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

//2016년
public class Main33 {
	public static String solution(int a, int b) {
        String answer = "";
        String[] dayArr = {"SUN", "MON", "TUE", "WED", "THU", "FRI","SAT"};
        
        String month = a+"";
        if(a<10) {
        	month = "0" + a;
        }
        String day = b+"";
        if(b<10) {
        	day = "0" + b;
        }
        
        //DAteFormat으로 날짜 세팅해주고
        DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
        Date date = null;
		try {
			//dateFormat.parse(String형): String형을 Date형으로 바꿔준다.
			date = dateFormat.parse("2016"+month+day);
		} catch (ParseException e) {
			e.printStackTrace();
		}
        Calendar calendar = Calendar.getInstance();
        //Date객체를 Calendar로 변환
        calendar.setTime(date);
        
        //calendar.get(Calendar.DAY_OF_WEEK) 은 요일을 구해준다.
        //일요일이면 1, 월요일은 2 ... 토요일이면 7을 리턴한다.
        //dayArr 안의 몇번째 방인지 구할때 -1을 해준다. 
        //ex) 일요일이면 dayArr[0]이기 때문에 dayArr[1-1] 해줌
        answer = dayArr[calendar.get(Calendar.DAY_OF_WEEK)-1];
        
        return answer;
    }
	public static void main(String[] args) {
		String ans = solution(1,2);
		System.out.println(ans+"끝");
	}
}
