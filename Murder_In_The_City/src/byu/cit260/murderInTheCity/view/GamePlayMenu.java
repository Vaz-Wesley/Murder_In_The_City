/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.murderInTheCity.view;

import java.util.Scanner;

/**
 *
 * @author Wady Tupiza
 */
public class GamePlayMenu {
    
    
             private final String Menu = "\n"
                    + "\n C – View city locations              "
                    + "\n E - List of pieces evidence          "
                    + "\n L – Suspect List                     "
                    + "\n Z - Solve the crime                  "
                    + "\n M - Move to a new location           "
                    + "\n P - Professional progression         "
                    + "\n H - Get help                         "
                    + "\n U - Resume game                      "
                    + "\n R - Restart game                     "
                    + "\n G - Save game                        "
                    + "\n E - Exit game                        ";
            

    public void displayGamePlayMenuView() {
        
        char selection = ' ';
        
        do {
            
            System.out.println(Menu);             //display the menu
            
            String input = this.getInput();       //get the user selection
            selection =input.charAt(0);           //get first character
            
            this.doAction(selection);             //do action based on selection
                       
        } while (selection != 'E');               // a selection is not "Exit"
        
        
    }   
    
    
    public boolean doAction(char selection) {
                
        switch (selection){

          case 'C':                         // View city locations
          case 'c':
              this.viewCityLocations();       
             break;
          case 'O':                         // List of pieces evidence
          case 'o':
               this.listOfPiecesOfEvidence();         
            break;
          case 'L':                            // Suspect List
          case 'l':
                this.suspectList(); 
            break;
          case 'M':                            // Move to a new location
          case 'm':
                this.moveToNewLocation(); 
            break;  
          case 'P':                            // Player Progress
          case 'p':
               this.professionalProgress(); 
            break;
          case 'H':                            // Get help
          case 'h':
              this.getHelp();  
            break;
          case 'U':                            // Resume game
          case 'u':
                this.resumeGame(); 
            break;  
          case 'R':                            // Restart game
          case 'r':
               this.restartGame(); 
            break;
          case 'G':                            // Save game
          case 'g':
               this.saveGame();  
            break;
          case 'E':                            // exit
          case 'e':
              this.exit();  
            break;
          default:
               System.out.println("*** Invalid selection *** Try again");
               break;
        }
        
        return false;
    }

    private String getInput() {
       Scanner keyboard = new Scanner(System.in);   // get infile for keyboard
        String value ="";                            // value to be returned
        
        boolean valid = false;                      // initialize to not valid
        
        while (!valid) {                            // loop while an invalid value is entered  
            System.out.println("\nEnter your option");
            
            value = keyboard.nextLine();            // get next lyne typed on keyboard
            value = value.trim();                   // trim off leading and trailing blanks
            
            if (value.length() < 1) {               //value is blank
                System.out.println("\nInvalid value: value can not be blank");
                continue;
            }
            
            break;                                  //end the loop
        }
        
        return value; // return the value entered
    }

    private void viewCityLocations() {
        System.out.println("*** viewCityLocations called***");
    }

    private void listOfPiecesOfEvidence() {
        System.out.println("*** listOfPiecesOfEvidence called***");
    }

    private void suspectList() {
        System.out.println("*** suspectList called***");
    }

    private void moveToNewLocation() {
        
        MoveToNewLocationView moveToNewLocation = new MoveToNewLocationView(); 
        moveToNewLocation.displayMoveToNewLocationView();
        
    }

    private void professionalProgress() {
        System.out.println("*** professionalProgress called***");
    }

    private void getHelp() {
        System.out.println("*** getHelp called***");
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

    private void exit() {
        
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.displayMainMenuView();
    }    
    
}
