/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

import java.io.File;
import java.nio.file.Paths;
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
            for (String s: stops) {
                if (!s.equals("")) {                    
                    if (!new File(root+"/login/"+s).exists()) {
                        new Util().writeObject("/login/" + s, new Login(s,s,3));
                    }
                    new Util().addObj("/stop/" + s, routeID, new Stop(s, routeID, stops, times));
                }
            }
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
            for (String s : stops) {
                new File(root+"/stop/" + s + "/" + routeID).delete();
//                File[] fs = new File(root+"/stop/" + s).listFiles((File file) -> !file.isHidden());
                if (new File(root+"/stop/" + s).list().length==0) {
                    new File(root+"/stop/" + s).delete();
                    new File(root+"/login/" + s).delete();
                };
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
    private String wd = Paths.get("").toAbsolutePath().toString().substring(0, 
            Paths.get("").toAbsolutePath().toString().indexOf("Tourist-Train-Manage-System"));
    private String root = wd + "Tourist-Train-Manage-System/project/data";
}
