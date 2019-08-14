/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import code.Checker;
import code.Login;
import code.Stop;
import code.TimeHelper;
import code.Train;
import code.Util;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Victoria
 */
public class ProjectTest {
    
    public ProjectTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void hello() {
//        String un = "route";
//        String pa = "r00001";
//        
//        String name=un;
//        String id = pa;
//        
//        if (name=="train" && new Checker("r00001", "r00001", 3).isExists()){
//            System.out.println("true");
//        } else {
//            System.out.println("false");
//        }
        String id ="t00001";
        for (Object obj : new Util().getObj("/train/"))
            {
                Train t = (Train) obj;
                if (t.getTrainID() == id)
                    System.out.println(t.getState());
                System.out.println(new Date().toString());
            }
       
        String stopID = "s00001"; String routeID = "r00001";
        
        Stop s;
        String nStop, tDiff = "";
        ArrayList<String> cliInfo = new ArrayList<String>();
        Object obj = new Util().readObject("/stop/"+stopID+"/"+routeID);
        {
            s = (Stop) obj;
            int idx = s.getStops().indexOf(stopID);
            Date d = new Date();
            String now = d.toString();
            if ( (idx+1) < s.getStops().size()) {
                nStop = s.getStops().get(idx+1);
                tDiff = new TimeHelper().calcTimeDiff(s.getTimes().get(idx),
                        s.getTimes().get(idx+1));
            } else {
                nStop = "N/A";
                tDiff = new TimeHelper().calcTimeDiff(s.getTimes().get(idx-1),
                        s.getTimes().get(idx));
            }
        }
        cliInfo.add(stopID);
        cliInfo.add(routeID);
        cliInfo.add(nStop);
        cliInfo.add(tDiff);
        System.out.println(cliInfo.size());
        new Util().writeObject("/tmp/" + stopID, cliInfo);
        
        for(Object ob:new Util().getObj("/tmp/")) {
            ArrayList<String> ss = (ArrayList) ob;
            System.out.println(ss.get(3));
        }

       
    }
}
