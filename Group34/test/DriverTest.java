/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import group34v2.Driver;
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
//        try
//         {
             String did = "d00001";
             String tid = "t00001";
             String rid = "r00001";
             boolean s = true;
//             
//             String did2 = "d00002";
//             String tid2 = "t00002";
//             String rid2 = "r00002";
//             boolean s2 = false;
//             
//             String did3 = "d00003";
//             String tid3 = "t00003";
//             String rid3 = "r00003";
//             boolean s3 = false;
//             
             Driver d00001 = new Driver(did, tid, rid, s);
//             Driver d00002 = new Driver(did2, tid2, rid2, s2);
//             Driver d00003 = new Driver(did3, tid3, rid3, s3);
//             
             new Util().writeObject("/driver/" + did, d00001);
//             new Util().writeObject("/driver/" + did2, d00002);
//             new Util().writeObject("/driver/" + did3, d00003);
//         } 
//         catch (Exception e)
//         {
//             fail("Exception thrown during test: " + e.toString());
//         }
         
         try
         {
//             String did = "d00001";
//             Object ob = new Util().readObject("/driver/" + did);
//             System.out.println(ob);
//             
//             String did2 = "d00002";
//             Object ob2 = new Util().readObject("/driver/" + did2);
//             System.out.println(ob2);
//             
//             String did3 = "d00003";
//             Object ob3 = new Util().readObject("/driver/" + did3);
//             System.out.println(ob3);
//             
             ArrayList obj = new Util().readDir("/driver/");
             
//             int i = 0;
             for (Object o : obj) {
//                 if (i != 0)
//                 {
//                     System.out.println(o);
//                 }
//                 i++;
                System.out.println(o);
             }
         } 
         catch (Exception e)
         {
             fail("Exception thrown during test: " + e.toString());
         }
    }
}
