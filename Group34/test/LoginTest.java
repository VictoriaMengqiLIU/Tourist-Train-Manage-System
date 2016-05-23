/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import group34v2.Login;
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
public class LoginTest {
    
    public LoginTest() {
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
            String u1 = "root";
            String p1 = "root";
            int state = 0;
            
            String u2 = "s00001";
            String u3 = "s00002";
            String u4 = "s00003";
            String u5 = "s00004";
            
            String u6 = "t00001";
            String u7 = "t00002";
            String u8 = "t00003";
            
            String u9 = "r00001";
            String u10 = "r00002";
            String u11 = "r00003";
            String u12 = "j00001";
            String u13 = "j00002";
            String u14 = "j00003";
            
            
//            Login root = new Login(u1, p1, state);
            new Util().writeObject("/login/" + u11, new Login(u11,u11,3));
            System.out.println(new Util().readObject("/login/" + "r00001"));
        }
        catch (Exception e)
        {
            fail("Exception thrown during test: " + e.toString());
        }
    }
}
