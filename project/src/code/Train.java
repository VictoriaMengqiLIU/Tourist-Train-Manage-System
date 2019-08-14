/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

import java.util.ArrayList;

/**
 *
 * @author Victoria
 */
public class Train
        implements java.io.Serializable

{
    public Train(String tid, String rid, ArrayList<String> stops, ArrayList<String> times, boolean state) 
    {
        this.trainID = tid; this.routeID = rid; this.stops = stops; this.times = times; this.state = state;
    }
    
    public String getTrainID() { return trainID; }
    public String getRouteID() { return routeID; }
    public String getDriverID() { return driverID; }
    public String getPrevStop() { return prevStop; }
    public ArrayList<String> getStops() { return stops; }
    public ArrayList<String> getTimes() { return times; }
    public boolean getState() { return state; }
    
    public void setTrainID(String value) { trainID = value; }
    public void setRouteID(String value) { routeID = value; }
    public void setDriverID(String value) { driverID = value; }
    public void setPrevStop(String value) { prevStop = value; }    
    public void setStops(ArrayList<String> value) { stops = value; }
    public void setTimes(ArrayList<String> value) { times = value; }
    public void setState(boolean value) { state = value; }
    
    public String toString()
    {
        return "[Train: " + trainID + "\n\t" + 
                " assigned to Route: " + routeID + "\n\t" +
                " pass-by Stops: " + stops.toString() + "\n\t" +
                " TimeTable (for each stops): " + times.toString() + "\n\t" +
                " On-Going? " + state + "\n\t" +
                " Previous Stop: " + prevStop + "\n\t" +
                " Driver: " + driverID + "]";
    }
    
    private String trainID = null;
    private String routeID = null;
    private String driverID = null;
    private String prevStop = null;
    private ArrayList<String> stops = new ArrayList<String>();
    private ArrayList<String> times = new ArrayList<String>();
    private boolean state = false;       // 说明车不在路上, 即 N/A
}
