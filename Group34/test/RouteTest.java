/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import group34v2.Route;
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
public class RouteTest {
    
    public RouteTest() {
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
        try
         {
//             String rid = "r00001";
//             ArrayList<String> times = new ArrayList<String>();
//             times.add("09:00:00");
//             times.add("09:13:00");
//             times.add("09:25:00");
//             ArrayList<String> stops = new ArrayList<String>();
//             stops.add("s00001");
//             stops.add("s00002");
//             stops.add("s00003");
//             
//             String rid2 = "r00002";
//             ArrayList<String> times2 = new ArrayList<String>();
//             times2.add("09:00:00");
//             times2.add("09:27:00");
//             times2.add("09:47:00");
//             ArrayList<String> stops2 = new ArrayList<String>();
//             stops2.add("s00002");
//             stops2.add("s00003");
//             stops2.add("s00004");
//             
//             String rid3 = "r00003";
//             ArrayList<String> times3 = new ArrayList<String>();
//             times3.add("09:20:00");
//             times3.add("09:45:00");
//             ArrayList<String> stops3 = new ArrayList<String>();
//             stops3.add("s00002");
//             stops3.add("s00004");
             
             String rid4 = "r00004";
             ArrayList<String> times = new ArrayList<String>();
             times.add("09:30:00");
             times.add("09:42:00");
             times.add("09:55:00");
             ArrayList<String> stops = new ArrayList<String>();
             stops.add("s00003");
             stops.add("s00002");
             stops.add("s00001");
             
             String rid5 = "r00005";
             ArrayList<String> times2 = new ArrayList<String>();
             times2.add("10:00:00");
             times2.add("10:20:00");
             times2.add("10:47:00");
             ArrayList<String> stops2 = new ArrayList<String>();
             stops2.add("s00004");
             stops2.add("s00003");
             stops2.add("s00002");
             
             String rid6 = "r00006";
             ArrayList<String> times3 = new ArrayList<String>();
             times3.add("10:00:00");
             times3.add("10:25:00");
             ArrayList<String> stops3 = new ArrayList<String>();
             stops3.add("s00004");
             stops3.add("s00002");
             
//             Route r00001 = new Route(rid, stops, times, true);
//             Route r00002 = new Route(rid2, stops2, times2, false);
//             Route r00003 = new Route(rid3, stops3, times3, false);

             Route r00004 = new Route(rid4, stops, times, true);
             Route r00005 = new Route(rid5, stops2, times2, false);
             Route r00006 = new Route(rid6, stops3, times3, false);
             
             new Util().writeObject("/route/" + rid4, r00004);
             new Util().writeObject("/route/" + rid5, r00005);
             new Util().writeObject("/route/" + rid6, r00006);
         } 
         catch (Exception e)
         {
             fail("Exception thrown during test: " + e.toString());
         }
         
         try
         {
             String rid = "r00004";
             Object ob = new Util().readObject("/route/" + rid);
             System.out.println(ob);
             
             String rid2 = "r00005";
             Object ob2 = new Util().readObject("/route/" + rid2);
             System.out.println(ob2);
             
             String rid3 = "r00006";
             Object ob3 = new Util().readObject("/route/" + rid3);
             System.out.println(ob3);
         } 
         catch (Exception e)
         {
             fail("Exception thrown during test: " + e.toString());
         }
    }
}
