/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.murderInTheCity.view;

import byu.cit260.murderInTheCity.control.LabSceneControl;
import byu.cit260.murderInTheCity.exceptions.LabSceneControlException;
import java.util.Scanner;

/**
 *
 * @author Wesley Vaz_2
 */
public class TimeSinceDeathView {
    
        String value = null;
    
        public TimeSinceDeathView(){
            System.out.println("\n"
                             + "\n -------------------------------------------"
                             + "\n  TIME SINCE DEATH CALCULATOR               "
                             + "\n -------------------------------------------"
                             + "\n Enter values to have an approximate time   "
                             + "\n since death OR enter E to exit             "
                             + "\n -------------------------------------------"
                             + "\n*HINT - Temperature in FAHRENHEIT only.     "
                             + "\n -------------------------------------------");
            
        }
    
     public void display(){
     
       boolean done = false;
        
        do{
            done = this.getDoubleNumber();
            
            } while (!done);
        
    }   
    
    public String[] getInput(){             
        
        Scanner keyboard = new Scanner(System.in); 
        boolean valid = false;
        
        String[] doubleValues = new String[3];
        
        while (!valid) { // loop while an invalid value is entered
            
            System.out.println("\n Average Body Temperature:");
            doubleValues[0] = keyboard.nextLine(); // get next lyne typed on keyboard
            
            System.out.println("\n Current Body Temperature:");
            doubleValues[1] = keyboard.nextLine(); // get next lyne typed on keyboard
            
            System.out.println("\n Heat Lost Per Hour:");
            doubleValues[2] = keyboard.nextLine(); // get next lyne typed on keyboard
            
            break; //end the loop
        }
        
        return doubleValues; // return the value entered
    }
    
    public boolean getDoubleNumber(){
     
       double[] number = new double[3];
       
       String[] values = this.getInput();
       
       for(int i = 0; i < values.length; i++){
                
            if ("E".equals(values[i])){
                return true;
            }
           
            try { 
                number[i] = Double.parseDouble(values[i]);
            } catch (NumberFormatException nf) {
                System.out.println("\nYou must enter a valid number.");
                return false;
            }
       }
       
       try {
                this.sinceDeathReturn(number);
            } catch (LabSceneControlException me){
                System.out.println(me.getMessage());
            }
       
       return true;
    }
    
    public double sinceDeathReturn(double[] number) throws LabSceneControlException{
       
            double avgBodyTemp = number[0];
            double currentBodyTemp = number[1];
            double heatLostPerHour = number[2];
            
            double returnValue = LabSceneControl.calcTimeSinceDeath(avgBodyTemp, currentBodyTemp, heatLostPerHour);
            System.out.println("\nTIME ELAPSED SINCE DEATH: " + returnValue);
            
        return returnValue;
    }
}
