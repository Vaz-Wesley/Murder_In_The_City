/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.murderInTheCity.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import murderinthecity.MurderInTheCity;

/**
 *
 * @author Wesley Vaz_2
 */
public abstract class View implements ViewInterface{
    
    protected String displayMessage;
    
    protected final BufferedReader keyboard = MurderInTheCity.getInFile();
    protected final PrintWriter console = MurderInTheCity.getOutFile();
    
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
        
        boolean valid = false;
        String value = null;
        
        try {
            while (!valid) { 
                // loop while an invalid value is entered

                // prompt for an option
                this.console.println(this.displayMessage);
                this.console.println("\nChoose an Option:");

                value = this.keyboard.readLine(); // get next lyne typed on keyboard
                value = value.trim(); // trim off leading and trailing blanks

                if (value.length() < 1) { //value is blank
                    ErrorView.display(this.getClass().getName(),
                                      "You must enter a value");
                    continue;
                }

                break; //end the loop
            }
            
        } catch (IOException e) {
                 ErrorView.display(this.getClass().getName(),
                         "Error reading input: " + e.getMessage());
        }
        
        
        return value; // return the value entered
    }
}
