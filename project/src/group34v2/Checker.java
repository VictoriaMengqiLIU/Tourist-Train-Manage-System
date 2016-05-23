/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group34v2;

import java.io.File;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Victoria
 */
public class Checker 
{   
    public Checker(String name, String pass)
    {
        usrID = name; usrPass = pass;
    }
    
    public Checker(String name, String pass, int s)
    {
        usrID = name; usrPass = pass; state = s;
    }
    
    public Checker(String tid)
    {
        usrID = tid;
    }
    
//    public Checker(String name, String pass, int s, String ch)
//    {
//        usrID = name; usrPass = pass; state = s; character = ch;
//    }
    
    public boolean isExists()
    {   
        boolean b = false;
        for (Object obj : new Util().getObj("/login/")) 
        {
            Login lg = (Login) obj;
            if ( Objects.equals(lg.getUsername(), usrID)
                    && Objects.equals(lg.getPassword(), usrPass))
                return true;
        }
        return false;
    }
    
    public boolean isDriverAssigned()
    {
        Driver d;
        if (new File("./src/group34v2/data/driver/" + usrID).exists())
            return true;
        else
            return false;
    }
    
    public boolean isTrainAssigned()
    {
        Train t;
        if (new File("./src/group34v2/data/train/" + usrID).exists())
            return true;
        else
            return false;
    }
    
    public boolean isRouteEmpty()
    {
        Route r;
        if (new File("./src/group34v2/data/route/" + usrID).exists())
            return false;
        else
            return true;
    }
    
    public boolean isTrainOnDuty()
    {
        Train t;
        for (Object obj : new Util().getObj("/train/"))
        {
            t = (Train) obj;
            if (t.getTrainID() == usrID)
            {
                return t.getState();
            }
        }
        return false;
    }
    
    public boolean isTrainRunning()
    {
        Driver d;
        for (Object obj : new Util().getObj("/driver/"))
        {
            d = (Driver) obj;
            if (d.getTrainID() == usrID)
            {
                return d.getState();
            }
        }
        return false;
    }
    
    public String getUID() { return usrID; }
    public String getUPass() { return usrPass; }
    public int getState() { return state; }
    public String getCharacter() { return character; }
    
    public void setUID(String value) { usrID = value; }
    public void setUPass(String value) { usrPass = value; }
    public void setState(int value) { state = value; }
    public void setCharacter(String value) { character = value; }
    
    private String usrID = null;
    private String usrPass = null;
    private int state;
    private String character = null;
}
