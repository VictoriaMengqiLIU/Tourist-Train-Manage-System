/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group34v2;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Victoria
 */
public class TimeHelper {
    
    public static String calcTimeDiff(String bTime, String eTime) {
	SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");

        Date d1 = null;
	Date d2 = null;
	String difftime = "";
        String diffS, diffM, diffH;

        try {
            d1 = format.parse(bTime);
            d2 = format.parse(eTime);
			
            long diff = d2.getTime() - d1.getTime();

            long diffSeconds = diff / 1000 % 60;
            long diffMinutes = diff / (60 * 1000) % 60;
            long diffHours = diff / (60 * 60 * 1000) % 24;
			
            if (diffSeconds < 10) {
		diffS = "0" + diffSeconds;
            } else {
		diffS = "" + diffSeconds;
            }

            if (diffMinutes < 10) {
		diffM = "0" + diffMinutes;
            } else {
		diffM = "" + diffMinutes;
            }

            if (diffHours < 10) {
		diffH = "0" + diffHours;
            } else {
		diffH = "" + diffHours;
            }

            difftime = diffH + ":" + diffM + ":" + diffS;

            } catch (Exception e) {
		e.printStackTrace();
            }

            return difftime;
    }
    
    public static boolean calcTimeSimple(String bTime, String eTime) {
        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
        
        Date d1 = null;
	Date d2 = null;
	String difftime = "";
        String diffS, diffM, diffH;
        
        try {
            d1 = format.parse(bTime);
            d2 = format.parse(eTime);
			
            long diff = d2.getTime() - d1.getTime();
            
            if (diff < 0) {
                return false;
            } else {
                return true;
            }
        } catch (Exception e) {
		e.printStackTrace();
        }
            return false;
    }
    
}
