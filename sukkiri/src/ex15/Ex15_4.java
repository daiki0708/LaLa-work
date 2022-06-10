package ex15;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex15_4 {

	public static void main(String[] args) {
		Date now = new Date();
		Calendar c = Calendar. getInstance();
		c.setTime(now);
		System.out.println(now);
		int day = c.get(Calendar.DAY_OF_MONTH);
		System.out.println("now:" + now);
		
		day +=100;
		c.set(Calendar.DAY_OF_MONTH, day);
		Date future = c.getTime();
		
		SimpleDateFormat f = new SimpleDateFormat("西暦yyyy年MM月dd日");
		System.out.println(f.format(future));
		
	}

}
