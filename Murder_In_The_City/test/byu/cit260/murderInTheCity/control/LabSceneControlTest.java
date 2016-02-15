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

    /**
     * Test of validateAlibi method, of class LabSceneControl.
     */
    @Test
    public void testValidateAlibi() {
        System.out.println("validateAlibi");
       
        /************** 
         * TEST CASE #1
         **************/
        
        System.out.println("\tTest Case #1");
       
        // input values
        double milesTraveled = 30;
        double minutesInAnHour = 60;
        double speedOfTravel = 45;
        
        // output value expected
        double expResult = 40;
        
         // instance of LabSceneControl class
        LabSceneControl instance = new LabSceneControl();
        
        // call function to run test
        double result = instance.validateAlibi(speedOfTravel, milesTraveled, minutesInAnHour);
        assertEquals(expResult, result, 0.0001);
        
        /************** 
         * TEST CASE #2
         **************/
        
        System.out.println("\tTest Case #2");
       
        // input values
        milesTraveled = 60;
        minutesInAnHour = 60;
        speedOfTravel = 5;
        
        // output value expected
        expResult = -1;
        
        // call function to run test
        result = instance.validateAlibi(speedOfTravel, milesTraveled, minutesInAnHour);
        assertEquals(expResult, result, 0.0001);
        
        /************** 
         * TEST CASE #3
         **************/
        
        System.out.println("\tTest Case #3");
       
        // input values
        milesTraveled = 15;
        minutesInAnHour = 70;
        speedOfTravel = 65;
        
        // output value expected
        expResult = -1;
        
        // call function to run test
        result = instance.validateAlibi(speedOfTravel, milesTraveled, minutesInAnHour);
        assertEquals(expResult, result, 0.0001);
        
        /************** 
         * TEST CASE #4
         **************/
        
        System.out.println("\tTest Case #4");
       
        // input values
        milesTraveled = 15;
        minutesInAnHour = 70;
        speedOfTravel = 45;
        
        // output value expected
        expResult = -1;
        
        // call function to run test
        result = instance.validateAlibi(speedOfTravel, milesTraveled, minutesInAnHour);
        assertEquals(expResult, result, 0.0001);
        
        /************** 
         * TEST CASE #5
         **************/
        
        System.out.println("\tTest Case #5");
       
        // input values
        milesTraveled = 60;
        minutesInAnHour = 60;
        speedOfTravel = 10;
        
        // output value expected
        expResult = 360;
        
        // call function to run test
        result = instance.validateAlibi(speedOfTravel, milesTraveled, minutesInAnHour);
        assertEquals(expResult, result, 0.0001);
        
        /************** 
         * TEST CASE #6
         **************/
        
        System.out.println("\tTest Case #6");
       
        // input values
        milesTraveled = 2;
        minutesInAnHour = 60;
        speedOfTravel = 90;
        
        // output value expected
        expResult = 1.3333;
        
        // call function to run test
        result = instance.validateAlibi(speedOfTravel, milesTraveled, minutesInAnHour);
        assertEquals(expResult, result, 0.0001);
        
        /************** 
         * TEST CASE #7
         **************/
        
        System.out.println("\tTest Case #7");
       
        // input values
        milesTraveled = 60;
        minutesInAnHour = 60;
        speedOfTravel = 90;
        
        // output value expected
        expResult = 40;
        
        // call function to run test
        result = instance.validateAlibi(speedOfTravel, milesTraveled, minutesInAnHour);
        assertEquals(expResult, result, 0.0001);
    }

    /**
     * Test of celsiusToFahrenheit method, of class LabSceneControl.
     */
    @Test
    public void testCelsiusToFahrenheit() {
        System.out.println("celsiusToFahrenheit");
        
        /************** 
         * TEST CASE #1
         **************/
        
        System.out.println("\tTest Case #1");
        
        // input values
        double tempCelsius = -05;
        double factorOne = 1.8;
        double factorTwo = 32;
        
        // output value expected
        double expResult = 23;
        
        // instance of LabSceneControl class
        LabSceneControl instance = new LabSceneControl();
        
        // call function to run test
        double result = instance.celsiusToFahrenheit(tempCelsius, factorOne, factorTwo);
        assertEquals(expResult, result, 0.0);
        
        /************** 
         * TEST CASE #2
         **************/
        
        System.out.println("\tTest Case #2");
        
        // input values
        tempCelsius = -30;
        factorOne = 1.8;
        factorTwo = 32;
        
        // output value expected
        expResult = -1;
        
        // call function to run test
        result = instance.celsiusToFahrenheit(tempCelsius, factorOne, factorTwo);
        assertEquals(expResult, result, 0.0);
        
        /************** 
         * TEST CASE #3
         **************/
        
        System.out.println("\tTest Case #3");
        
        // input values
        tempCelsius = 50;
        factorOne = 1.5;
        factorTwo = 32;
        
        // output value expected
        expResult = -1;
        
        // call function to run test
        result = instance.celsiusToFahrenheit(tempCelsius, factorOne, factorTwo);
        assertEquals(expResult, result, 0.0);
        
        /************** 
         * TEST CASE #4
         **************/
        
        System.out.println("\tTest Case #4");
        
        // input values
        tempCelsius = 0;
        factorOne = 1.8;
        factorTwo = 30;
        
        // output value expected
        expResult = -1;
        
        // call function to run test
        result = instance.celsiusToFahrenheit(tempCelsius, factorOne, factorTwo);
        assertEquals(expResult, result, 0.0);
        
        /************** 
         * TEST CASE #5
         **************/
        
        System.out.println("\tTest Case #5");
        
        // input values
        tempCelsius = -20;
        factorOne = 1.8;
        factorTwo = 32;
        
        // output value expected
        expResult = -4;
        
        // call function to run test
        result = instance.celsiusToFahrenheit(tempCelsius, factorOne, factorTwo);
        assertEquals(expResult, result, 0.0);
        
        /************** 
         * TEST CASE #6
         **************/
        
        System.out.println("\tTest Case #6");
        
        // input values
        tempCelsius = 50;
        factorOne = 1.8;
        factorTwo = 32;
        
        // output value expected
        expResult = 122;
        
        // call function to run test
        result = instance.celsiusToFahrenheit(tempCelsius, factorOne, factorTwo);
        assertEquals(expResult, result, 0.0);
        
        /************** 
         * TEST CASE #7
         **************/
        
        System.out.println("\tTest Case #7");
        
        // input values
        tempCelsius = 50;
        factorOne = 1.8;
        factorTwo = 32;
        
        // output value expected
        expResult = 122;
        
        // call function to run test
        result = instance.celsiusToFahrenheit(tempCelsius, factorOne, factorTwo);
        assertEquals(expResult, result, 0.0);
    }
    
}
