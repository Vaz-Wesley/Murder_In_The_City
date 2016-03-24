/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.murderInTheCity.control;

import byu.cit260.murderInTheCity.model.Cases;
import byu.cit260.murderInTheCity.exceptions.CasesControlException;
import byu.cit260.murderInTheCity.view.SolveCrimeView;

/**
 *
 * @author Wady Tupiza
 */
public class CasesControl {
    
    public static void checkList() throws CasesControlException{
        
        Cases[] caseList = createCases();
        
        SolveCrimeView instance = new SolveCrimeView();
        String caseSolved = instance.getInput();
        
        for (int i = 0; i < caseList.length; i++){       
            String caseName = caseList[i].getCaseName();
            
            if(!caseSolved.equals(caseName))
                throw new CasesControlException("Case Does Not Exist");
        }
       
    }
    
    public enum casesList{
        park,
        cassino,
        stadium;
    }
    
    public static  Cases[] createCases(){
        
        //created array of case solved
        Cases[] caseSolved = new Cases[3];
        
        Cases park = new Cases();
        park.setCaseName("The Park");
        caseSolved[casesList.park.ordinal()] = park;
        
        Cases cassino = new Cases();
        cassino.setCaseName("The Billionaire");
        caseSolved[casesList.cassino.ordinal()] = cassino;
        
        Cases stadium = new Cases();
        stadium.setCaseName("The Stadium");
        caseSolved[casesList.stadium.ordinal()] = stadium;
        
        return caseSolved;
    }
}
