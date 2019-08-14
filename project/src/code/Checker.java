/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

import java.io.File;
import java.nio.file.Paths;

/**
 *
 * @author Victoria
 */
public class Checker {   
    public Checker(String name, String pass) {
        usrID = name; usrPass = pass;
    }
    
    public Checker(String tid) {
        usrID = tid;
    }
    
    public boolean isExists() {   
        if (new File(root+"/login/"+usrID).exists()) {
            Login obj = (Login) new Util().readObject("/login/"+usrID);
            return obj.getPassword().equals(usrPass);
        }
        return false;
    }
    
    public boolean isDriverAssigned2Train() {
        return new File(root+"/driver/" + usrID).exists();
    }

    public boolean isDriverDriving() {
        Driver d = (Driver) new Util().readObject("/driver/"+usrID);
        return d.getState();
    }
    
    public boolean isTrainAssigned2Route() {
        return new File(root+"/train/" + usrID).exists();
    }
        
    public boolean isTrainStarted() {
        Train t = (Train) new Util().readObject("/train/"+usrID);
        return t.getState();
    }
    
    /**
     * Tell if train has been assigned by a driver, 
     * while train hasn't been started.
     * @return 
     */
    public boolean isTrainDrived() {
        Train t = (Train) new Util().readObject("/train/"+usrID);
        return t.getDriverID() != null;
    }
    
    public boolean isRouteInitiated() {
        return new File(root+"/route/" + usrID).exists();
    }    
    
    public boolean isRouteHasTrain() {
        Route t = (Route) new Util().readObject("/route/"+usrID);
        return !t.getTrains().isEmpty();
    }
    
    public String getUID() { return usrID; }
    public String getUPass() { return usrPass; }
    public String getCharacter() { return character; }
    
    public void setUID(String value) { usrID = value; }
    public void setUPass(String value) { usrPass = value; }
    public void setCharacter(String value) { character = value; }
    
    private String usrID = null;
    private String usrPass = null;
    private String character = null;
    private String wd = Paths.get("").toAbsolutePath().toString().substring(0, 
            Paths.get("").toAbsolutePath().toString().indexOf("Tourist-Train-Manage-System"));
    private String root = wd + "Tourist-Train-Manage-System/project/data";
}
