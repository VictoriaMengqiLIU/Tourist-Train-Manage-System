/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group34v2;

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
    public ArrayList<String> getStops() { return stops; }
    public ArrayList<String> getTimes() { return times; }
    public boolean getState() { return state; }
    
    public void setTrainID(String value) { trainID = value; }
    public void setRouteID(String value) { routeID = value; }
    public void setStops(ArrayList<String> value) { stops = value; }
    public void setTimes(ArrayList<String> value) { times = value; }
    public void setState(boolean value) { state = value; }
    
    public String toString()
    {
        return "[Train: trainID=" + trainID + 
                " assigned to Route: routeID=" + routeID +
                " pass-by stops: " + stops.toString() + 
                " arrival time for each stop: " + times.toString() +
                " on-going? " + state +
                "]";
    }
    
    private String trainID = null;
    private String routeID = null;
    private ArrayList<String> stops = null;
    private ArrayList<String> times = null;
    private boolean state = true;       // 说明车不在路上, 即 N/A
}
