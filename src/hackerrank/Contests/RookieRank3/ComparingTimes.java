package hackerrank.Contests.RookieRank3;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Scanner;


public class ComparingTimes {
	
	static String timeCompare(String t1,String t2) throws ParseException{
		String outputStr="";
		String[] time1=getTime(t1);
		String[] time2=getTime(t2);
		
		Calendar cal1 = Calendar.getInstance();
		cal1.set(Calendar.HOUR, Integer.parseInt(time1[0]));
		cal1.set(Calendar.MINUTE, Integer.parseInt(time1[1]));
		cal1.set(Calendar.SECOND, 0);
		int amPm = Calendar.AM;
		if(time1[2].equalsIgnoreCase("AM")){
		     amPm = Calendar.AM;
		} else if (time1[2].equalsIgnoreCase("PM")){
		     amPm = Calendar.PM;
		}
		cal1.set(Calendar.AM_PM, amPm);

		Calendar cal2 = Calendar.getInstance();
		cal2.set(Calendar.HOUR, Integer.parseInt(time2[0]));
		cal2.set(Calendar.MINUTE, Integer.parseInt(time2[1]));
		cal2.set(Calendar.SECOND, 0);
		amPm = Calendar.AM;
		if(time2[2].equalsIgnoreCase("AM")){
		     amPm = Calendar.AM;
		} else if (time2[2].equalsIgnoreCase("PM")){
		     amPm = Calendar.PM;
		}
		cal2.set(Calendar.AM_PM, amPm);
		
		if(cal1.after(cal2)){
			outputStr="First";
		}
		else
			outputStr="Second";
		
		return outputStr;
	}
	static String[] getTime(String t1){
		String[] times=t1.split(":");
		String[] output=new String[3];
		if(times.length>0){
			output[0]=times[0];
			output[1]=times[1].substring(0, 1);
			//output[2]=times[1].substring(2, 3);
			
			if(times[1].contains("AM")){
				output[2] = "AM";
			} else if (times[1].contains("PM")){
				output[2] = "PM";
			}
		}
		return output;
	}

	
	public static void main(String[] args) throws ParseException {
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		for(int a0 = 0; a0 < q; a0++){
			String t1 = in.next();
			String t2 = in.next();
			String result = timeCompare(t1, t2);
			System.out.println(result);
		}
		in.close();
	}
}
