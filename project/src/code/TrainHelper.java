package code;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Victoria
 */
public class TrainHelper extends TimerTask {
    public TrainHelper(Train t, int pIdx) {
        train = t;
        prevIdx = pIdx;
    }
    
    @Override
    public void run() {
        String pStop = train.getStops().get(prevIdx);
        train.setPrevStop(pStop);
        new Util().writeObject("/train/"+train.getTrainID(), train);
    }
    
//    public static void main(String args[]) {
//        TimerTask myTask = new TrainHelper();
//        Timer timer = new Timer();
//        timer.schedule(myTask, toDate(LocalTime.now().plusSeconds(10)));
//        System.out.println("current time: "+LocalTime.now());
//    }
    
    private Train train = null;
    private int prevIdx = 0;
}
