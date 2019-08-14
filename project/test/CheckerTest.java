/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import code.Checker;
import code.Login;
import code.Util;
import java.io.File;
import java.util.ArrayList;
import java.util.Objects;
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
public class CheckerTest {
    
    public CheckerTest() {
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
        System.out.println(new Checker("d00001","d00001").isExists());
        System.out.println(new Checker("d00002", "d00002").isDriverAssigned2Train());

         Checker ck3 = new Checker("t00001");
         System.out.println(ck3.isTrainAssigned2Route());
         System.out.println(ck3.isTrainStarted());
         System.out.println(ck3.isDriverDriving());
    }
}
