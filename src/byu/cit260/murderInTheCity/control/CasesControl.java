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
        park,
        cassino,
        stadium;
    }
    
    public static Cases[] createCases(){
        
        //created array of case solved
        Cases[] caseSolved = new Cases[3];
        
        Cases park = new Cases();
        park.setCaseName("The Park");
        caseSolved[casesList.park.ordinal()] = park;
        
        Cases cassino = new Cases();
        cassino.setCaseName("The Billionaire");
        caseSolved[casesList.cassino.ordinal()] = cassino;
        
        Cases stadium = new Cases();
        stadium.setCaseName("The Billionaire");
        caseSolved[casesList.stadium.ordinal()] = stadium;
        
        return caseSolved;
    }
}
