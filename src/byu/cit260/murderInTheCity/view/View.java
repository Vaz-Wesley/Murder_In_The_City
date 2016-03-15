/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.murderInTheCity.view;

import java.util.Scanner;

/**
 *
 * @author Wesley Vaz_2
 */
public abstract class View implements ViewInterface{
    
    protected String displayMessage;
    
    public View(){
    }
    
    public View(String promptMessage) {
        this.displayMessage = promptMessage;
    }
    
    @Override
    public void display(){
     
       boolean done = false;
        
        do{            
            String value = this.getInput();
            if (value.toUpperCase().equals("E"))
                return;
            
            done = this.doAction(value);
            
            } while (!done);
    }
    
    @Override
    public String getInput(){             
        
        Scanner keyboard = new Scanner(System.in); 
        boolean valid = false;
        String value = null;
        
        while (!valid) { // loop while an invalid value is entered
            
            // prompt for an option
            System.out.println("\n" +  this.displayMessage);
            System.out.println("\nChoose an Option:");
            
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
}
