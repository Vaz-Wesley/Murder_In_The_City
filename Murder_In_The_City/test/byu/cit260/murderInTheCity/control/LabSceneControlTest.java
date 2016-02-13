/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.murderInTheCity.control;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Wesley Vaz_2
 */
public class LabSceneControlTest {
    
    public LabSceneControlTest() {
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
    public void testCalcTimeSinceDeath() {
        System.out.println("calcTimeSinceDeath");
        
        /************** 
         * TEST CASE #1
         **************/
        
        System.out.println("\tTest Case #1");
        
        // input values
        double avgBodyTemp = 98.6;
        double currentBodyTemp = 88;
        double heatLostPerHour = 1.5;
        
        // output value expected
        double expResult = 7.0666;
        
        // instance of LabSceneControl class
        LabSceneControl instance = new LabSceneControl();
        
        // call function to run test
        double result = instance.calcTimeSinceDeath(avgBodyTemp, currentBodyTemp, heatLostPerHour);
        
        // compare expected return value with actual calue returned
        assertEquals(expResult, result, 0.0001);
     
        
        /************** 
         * TEST CASE #2
         **************/
        
        System.out.println("\tTest Case #2");
        
        // input values
        avgBodyTemp = 98.6;
        currentBodyTemp = 10;
        heatLostPerHour = 1.5;
        
        // output value expected
        expResult = -1.0;
        
        // call function to run test
        result = instance.calcTimeSinceDeath(avgBodyTemp, currentBodyTemp, heatLostPerHour);
        
        // compare expected return value with actual calue returned
        assertEquals(expResult, result, 0.0001);
        
        /************** 
         * TEST CASE #3
         **************/
        
        System.out.println("\tTest Case #3");
        
        // input values
        avgBodyTemp = 95.8;
        currentBodyTemp = 32;
        heatLostPerHour = 1.5;
        
        // output value expected
        expResult = -1.0;
        
        // call function to run test
        result = instance.calcTimeSinceDeath(avgBodyTemp, currentBodyTemp, heatLostPerHour);
        
        // compare expected return value with actual calue returned
        assertEquals(expResult, result, 0.0001);
        
        /************** 
         * TEST CASE #4
         **************/
        
        System.out.println("\tTest Case #4");
        
        // input values
        avgBodyTemp = 98.6;
        currentBodyTemp = 88;
        heatLostPerHour = -1.0;
        
        // output value expected
        expResult = -1.0;
        
        // call function to run test
        result = instance.calcTimeSinceDeath(avgBodyTemp, currentBodyTemp, heatLostPerHour);
        
        // compare expected return value with actual calue returned
        assertEquals(expResult, result, 0.0001);
        
        /************** 
         * TEST CASE #5
         **************/
        
        System.out.println("\tTest Case #5");
        
        // input values
        avgBodyTemp = 98.6;
        currentBodyTemp = 32;
        heatLostPerHour = 1.5;
        
        // output value expected
        expResult = 44.4;
        
        // call function to run test
        result = instance.calcTimeSinceDeath(avgBodyTemp, currentBodyTemp, heatLostPerHour);
        
        // compare expected return value with actual calue returned
        assertEquals(expResult, result, 0.0001);
        
        /************** 
         * TEST CASE #6
         **************/
        
        System.out.println("\tTest Case #6");
        
        // input values
        avgBodyTemp = 98.6;
        currentBodyTemp = 98.6;
        heatLostPerHour = 1.5;
        
        // output value expected
        expResult = 0.0;
        
        // call function to run test
        result = instance.calcTimeSinceDeath(avgBodyTemp, currentBodyTemp, heatLostPerHour);
        
        // compare expected return value with actual calue returned
        assertEquals(expResult, result, 0.0001);
        
        /************** 
         * TEST CASE #7
         **************/
        
        System.out.println("\tTest Case #7");
        
        // input values
        avgBodyTemp = 98.6;
        currentBodyTemp = 98.6;
        heatLostPerHour = 1.5;
        
        // output value expected
        expResult = 0.0;
        
        // call function to run test
        result = instance.calcTimeSinceDeath(avgBodyTemp, currentBodyTemp, heatLostPerHour);
        
        // compare expected return value with actual calue returned
        assertEquals(expResult, result, 0.0001);
    }
    
}
