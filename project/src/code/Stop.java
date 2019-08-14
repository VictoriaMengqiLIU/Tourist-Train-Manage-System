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
public class Stop
        implements java.io.Serializable

{
    public Stop(String sid, String rid, ArrayList<String> stops, ArrayList<String> times) 
    {
        stopID = sid; routeID = rid; this.stops = stops; this.times = times;
    }
    
    public String getStopID() { return stopID; }
    public String getRouteID() { return routeID; }
    public ArrayList<String> getStops() { return stops; }
    public ArrayList<String> getTimes() { return times; }
    
    public void setStopID(String value) { stopID = value; }
    public void setRouteID(String value) { routeID = value; }
    public void setStops(ArrayList<String> value) { stops = value; }
    public void setTimes(ArrayList<String> value) { times = value; }
    
    public String toString()
    {
        return "[Stop: " + stopID + "\n\t" +
                " Pass-By Route: " + routeID + "\n\t" +
                " Route's stops: " + stops.toString() + "\n\t" +
                " Timetable each stop: " + times.toString() +
                "]";
    }
    
    private String stopID = null;
    private String routeID = null;
    private ArrayList<String> stops = new ArrayList<String>();
    private ArrayList<String> times = new ArrayList<String>();
}

