package chap10NumberFormatting;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class NumberFormatting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = String.format("%, d", 1000000000);
		System.out.println(s);
		
		String s2 = String.format("I have %.2f bugs to fix," , 47658.9018);
		System.out.println(s2);
		
		String time1 = String.format("%tc", new Date());
		System.out.println(time1);
		
		String time2 = String.format("%tr", new Date());
		System.out.println(time2);
		
		Date today = new Date();
		String toDay1 = String.format("%tA, %<tB %<td", today, today, today);
		System.out.println(toDay1);
		
		
		//Calendar
		Calendar c = Calendar.getInstance();
		c.set(2018, 0, 0, 15, 40);
		long day1 = c.getTimeInMillis();
		day1+=1000 * 60 * 60;
		System.out.println("new hour " + c.get(c.HOUR_OF_DAY));
		c.add(c.DATE, 35);
		System.out.println("add 35 days " + c.getTime());
		
		
	}

}
