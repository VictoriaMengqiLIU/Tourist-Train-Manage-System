/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

/**
 *
 * @author Victoria
 */
public class Driver
        implements java.io.Serializable

{
    public Driver(String did, String tid, String rid, boolean s)
    {
        driverID = did; trainID = tid; routeID = rid; state = s;
    }
    
    public String getDriverID() { return driverID; }
    public String getTrainID() { return trainID; }
    public String getRouteID() { return routeID; }
    public boolean getState() {return state; }
    
    public void setDriverID(String value) { driverID = value; }
    public void setTrainID(String value) { trainID = value; }
    public void setRouteID(String value) { routeID = value; }
    public void setState(boolean value) { state = value; }
    
    public String toString()
    {
        return "[Driver: " + driverID + "\n\t" +
                " assigned to Train: " + trainID + "\n\t" +
                " on Route: " + routeID + "\n\t" +
                " Running? " + state +
                "]";
    }
    
    private String driverID = null;
    private String trainID = null;
    private String routeID = null;
    private boolean state = false;          // FALSE表示不能执行STOP命令,即车已经停了或者车不在路上
}
