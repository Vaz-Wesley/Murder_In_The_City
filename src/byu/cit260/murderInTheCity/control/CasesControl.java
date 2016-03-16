/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.murderInTheCity.control;

import byu.cit260.murderInTheCity.model.Cases;

/**
 *
 * @author Wady Tupiza
 */
public class CasesControl {
    
    public enum casesList{
        park;
    }
    
    public static Cases[] createCases(){
        
        //created array of case solved
        Cases[] caseSolved = new Cases[10];
        
        Cases park = new Cases();
        park.setCaseName("Walking in the Park");
        caseSolved[casesList.park.ordinal()] = park;
        
        return caseSolved;
    }
}
