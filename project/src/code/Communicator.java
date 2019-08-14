/*
 * The MIT License
 *
 * Copyright 2019 Victoria.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package code;

import java.io.File;
import java.nio.file.Paths;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Victoria
 */
public class Communicator {
    public Communicator() {}

    public String getPass(String usrID) {
        Login obj = (Login) new Util().readObject("/login/"+usrID);
        return obj.getPassword();
    }
    
    public void assignTrain2Route(String tid, String rid) {
        Route r = (Route) new Util().readObject("/route/"+rid);
        r.addTrain(tid);
        Train t = new Train(tid, rid, r.getStops(), r.getTimes(), false);
        t.setPrevStop(r.getStops().get(0));
        new Util().writeObject("/route/"+rid, r);
        new Util().writeObject("/train/"+tid, t);
    }
    
    public boolean assignDriver2Train(String did, String tid, String rid) {
        Train t = (Train) new Util().readObject("/train/"+tid);
        if (t.getRouteID().equals(rid)) {
            t.setDriverID(did);
            new Util().writeObject("/train/"+tid, t);
            new Util().writeObject("/driver/"+did, 
                    new Driver(did, tid, rid, false));
            return true;
        } 
        return false;
    }
    
    public void untieDriverTrain(String did) {
        Driver d = (Driver) new Util().readObject("/driver/"+did);
        String tid = d.getTrainID();
        Train t = (Train) new Util().readObject("/train/"+tid);
        t.setDriverID(null);
        new Util().writeObject("/train/" + tid, t);
        new File(root+"/driver/" + did).delete();
    }
    
    public void untieTrainRoute(String tid) {
        Train t = (Train) new Util().readObject("/train/"+tid);
        String rid = t.getRouteID();
        Route r = (Route) new Util().readObject("/route/"+rid);
        r.removeTrain(tid);
        new Util().writeObject("/route/"+rid, r);
        new File(root+"/train/" + tid).delete();
    }
    
    public void startTrain(String tid) {
        Train t = (Train) new Util().readObject("/train/"+tid);
        t.setState(true);
        new Util().writeObject("/train/"+tid, t);
        String did = t.getDriverID();
        Driver d = (Driver) new Util().readObject("/driver/"+did);
        d.setState(true);
        new Util().writeObject("/driver/" + did, d);
        
        ArrayList<String> stops = t.getStops();
        ArrayList<String> times = t.getTimes();
        String pStop = t.getPrevStop();
        int pIdx = stops.indexOf(pStop);
        String pTime = times.get(pIdx);
        if (pIdx+1==stops.size()) {
            stopTrain(tid);
            untieDriverTrain(did);
            untieTrainRoute(tid);
        } else {
            if (LocalTime.parse(pTime).isBefore(LocalTime.now())) {
                ArrayList<String> newTimes = new TimeHelper().translationTime(
                        times.subList(pIdx, times.size()));
                ArrayList<String> newStops = new ArrayList<String>(stops.subList(pIdx, stops.size()));
                t.setStops(newStops);
                t.setTimes(newTimes);
                pIdx = 0;
                new Util().writeObject("/train/"+tid, t);
            }
            while (((Train) new Util().readObject("/train/"+tid)).getState() 
                    && pIdx<t.getStops().size()) {
               startTrainTimer(tid, pIdx);
               pIdx ++;
            }
        }        
    }
    
    public void startTrainTimer(String tid, int idx) {
        Train train = (Train) new Util().readObject("/train/"+tid);
        TimerTask task = new TrainHelper(train, idx);
        Timer timer = new Timer();
        ArrayList<String> times = train.getTimes();
        long pDelay = new TimeHelper().calcDelay(times.get(idx));
        long nDelay = new TimeHelper().calcDelay(times.get(Math.min(idx+1, times.size()-1)));
//        timer.schedule(task, new TimeHelper().toDate(times.get(idx)));
        timer.schedule(task, pDelay);
        try {
            Thread.sleep(Math.max(pDelay, nDelay));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    public void stopTrain(String tid) {
        Train t = (Train) new Util().readObject("/train/"+tid);
        t.setState(false);
        new Util().writeObject("/train/" + tid, t);
        String did = t.getDriverID();
        Driver d = (Driver) new Util().readObject("/driver/"+did);
        d.setState(false);
        new Util().writeObject("/driver/" + did, d);        
    }
    
//    public String getTrainReport(String tid) {
//        //
//    }
    
    private String wd = Paths.get("").toAbsolutePath().toString().substring(0, 
            Paths.get("").toAbsolutePath().toString().indexOf("Tourist-Train-Manage-System"));
    private String root = wd + "Tourist-Train-Manage-System/project/data";
    
//    public class Start extends TimerTask {
//        
//    }
}
