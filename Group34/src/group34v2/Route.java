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
public class Route
                implements java.io.Serializable


{
    public Route(String rid, ArrayList<String> stops, ArrayList<String> times, boolean s)
    {
        routeID = rid; this.stops = stops; this.times = times; state = s;
    }
    
    public String getRouteID() { return routeID; }
    public ArrayList<String> getStops() { return stops; }
    public ArrayList<String> getTimes() { return times; }  
    public boolean getState() { return state; }
    
    public void setRouteID(String value) { routeID = value; }
    public void setStops(ArrayList<String> value) { stops = value; }
    public void setTimes(ArrayList<String> value) { times = value; }
    public void setState(boolean value) { state = value; }
    
    public String toString()
    {
        return "[Route:" + routeID + 
                " Stops:" + stops.toString() +
                " Time for each stop:" + times.toString() +
                " have Train:" + state +
                "]";
    }
    
    private String routeID = null;
    private ArrayList<String> stops = null;
    private ArrayList<String> times = null;
    private boolean state = false;      // FLASE表示该线路上没有车
    
}
