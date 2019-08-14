/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import code.Route;
import code.TimeHelper;
import code.TrainHelper;
import code.Util;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import static java.time.temporal.ChronoUnit.MINUTES;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Victoria
 */
public class TimeHelperTest {
    
    public TimeHelperTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void test() {
         LocalTime now = LocalTime.now();
//         Duration d = Duration.between(LocalTime.parse("08:20:00"), now);
//         System.out.println(new TimeHelper().calcTimeDiff("08:20:00","08:34:00"));
//         System.out.println(now);
//         System.out.println(LocalTime.parse("08:20:00").plusMinutes(d.toMinutes()));
//         Route obj = (Route) new Util().readObject("/route/r00001");
//         System.out.println(obj.getTimes());
//         System.out.println(new TimeHelper().translationTime(obj.getTimes()));
         System.out.println(Duration.between(now, now).toMillis());
         System.out.println(now.isBefore(now.plusSeconds(10)));
         System.out.println(Duration.between(now, now.plusSeconds(10)).toMillis());
         System.out.println(new TimeHelper().calcDelay("19:59:00"));
     }
}

