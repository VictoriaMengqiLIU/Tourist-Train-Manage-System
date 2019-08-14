/* * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import code.Stop;
import code.Util;
import java.io.File;
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
public class StopTest {
    
    public StopTest() {
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
        try
         {
             String sid = "s00001";
             String rid = "r00001";
             ArrayList<String> times = new ArrayList<String>();
             times.add("09:00:00");
             times.add("09:13:00");
             times.add("09:25:00");
             ArrayList<String> stops = new ArrayList<String>();
             stops.add("s00001");
             stops.add("s00002");
             stops.add("s00003");
             
             String sid2 = "s00002";
             String rid2 = "r00002";
             ArrayList<String> times2 = new ArrayList<String>();
             times2.add("09:00:00");
             times2.add("09:27:00");
             times2.add("09:47:00");
             ArrayList<String> stops2 = new ArrayList<String>();
             stops2.add("s00002");
             stops2.add("s00003");
             stops2.add("s00004");
             
             String sid3 = "s00002";
             String rid3 = "r00003";
             ArrayList<String> times3 = new ArrayList<String>();
             times3.add("09:20:00");
             times3.add("09:45:00");
             ArrayList<String> stops3 = new ArrayList<String>();
             stops3.add("s00002");
             stops3.add("s00004");
             
             Stop s00001 = new Stop(sid, rid, stops, times);
             Stop s00002 = new Stop(sid2, rid2, stops2, times2);
             Stop s00003 = new Stop(sid3, rid3, stops3, times3);
             
             
             new Util().addObj("/stop/" + sid, rid, s00001);
             new Util().addObj("/stop/" + sid2, rid2, s00002);
             new Util().addObj("/stop/" + sid3, rid3, s00003);
         } 
         catch (Exception e)
         {
             fail("Exception thrown during test: " + e.toString());
         }
         
         try
         {
             String sid = "s00001";
             
             Object ob = new Util().getObj("/stop/" + sid);
             System.out.println(ob);
             
             String sid3 = "s00003";
             
             Object ob3 = new Util().getObj("/stop/" + sid3 + "/");
             System.out.println(ob3);
             
//             new File("./src/group34v2/data/stop/" + sid2).delete();
         } 
         catch (Exception e)
         {
             fail("Exception thrown during test: " + e.toString());
         }
    }
}
