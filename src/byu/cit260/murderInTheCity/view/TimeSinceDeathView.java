/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.murderInTheCity.view;

import byu.cit260.murderInTheCity.control.LabSceneControl;
import byu.cit260.murderInTheCity.exceptions.LabSceneControlException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import murderinthecity.MurderInTheCity;

/**
 *
 * @author Wesley Vaz_2
 */
public class TimeSinceDeathView {
    
        String value = null;
        
        protected final BufferedReader keyboard = MurderInTheCity.getInFile();
        protected final PrintWriter console = MurderInTheCity.getOutFile();
    
        public TimeSinceDeathView(){
            this.console.println("\n"
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
        
        boolean valid = false;
        
        String[] doubleValues = new String[3];
        
        try {
            while (!valid) { 
                // loop while an invalid value is entered

                this.console.println("\n Average Body Temperature:");
                doubleValues[0] = this.keyboard.readLine(); // get next lyne typed on keyboard

                this.console.println("\n Current Body Temperature:");
                doubleValues[1] = this.keyboard.readLine(); // get next lyne typed on keyboard

                this.console.println("\n Heat Lost Per Hour:");
                doubleValues[2] = this.keyboard.readLine(); // get next lyne typed on keyboard

                break; //end the loop
            } 
        } catch (IOException e) {
                    ErrorView.display(this.getClass().getName(),
                            "Error reading input: " + e.getMessage());
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
                ErrorView.display(this.getClass().getName(),
                        "\nYou must enter a valid number.");
                return false;
            }
       }
       
       try {
                this.sinceDeathReturn(number);
            } catch (LabSceneControlException me){
                this.console.println(me.getMessage());
            }
       
       return true;
    }
    
    public double sinceDeathReturn(double[] number) throws LabSceneControlException{
       
            double avgBodyTemp = number[0];
            double currentBodyTemp = number[1];
            double heatLostPerHour = number[2];
            
            double returnValue = LabSceneControl.calcTimeSinceDeath(avgBodyTemp, currentBodyTemp, heatLostPerHour);
            this.console.println("\nTIME ELAPSED SINCE DEATH: " + returnValue);
            
        return returnValue;
    }
}
