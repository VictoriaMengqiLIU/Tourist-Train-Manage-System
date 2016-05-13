/*
 * Copyright (c) 2016 Victoria Mengqi LIU. All rights reserved.
 */

/*
 * Calculate the difference between specific time(HH:mm:ss)
 * which give the caller a String(HH:mm:ss) format time-duration feedback
 * 
 * @author Victoria Mengqi LIU
 * @version 1.0
 */

package uk.ac.qmul;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeDiff {
	
	private String startTime;
	private String endTime;

	public TimeDiff() {

	}

	public TimeDiff(String start, String end) {
		startTime = start;
		endTime = end;
		calcDiff(startTime, endTime);
	}

	/*
	 * time difference
	 * Calculate the difference between two input time(HH:mm:ss)
	 * 
	 * @param startTime
	 * @param endTime
	 * @return difftime
	 */
	public static String calcDiff(String startTime, String endTime) {
		SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");

		Date d1 = null;
		Date d2 = null;
		String difftime = "";

		try {
			d1 = format.parse(startTime);
			d2 = format.parse(endTime);
			
			long diff = d2.getTime() - d1.getTime();

			long diffSeconds = diff / 1000 % 60;
			long diffMinutes = diff / (60 * 1000) % 60;
			long diffHours = diff / (60 * 60 * 1000) % 24;
			
			if (diffSeconds < 10) {
				String diffS = "0" + diffSeconds;
			} else {
				String diffS = "" + diffSeconds;
			}

			if (diffMinutes < 10) {
				String diffM = "0" + diffMinutes;
			} else {
				String diffM = "" + diffMinutes;
			}

			if (diffHours < 10) {
				String diffH = "0" + diffHours;
			} else {
				String diffH = "" + diffHours;
			}

			difftime = diffH + ":" + diffM + ":" + diffS;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return difftime;
	}
}
