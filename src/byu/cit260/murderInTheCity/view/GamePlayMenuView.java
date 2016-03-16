/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.murderInTheCity.view;

import byu.cit260.murderInTheCity.control.GameControl;
import byu.cit260.murderInTheCity.control.MapControl;
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
                    + "\n U - Resume game                      "
                    + "\n R - Restart game                     "
                    + "\n G - Save game                        "
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
          case "M":                            // Move to a new location
          case "m":
                this.moveToNewLocation(); 
            break;  
          case "P":                            // Player Progress
          case "p":
               this.professionalProgress(); 
            break;
          case "U":                            // Resume game
          case "u":
                this.resumeGame(); 
            break;  
          case "R":                            // Restart game
          case "r":
               this.restartGame(); 
            break;
          case "G":                            // Save game
          case "g":
               this.saveGame();  
            break;
          case "E":                            // exit
          case "e":
              return true;
          default:
               System.out.println("*** Invalid selection *** Try again");
            break;
        }
        
        return false;
    }

    public void viewCityLocations(){
        
        String cityView = MapControl.cityView();
        System.out.println(cityView);
        
        /*public void viewCityLocations(ArrayList<Map> place) {

            for (Map location : place ) {

                System.out.println(   "\n"
                                    + "\n -------------------------------------"
                                    + "\n  City Locations (So Far)             "
                                    + "\n -------------------------------------"
                                    + "\n Police Office                        "
                                    + "\n Laboratory                           "
                                    + "\n" + location.getLocationName());
            }
        }
    */    
    }

    public void listOfPiecesOfEvidence() {
        
        PiecesOfEvidence[] piecesOfEvidence = GameControl.getSortedPiecesOfEvidence();
        
        System.out.println("\nList of Pieces Of Evidence");
        System.out.println("Evidence Name" + "\t" +
                           "Evidence Type" + "\t" +
                           "Evidence Origin");
        
        for (PiecesOfEvidence evidence : piecesOfEvidence ){
            System.out.println(evidence.getEvidenceName() + "\t  " +
                               evidence.getEvidenceType() + "\t  " +
                               evidence.getEvidenceOrigin());
        }
    }

    private void suspectList() {
        System.out.println("*** suspectList called***");
    }

    private void moveToNewLocation() {   
        MoveToNewLocationView moveToNewLocation = new MoveToNewLocationView(); 
        moveToNewLocation.display();
        
    }

    private void professionalProgress() {
        System.out.println("*** professionalProgress called***");
    }

    private void resumeGame() {
        System.out.println("*** resumeGame called***");
    }

    private void restartGame() {
        System.out.println("*** restartGame called***");
    }

    private void saveGame() {
        System.out.println("*** saveGame called***");
    } 
}
