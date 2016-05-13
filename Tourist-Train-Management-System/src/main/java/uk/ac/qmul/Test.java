/*
 * Copyright (c) 2016 Victoria Mengqi LIU. All rights reserved.
 */

/*
 * This is a Test file
 *
 * @author Victoria Mengqi LIU
 * @version 1.0
 */

package uk.ac.qmul;

public class Test {
	
	public static void main(String[] args) {
		String timeStart = "09:29:58";
		String timeEnd = "10:31:48";
		String diff = "";
	
		TimeDiff repl = new TimeDiff();
		diff = repl.calcDiff(timeStart, timeEnd);
		System.out.println(diff);
	}
}
