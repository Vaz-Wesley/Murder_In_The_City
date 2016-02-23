/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.murderInTheCity.control;

/**
 *
 * @author Wady Tupiza
 */
public class LabSceneControl {
    
    public double calcTimeSinceDeath(double avgBodyTemp, double currentBodyTemp, double heatLostPerHour){
    
        if (avgBodyTemp != 98.6) { // is average temperature different?
            return -1;
        }
        
	if (currentBodyTemp < 32 || currentBodyTemp > 98.6) { // is body temperature incorrect?
            return -1;
        }
        
	if (heatLostPerHour != 1.5) { // is heat lost / hour incorrect?
            return -1;
        }
        
        // expression
	double timeSinceDeath = (avgBodyTemp - currentBodyTemp) / heatLostPerHour;
        
        return timeSinceDeath;
                
    }
    
    public double validateAlibi(double speedOfTravel, double milesTraveled, double minutesInAnHour) {
        
        if (milesTraveled < 2 || milesTraveled > 60) {
            return -1;
        }
	
        if (minutesInAnHour != 60) {
            return -1;
        }
        
        if (speedOfTravel < 10 || speedOfTravel > 90 ) {
            return -1;
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