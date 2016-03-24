/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.murderInTheCity.view;

import byu.cit260.murderInTheCity.control.LabSceneControl;
import byu.cit260.murderInTheCity.control.PoliceOfficeSceneControl;
import byu.cit260.murderInTheCity.exceptions.CasesControlException;
import byu.cit260.murderInTheCity.exceptions.PoliceOfficeViewControlException;
import java.util.Scanner;

/**
 *
 * @author Wesley Vaz_2
 */
public class LaboratoryView {
    
        public LaboratoryView(){
            System.out.println("\n"
                             + "\n -------------------------------------------"
                             + "\n  TIME SINCE DEATH CALCULATOR               "
                             + "\n -------------------------------------------"
                             + "\n Enter values to have an approximate time    "
                             + "\n since death.                                "
                             + "\n -------------------------------------------");
            
        }
    
     public Double getDoubleNumber(){
     
       Double number = null;
        
       while (number == null){
           String value = this.getInput();
            value = value.trim().toUpperCase();
            
            if(value.equals("E"))
                break;
            
            try {
                number = Double.parseDouble(value);
                
            } catch (NumberFormatException nf) {
                
                System.out.println("\nYou must enter a valid number."
                                   +"\nTry again or enter E to exit");
            }
       }
       
       return number;
    }
    
    public String getInput(){             
        
        Scanner keyboard = new Scanner(System.in); 
        boolean valid = false;
        String value = null;
        
        while (!valid) { // loop while an invalid value is entered
            
            // prompt for an option
            System.out.println("\n Average Body Temperature:"
                             + "\n*HINT - Tempearture in FAHRENHEIT only.");
            
            
            value = keyboard.nextLine(); // get next lyne typed on keyboard
            value = value.trim(); // trim off leading and trailing blanks
            
            if (value.length() < 1) { //value is blank
                System.out.println("\nInvalid value: value can not be blank");
                continue;
            }
            
            break; //end the loop
        }
        
        return value; // return the value entered
    }
    
    public boolean doAction() {
                
        double number = this.getDoubleNumber();
        double currentBodyTemp = 78;
        double heatLostPerHour = 1.5;
        
        double result = LabSceneControl.calcTimeSinceDeath(number, currentBodyTemp, heatLostPerHour);
               System.out.println("Time Since Death: " + result);
               
        return false;
    }
}
