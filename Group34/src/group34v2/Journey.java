/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group34v2;

/**
 *
 * @author Victoria
 */
public class Journey 
        implements java.io.Serializable
        
{
    public Journey(String jid, String rid_o, String rid_r)
    {
        journeyID = jid; outRouteID = rid_o; reRouteID = rid_r;
    }
    
    public String getJourneyID() {return journeyID; }
    public String getOutRouteID() { return outRouteID; }
    public String getReReouteID() { return reRouteID; }
    
    public void setJourneyID(String value) { journeyID = value; }
    public void setOutRouteID(String value) { outRouteID = value; }
    public void setReRouteID(String value) { reRouteID = value; }
    
    public String toString()
    {
        return "[JourneyID:" + journeyID +
                " Outward RouteID:" + outRouteID +
                " Return RouteID:" + reRouteID + 
                "]";
    }
    
    private String journeyID = null;
    private String outRouteID = null;
    private String reRouteID = null;
}
