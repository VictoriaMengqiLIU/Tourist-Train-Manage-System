/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import group34v2.RouteHelper;
import group34v2.Util;
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
public class RouteHelperTest {
    
    public RouteHelperTest() {
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
     @Test
     public void hello() {
         String rid4 = "r00004";
         ArrayList<String> times = new ArrayList<String>();
         times.add("09:30:00");
         times.add("09:42:00");
         times.add("09:55:00");
         ArrayList<String> stops = new ArrayList<String>();
         stops.add("s00003");
         stops.add("s00002");
         stops.add("s00001");
         RouteHelper rh = new RouteHelper(rid4, stops, times);
//         System.out.println(rh.getRouteID());
//         System.out.println(rh.getStops());
//         System.out.println(rh.getStops().size());
//         for (String s : rh.getStops()) {
//             System.out.println(s);
//         }
         rh.updateStops();
         
         String sid_dir = "s00002";
//           
         ArrayList ob_dir = new Util().readDir("/stop/" + sid_dir + "/");
//             System.out.println(ob_dir.size());
         for(Object ob2 : ob_dir){
             System.out.println(ob2);
         }
     }
}
