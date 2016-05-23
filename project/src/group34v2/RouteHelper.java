/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group34v2;

import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author Victoria
 */
public class RouteHelper 
{
    public RouteHelper(String rid, ArrayList<String> ss, ArrayList<String> ts)
    {
        routeID = rid; stops = ss; times = ts;
    }
    
    public RouteHelper(String rid, ArrayList<String> ss)
    {
        routeID = rid; stops = ss;
    }
    
    public void updateStops() 
    {
        try
        {
            for (String s: stops)
                new Util().addObj("/stop/" + s, routeID,
                                  new Stop(s, routeID, stops, times));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    
    public void deleteStops()
    {
        try
        {
            for (String s : stops)
            {
                new File("./data/stop/" + s + "/" + routeID).delete();
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
        
    public String getRouteID() { return routeID; }
    public ArrayList<String> getStops() { return stops; }
    public ArrayList<String> getTimes() { return times; }  
    
    public void setRouteID(String value) { routeID = value; }
    public void setStops(ArrayList<String> value) { stops = value; }
    public void setTimes(ArrayList<String> value) { times = value; }
    
    private String routeID = null;
    private ArrayList<String> stops = new ArrayList<String>();
    private ArrayList<String> times = new ArrayList<String>();
}
