/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import code.Checker;
import code.Login;
import code.Util;
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
//            new Util().writeObject("/login/root", new Login("root","root",0));
//            new Util().writeObject("/login/m00001", new Login("m00001","m00001",1));
            System.out.println(new Checker("t00002","t00002").isExists());
            System.out.println(new Checker("d00001","d00001").isExists());
//            System.out.println(new Util().readObject("/login/m00001"));
        }
        catch (Exception e)
        {
            fail("Exception thrown during test: " + e.toString());
        }
    }
}
