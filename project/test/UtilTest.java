/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import code.Route;
import code.Util;
import java.util.ArrayList;
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
public class UtilTest {
    
    public UtilTest() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void test() {
        Route route = (Route) new Util().readObject("/route/r00001");
        ArrayList<String> stops = route.getStops();
        System.out.println("getObj len: " + stops.size());
        for (String s : stops) {
            System.out.println(stops.indexOf(s));
        }
        System.out.println(stops.indexOf("s00003")+1==stops.size());
        System.out.println(stops.subList(1, stops.size()));
        ArrayList<String> newStops = new ArrayList<String>(stops.subList(1, stops.size()));
        System.out.println(newStops);
        
//        System.out.println("getObj len" + new Util().getObj("/stop/s00001").size());
//        for (Object obj : new Util().getObj("/stop/s00001"))
//        {
//            System.out.println(obj + "\n");
//        }
    }
}
