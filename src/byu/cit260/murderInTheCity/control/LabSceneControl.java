/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.murderInTheCity.control;

import byu.cit260.murderInTheCity.exceptions.LabSceneControlException;

/**
 *
 * @author Wady Tupiza
 */
public class LabSceneControl {
    
    public static double calcTimeSinceDeath(double avgBodyTemp, double currentBodyTemp, double heatLostPerHour) throws LabSceneControlException{
    
        if (avgBodyTemp != 98.6) { // is average temperature different?
            throw new LabSceneControlException("Wrong Average Temperature *** 98.6 only");
        }
        
	if (currentBodyTemp < 32.0 || currentBodyTemp > 98.6) { // is body temperature incorrect?
            throw new LabSceneControlException("Wrong Body Temperature *** 32f through 98.6 only");
        }
        
	if (heatLostPerHour != 1.5) { // is heat lost / hour incorrect?
            throw new LabSceneControlException("Wrong Heat Lost/Hour *** 1.5 only");
        }
        
        // expression
	double timeSinceDeath = (avgBodyTemp - currentBodyTemp) / heatLostPerHour;
        
        return timeSinceDeath;
                
    }
    
    public static double validateAlibi(double speedOfTravel, double milesTraveled, double minutesInAnHour) throws LabSceneControlException {
        
        if (milesTraveled < 2 || milesTraveled > 60) {
            throw new LabSceneControlException("Invalid Miles Traveled *** 2 through 60 only");
        }
	
        if (minutesInAnHour != 60) {
            throw new LabSceneControlException("Invalid Minutes in An Hour *** 60 minutes only");
        }
        
        if (speedOfTravel < 10 || speedOfTravel > 90 ) {
            throw new LabSceneControlException("Invalid Speed of Travel *** 10 through 90 mph only");
        }
    
	double minutesOfTravel = milesTraveled / speedOfTravel * minutesInAnHour;
        
	return minutesOfTravel;

    }
    
    public double celsiusToFahrenheit( double tempCelsius, double factorOne, double factorTwo) {
     
        if (tempCelsius < -20 || tempCelsius > 50) {
		return -1;
        }
        
	if (factorOne != 1.8) {
		return -1;
        }
        
	if (factorTwo != 32) {
		return -1;
        }
        
	double tempFahrenheit = tempCelsius * factorOne + factorTwo;
	
        return tempFahrenheit;

    }
}