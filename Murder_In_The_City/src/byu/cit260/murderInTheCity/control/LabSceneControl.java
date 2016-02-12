/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.murderInTheCity.control;

/**
 *
 * @author Wesley Vaz_2
 */
public class LabSceneControl {
    
    public double calcTimeSinceDeath(double avgBodyTemp, double currentBodyTemp, double heatLostPerHour){
    
        if (avgBodyTemp != 98.5) { // is average temperature different?
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
}