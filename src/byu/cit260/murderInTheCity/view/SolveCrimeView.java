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
     public boolean doAction(String input){
         
        input = input.toUpperCase();
        
        try {
            this.crimeCheckReturn();
        } catch (CasesControlException me) {
            System.out.println(me.getMessage());
            return false;
        }
        
        if(!input.equals("E")) {
            return true;
        } 
        
        return false;
    }
    
     private void crimeCheckReturn() throws CasesControlException {   
         
        //boolean solveCrimeReturn = 
       PoliceOfficeSceneControl.solveCrime();
        
    }
    
}

