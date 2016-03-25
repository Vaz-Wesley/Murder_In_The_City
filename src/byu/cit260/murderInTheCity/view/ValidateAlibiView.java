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
public class ValidateAlibiView {
    
        String value = null;
    
        public ValidateAlibiView(){
            System.out.println("\n"
                             + "\n -------------------------------------------"
                             + "\n  VALIDATE ALIBI                            "
                             + "\n -------------------------------------------"
                             + "\n  Enter values to validate an alibi         "
                             + "\n  OR enter E to exit                        "
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
        
        String[] doubleValues = new String[2];
        
        while (!valid) { // loop while an invalid value is entered
            
            System.out.println("\n Miles Traveled:");
            doubleValues[0] = keyboard.nextLine(); // get next lyne typed on keyboard
            
            System.out.println("\n Speed of Travel:");
            doubleValues[1] = keyboard.nextLine(); // get next lyne typed on keyboard
            
            break; //end the loop
        }
        
        return doubleValues; // return the value entered
    }
    
    public boolean getDoubleNumber(){
     
       double[] number = new double[2];
       
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
       
            double milesTraveled = number[0];
            double minutesInAnHour = 60 ;
            double speedOfTravel = number[1];
            
            double returnValue = LabSceneControl.validateAlibi(speedOfTravel, milesTraveled, minutesInAnHour);
            System.out.println("\nMINUTES OF TRAVEL: " + returnValue);
            
        return returnValue;
    }
}
