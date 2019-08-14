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
             String rid = "r00001";
             ArrayList<String> times = new ArrayList<String>();
             times.add("09:00:00");
             times.add("09:13:00");
             times.add("09:25:00");
             ArrayList<String> stops = new ArrayList<String>();
             stops.add("s00001");
             stops.add("s00002");
             stops.add("s00003");
             
             Route r00001 = new Route(rid, stops, times);
             new Util().writeObject("/route/" + rid, r00001);
         } 
         catch (Exception e)
         {
             fail("Exception thrown during test: " + e.toString());
         }
         
         try
         {
             System.out.println(new Util().readObject("/route/r00001"));
         } 
         catch (Exception e)
         {
             fail("Exception thrown during test: " + e.toString());
         }
    }
}
