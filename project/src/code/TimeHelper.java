/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import static java.time.temporal.ChronoUnit.MINUTES;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Victoria
 */
public class TimeHelper {
    
    public TimeHelper() {}
    
    public String calcTimeDiff(String bTime, String eTime) {
        return Duration.between(LocalTime.parse(bTime), 
                LocalTime.parse(eTime)).toMinutes() + " minutes";
    }
    
    public String calcTimeDiff(LocalTime bTime, LocalTime eTime) {
        return Duration.between(bTime, eTime).toMinutes() + " minutes";
    }
    
    public long calcDelay(String time) {
        LocalTime now = LocalTime.now();
        LocalTime target = LocalTime.parse(time);
        if (now.isBefore(LocalTime.parse(time))) {
            return Duration.between(now, target).toMillis();
        } else {
            return Duration.between(now, now).toMillis();
        }
    }
    
    public Date toDate(LocalTime localTime) {
        Instant instant = localTime.atDate(LocalDate.now())
                .atZone(ZoneId.systemDefault()).toInstant();
        return Date.from(instant);
    }

    public Date toDate(String time) {
        Instant instant = LocalTime.parse(time).atDate(LocalDate.now())
                .atZone(ZoneId.systemDefault()).toInstant();
        return Date.from(instant);
    }
    
    public ArrayList<String> translationTime(List<String> times) {
        ArrayList<String> newTimes = new ArrayList<String>();
        LocalTime now = LocalTime.now();
        Duration d = Duration.between(LocalTime.parse(times.get(0)), now);
        for (String t : times) {
            newTimes.add(LocalTime.parse(t).plusMinutes(d.toMinutes()).toString());
        }
        return newTimes;
    }
}
