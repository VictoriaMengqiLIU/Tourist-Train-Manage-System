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
public class Route
                implements java.io.Serializable


{
    public Route(String rid, ArrayList<String> stops, ArrayList<String> times)
    {
        routeID = rid; this.stops = stops; this.times = times;
    }
    
    public void addTrain(String tid) {
        trains.add(tid);
    }
    
    public void removeTrain(String tid) {
        trains.remove(tid);
    }
    
    public String getRouteID() { return routeID; }
    public ArrayList<String> getStops() { return stops; }
    public ArrayList<String> getTimes() { return times; }  
    public ArrayList<String> getTrains() { return trains; }  
    
    public void setRouteID(String value) { routeID = value; }
    public void setStops(ArrayList<String> value) { stops = value; }
    public void setTimes(ArrayList<String> value) { times = value; }
    public void setTrains(ArrayList<String> value) { trains = value; }
    
    public String toString()
    {
        return "[Route: " + routeID + "\n\t" +
                " Stops: " + stops.toString() + "\n\t" +
                " TimeTable: " + times.toString() + "\n\t" +
                " Assigned Trains: " + trains.toString() +
                "]";
    }
    
    private String routeID = null;
    private ArrayList<String> stops = new ArrayList<String>();
    private ArrayList<String> times = new ArrayList<String>();
    private ArrayList<String> trains = new ArrayList<String>();
}
