/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.murderInTheCity.control;

import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Wesley Vaz_2
 */
public class PoliceOfficeSceneControlTest {
    
    public PoliceOfficeSceneControlTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
     @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of calcTimeSinceDeath method, of class LabSceneControl.
     */
    @Test
    public void solveCrime() {
        System.out.println("solveCrime");
        
        /************** 
         * TEST CASE #1
         **************/
        
        System.out.println("\tTest Case #1");
        
        // input values
        boolean caseName = true;
        double playerProgress = 100;
        
        // output value expected
        double expResult = 0;
        
        // instance of LabSceneControl class
        PoliceOfficeSceneControl instance = new PoliceOfficeSceneControl();
        
        // call function to run test
        String result = instance.solveCrime(caseName, playerProgress);
        
        // compare expected return value with actual calue returned
        assertEquals(expResult, result);
        
        /************** 
         * TEST CASE #2
         **************/
        
        System.out.println("\tTest Case #2");
        
        // input values
       getCaseName = false;
       playerProgress = 100;
        
        // output value expected
       expResult = "Case Name Does Not Exist";
        
        // instance of LabSceneControl class
       instance = new PoliceOfficeSceneControl();
        
        // call function to run test
       result = instance.solveCrime(getCaseName, playerProgress);
        
        // compare expected return value with actual calue returned
        assertEquals(expResult, result);
        
        /************** 
         * TEST CASE #3
         **************/
        
        System.out.println("\tTest Case #3");
        
        // input values
       getCaseName = true;
       playerProgress = 88;
        
        // output value expected
       expResult = "Player Progress Not 100";
        
        // instance of LabSceneControl class
       instance = new PoliceOfficeSceneControl();
        
        // call function to run test
       result = instance.solveCrime(getCaseName, playerProgress);
        
        // compare expected return value with actual calue returned
        assertEquals(expResult, result);
        
        /************** 
         * TEST CASE #4
         **************/
        
        System.out.println("\tTest Case #4");
        
        // input values
       getCaseName = true;
       playerProgress = 100;
        
        // output value expected
       expResult = "Crime Solved";
        
        // instance of LabSceneControl class
       instance = new PoliceOfficeSceneControl();
        
        // call function to run test
       result = instance.solveCrime(getCaseName, playerProgress);
        
        // compare expected return value with actual calue returned
        assertEquals(expResult, result);
   
    }
   
}
   
