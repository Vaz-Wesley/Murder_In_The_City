/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.murderInTheCity.control;

/**
 *
 * @author Wesley Vaz_2
 */
public class PoliceOfficeSceneControl {
    
        // case name list which will be substituted by a switch statement
    String caseNameList= "walking in the park";
    
    public String solveCrime(String caseName, double playerProgress){
    
        if (caseName != caseNameList) { // does name match a case in the list?
            return "Case Name Does Not Exist";
        }
        
	if (playerProgress < 100) { // Is progress less than 100%?
            return "Player Progress Not 100";
        }
        
        // expression
	String solveTheCrime = "Crime Solved";
        
        return solveTheCrime;
                
    }
    
}
