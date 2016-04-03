/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.murderInTheCity.view;

import byu.cit260.murderInTheCity.control.GameControl;
import byu.cit260.murderInTheCity.control.MapControl;
import byu.cit260.murderInTheCity.control.SuspectListControl;
import static byu.cit260.murderInTheCity.control.SuspectListControl.createSuspectList;
import byu.cit260.murderInTheCity.model.Cases;
import byu.cit260.murderInTheCity.model.MurderInTheCity;
import byu.cit260.murderInTheCity.model.PiecesOfEvidence;
import byu.cit260.murderInTheCity.model.SuspectList;

/**
 *
 * @author Wady Tupiza
 */
public class GamePlayMenuView extends View {
    
    public GamePlayMenuView(){
               super("\n"
                    + "\n -------------------------------------"
                    + "\n  Game Play Menu                      "
                    + "\n -------------------------------------"
                    + "\n O - List of pieces of evidence       "
                    + "\n L – Suspect List                     "
                    + "\n M - Map                              "
                    + "\n P - Professional progression         "
                    + "\n R - Print a report                   "   
                    + "\n E - Exit game                        "     
                    + "\n -------------------------------------");
    }
    
    @Override
    public boolean doAction(String choice) {
                
        choice = choice.toUpperCase();
                
        switch (choice){
          
          case "O":                         // List of pieces evidence
          case "o":
               this.listOfPiecesOfEvidence();         
            break;
          case "L":                            // Suspect List
          case "l":
                this.suspectList(); 
             break;
          case "M":                            // Move to a new location
          case "m":
                this.mapView(); 
            break;  
          case "P":                            // Player Progress
          case "p":
               this.professionalProgress(); 
            break;
          case "R":                            // Player Progress
          case "r":
               this.printReport(); 
            break;
          case "E":                            // exit
          case "e":
              return true;
          default:
               ErrorView.display(this.getClass().getName(),
                       "*** Invalid selection *** Try again");
            break;
        }
        
        return false;
    }

    public void listOfPiecesOfEvidence() {
        
        PiecesOfEvidence[] piecesOfEvidence = GameControl.getSortedPiecesOfEvidence();
        
        this.console.println("\nList of Pieces Of Evidence");
        this.console.println("Evidence Name" + "\t" +
                           "Evidence Type" + "\t" +
                           "Evidence Origin");
        
        for (PiecesOfEvidence evidence : piecesOfEvidence ){
            this.console.println(evidence.getEvidenceName() + "\t  " +
                               evidence.getEvidenceType() + "\t  " +
                               evidence.getEvidenceOrigin());
        }
    }

    private void suspectList() {
        
        SuspectList[] suspects = SuspectListControl.createSuspectList();
        
        for (int i = 0; i < suspects.length; i++){
            this.console.println("\nSuspect Name: " + suspects[i].getSuspectName());
        }
    }

    private void mapView() {   
        MapView moveToNewLocation = new MapView(); 
        moveToNewLocation.display();
        
    }

    private void professionalProgress() {
        this.console.println("*** professionalProgress called***");
    }

    private void printReport() {
        this.console.println("\nEnter the file path for where the report"
                                + " is to be printed");
           
           String filePath = this.getInput();
           
            try {
               //save the game to the specified file
               ReportView input = new ReportView();
               input.printReport(filePath);
               
            } catch (Exception ex) {
                ErrorView.display("Error printing file", ex.getMessage());
            }
    } 
}
