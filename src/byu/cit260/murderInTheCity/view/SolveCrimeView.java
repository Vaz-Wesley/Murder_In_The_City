/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.murderInTheCity.view;

import byu.cit260.murderInTheCity.control.PoliceOfficeSceneControl;

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
            + "\n Enter Case Name or E - Exit                "
            + "\n -------------------------------------------");
            
    }
    
    @Override
    public boolean doAction(String caseName){
                
        caseName = caseName.toUpperCase();
        
        switch (caseName){
            case "Park":                            
               this.solveCrime();
               break;
            case "B":                           
               this.solveCrime();
               break;
             case "C":                            
               this.solveCrime();
               break;
            case "E":                            
               return true;
            default:
               System.out.println("*** Invalid selection *** Try again");
        }
        
        return false;
    }
    
    private void solveCrime(){  
        String crimeSolved = PoliceOfficeSceneControl.returnFunction();
        System.out.println(crimeSolved);
        
        }
}
