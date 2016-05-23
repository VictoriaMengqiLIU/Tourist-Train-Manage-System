/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import group34v2.Journey;
import group34v2.Util;
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
public class JourneyTest {
    
    public JourneyTest() {
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
    public void test(){
        try
         {
             String jid = "j00001";
             String rid_out = "r00001";
             String rid_in = "r00004";
             String jid2 = "j00002";
             String rid_out2 = "r00002";
             String rid_in2 = "r00005";
             String jid3 = "j00003";
             String rid_out3 = "r00003";
             String rid_in3 = "r00006";
             
             Journey j00001 = new Journey(jid, rid_out, rid_in);
             Journey j00002 = new Journey(jid2, rid_out2, rid_in2);
             Journey j00003 = new Journey(jid3, rid_out3, rid_in3);

             
             new Util().writeObject("/journey/" + jid, j00001);
             new Util().writeObject("/journey/" + jid2, j00002);
             new Util().writeObject("/journey/" + jid3, j00003);
         } 
         catch (Exception e)
         {
             fail("Exception thrown during test: " + e.toString());
         }
         
         try
         {
             String jid = "j00001";
             Object ob = new Util().readObject("/journey/" + jid);
             System.out.println(ob);
             
             String jid2 = "j00002";
             Object ob2 = new Util().readObject("/journey/" + jid2);
             System.out.println(ob2);
             
             String jid3 = "j00003";
             Object ob3 = new Util().readObject("/journey/" + jid3);
             System.out.println(ob3);
         } 
         catch (Exception e)
         {
             fail("Exception thrown during test: " + e.toString());
         }
    }
}
