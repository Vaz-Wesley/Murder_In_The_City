/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.murderInTheCity.control;


import byu.cit260.murderInTheCity.exceptions.CasesControlException;
import byu.cit260.murderInTheCity.view.SolveCrimeView;

/**
 *
 * @author Wesley Vaz_2
 */
public class PoliceOfficeSceneControl {
    
    public static boolean solveCrime(String input) throws CasesControlException{
        
     
        boolean returnValue = CasesControl.checkList(input);
        double playerProgress = 100;
        
        if (returnValue == true){
            return true;
        }
        
        return false;
    }
}
