/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import group34v2.Checker;
import group34v2.Login;
import group34v2.Util;
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
//        Checker ck = new Checker("r00001","r00001",0);
////        ck.setUID("r00001");
////        ck.setUPass("r00001");
////        ck.setState(0);
//        System.out.println(ck.isExists());
//        
//        String name = "train";
//        String id = "t00001";
//        Checker c = new Checker(id, id, 2);
//        if(name=="train" && c.isExists()) {
//            System.out.println("true");
//        }
////        
//        Checker ck2 = new Checker("d00004", "d00004", 2);
//        System.out.println(new File("./src/group34v2/data/driver/" + "d00002").exists());
//        System.out.println(ck2.isDriverAssigned());

         Checker ck3 = new Checker("t00001");
         System.out.println(ck3.isTrainAssigned());
         System.out.println(ck3.isTrainOnDuty());
         System.out.println(ck3.isTrainRunning());
    }
}
