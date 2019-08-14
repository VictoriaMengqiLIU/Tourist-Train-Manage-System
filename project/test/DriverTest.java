/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import code.Driver;
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
public class DriverTest {
    
    public DriverTest() {
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
             String did = "d00001";
             String tid = "t00001";
             String rid = "r00001";
             boolean s = false;
             new Util().writeObject("/driver/d00001", new Driver(did, tid, rid, s));
         } 
         catch (Exception e)
         {
             fail("Exception thrown during test: " + e.toString());
         }
         
         try
         {
             ArrayList obj = new Util().getObj("/driver/");
             
             for (Object o : obj) {
                System.out.println(o);
             }
         } 
         catch (Exception e)
         {
             fail("Exception thrown during test: " + e.toString());
         }
    }
}
