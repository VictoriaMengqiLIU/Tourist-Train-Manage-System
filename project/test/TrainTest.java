/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import code.Train;
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
public class TrainTest {
    
    public TrainTest() {
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
    public void test() {
        try
         {
             String tid = "t00001";
             String rid = "r00001";
             ArrayList<String> times = new ArrayList<String>();
             times.add("09:00:00");
             times.add("09:13:00");
             times.add("09:25:00");
             ArrayList<String> stops = new ArrayList<String>();
             stops.add("s00001");
             stops.add("s00002");
             stops.add("s00003");
             
             String tid2 = "t00002";
             String rid2 = "r00002";
             ArrayList<String> times2 = new ArrayList<String>();
             times2.add("09:00:00");
             times2.add("09:27:00");
             times2.add("09:47:00");
             ArrayList<String> stops2 = new ArrayList<String>();
             stops2.add("s00002");
             stops2.add("s00003");
             stops2.add("s00004");
             
             String tid3 = "t00003";
             String rid3 = "r00003";
             ArrayList<String> times3 = new ArrayList<String>();
             times3.add("09:20:00");
             times3.add("09:45:00");
             ArrayList<String> stops3 = new ArrayList<String>();
             stops3.add("s00002");
             stops3.add("s00004");
             
             Train t00001 = new Train(tid, rid, stops, times, true);
             Train t00002 = new Train(tid2, rid2, stops2, times2, false);
             Train t00003 = new Train("t00004", rid3, stops3, times3, false);
             
//             route1 = new Util().readObject("/route/r00001")
             new Util().writeObject("/train/t00001", new Train("t00001", "r00001", stops, times, true));
             new Util().writeObject("/train/" + tid2, t00002);
             new Util().writeObject("/train/" + tid3, t00003);
         } 
         catch (Exception e)
         {
             fail("Exception thrown during test: " + e.toString());
         }
         
         try
         {
             String tid = "t00001";
             Object ob = new Util().readObject("/train/" + tid);
             System.out.println(ob);
             
             String tid2 = "t00002";
             Object ob2 = new Util().readObject("/train/" + tid2);
             System.out.println(ob2);
             
             String tid3 = "t00003";
             Object ob3 = new Util().readObject("/train/" + tid3);
             System.out.println(ob3);
         } 
         catch (Exception e)
         {
             fail("Exception thrown during test: " + e.toString());
         }
    }
}
