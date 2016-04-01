/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.murderInTheCity.view;

import byu.cit260.murderInTheCity.control.GameControl;
import byu.cit260.murderInTheCity.control.MapControl;
import byu.cit260.murderInTheCity.control.SuspectListControl;
import byu.cit260.murderInTheCity.model.PiecesOfEvidence;

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
                    + "\n C – View city locations              "
                    + "\n O - List of pieces of evidence       "
                    + "\n L – Suspect List                     "
                    + "\n M - Move to a new location           "
                    + "\n P - Professional progression         "
                    + "\n E - Exit game                        "     
                    + "\n -------------------------------------");
    }
    
    @Override
    public boolean doAction(String choice) {
                
        choice = choice.toUpperCase();
                
        switch (choice){

          case "C":                         // View city locations
          case "c":
              this.viewCityLocations();       
             break;
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
                this.moveToNewLocation(); 
            break;  
          case "P":                            // Player Progress
          case "p":
               this.professionalProgress(); 
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

    public void viewCityLocations(){
        
        String cityView = MapControl.cityView();
        this.console.println(cityView); 
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
        String checkList = SuspectListControl.checkList();
        this.console.println(checkList);
    }

    private void moveToNewLocation() {   
        MoveToNewLocationView moveToNewLocation = new MoveToNewLocationView(); 
        moveToNewLocation.display();
        
    }

    private void professionalProgress() {
        this.console.println("*** professionalProgress called***");
    }

    private void resumeGame() {
        this.console.println("*** resumeGame called***");
    }

    private void restartGame() {
        this.console.println("*** restartGame called***");
    }

    private void saveGame() {
        this.console.println("*** saveGame called***");
    } 
}
