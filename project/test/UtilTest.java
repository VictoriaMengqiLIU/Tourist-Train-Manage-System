/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import group34v2.Route;
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
public class UtilTest {
    
    public UtilTest() {
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
//        ArrayList<String> test = new Util().getObj("/stop/" + "s00001/");
//        for(String t : test){
//            System.out.println(t);
//        }

//        System.out.println(new Util().getObj("/stop/" + "s00002/"));
        System.out.println("getObj len" + new Util().getObj("/stop/s00001").size());
        for (Object obj : new Util().getObj("/stop/s00001"))
        {
            System.out.println(obj + "\n");
        }
    }
}
