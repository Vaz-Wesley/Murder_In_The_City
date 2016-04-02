/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.murderInTheCity.view;

import byu.cit260.murderInTheCity.control.CasesControl;
import byu.cit260.murderInTheCity.control.SuspectListControl;
import byu.cit260.murderInTheCity.model.Cases;
import byu.cit260.murderInTheCity.model.SuspectList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import murderinthecity.MurderInTheCity;

/**
 *
 * @author Wesley Vaz_2
 */
public class ReportView {
    
    protected final BufferedReader keyboard = MurderInTheCity.getInFile();
    protected final PrintWriter console = murderinthecity.MurderInTheCity.getOutFile();
    
    public String getInput(){           
        
        boolean valid = false;
        String value = null;
        
        try {
            while (!valid) { 
                // loop while an invalid value is entered
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
    
    public void printReport(String outputLocation ){
        
        SuspectList[] suspectList = SuspectListControl.createSuspectList();
        
        try (PrintWriter out = new PrintWriter(outputLocation)) {
            
            //print title and column headings
            out.println("\n\n          CASE & SUSPECT LISTS          ");
            out.printf("%n%-15s%15s", "Cases Involved", "Suspects");
            out.printf("%n%-15s%15s", "--------------", "--------");
            
            for (int i = 0; i < suspectList.length; i++){  
                out.printf("%n%-15s%15s", suspectList[i].getCaseInvolved()
                                        , suspectList[i].getSuspectName());
                
                if (suspectList[i] == suspectList[suspectList.length-1])
                    this.console.println("Report printed successfuly");
            }
        } catch (IOException ex) {
                ErrorView.display(this.getClass().getName(),
                        "I/O Error: " + ex.getMessage());
        }
        
        GamePlayMenuView gamePlayMenu = new GamePlayMenuView();
        gamePlayMenu.display();
    }
    
}
