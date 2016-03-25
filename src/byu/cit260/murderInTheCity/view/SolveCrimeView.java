/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.murderInTheCity.view;

import byu.cit260.murderInTheCity.control.PoliceOfficeSceneControl;
import byu.cit260.murderInTheCity.exceptions.CasesControlException;

/**
 *
 * @author Wesley Vaz_2
 */
public class SolveCrimeView extends View {
    
    public SolveCrimeView(){
        super("\n"
            + "\n -------------------------------------------"
            + "\n  Solve A Crime                             "
            + "\n -------------------------------------------"
            + "\n ENTER CASE NAME or                         "
            + "\n E - Exit                                   "
            + "\n -------------------------------------------");
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
     public boolean doAction(String input){
        
        boolean returnValue;
        
        try {
             returnValue = crimeCheckReturn(input);
        } catch (CasesControlException me) {
            System.out.println(me.getMessage());
            return false;
        }
        
        if (returnValue == true){
            System.out.println("*** Crime Solved ***");
            return true;
        }
        
        if(input.equals("E")) {
            return true;
        } 
        
        return false;
    }
    
     private boolean crimeCheckReturn(String input) throws CasesControlException {   
         
       boolean returnValue = PoliceOfficeSceneControl.solveCrime(input);
        
       return returnValue;
    }
    
}

