/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.murderInTheCity.view;

import java.util.Scanner;



/**
 *
 * @author Wesley Vaz_2
 */
public class MainMenuView {
    
    
    
    
    public MainMenuView(){
        System.out.println("\n"
                    + "\n -------------------------------------------"
                    + "\n  Main Menu                                |"
                    + "\n |------------------------------------------"
                    + "\n L - Start new Game                         "
                    + "\n H - Help                                   "
                    + "\n S - Save game                              "
                    + "\n R - Resume game (if any)                   "
                    + "\n E - Exit game                              "
                    + "\n -------------------------------------------");

    }
    
    void displayMainMenuView(){
     
       boolean done = false;
        
        do{            
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("E"))
                return;
            
            done = this.doAction(menuOption);
            
            } while (!done);
    }

       
    private String getMenuOption(){        
        System.out.println("\n***getMenuOption() is called");
        return "N";
        
    }
    
    
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase();
        
        switch (choice){
          case "L":                            //Create and start New game
               this.startNewGame();
             break;
          case "H":
               this.displayHelpMenu();         //Display the Help Menu
            break;
          case "S":                            //Save the game
                this.saveGame();
            break;  
          case "R":                            //Resuem the game if any
               this.resumeGame();
            break;
         default:
               System.out.println("*** Invalid selection *** Try again");
        }
        
        return true;
    }
    
    
        private void startNewGame(){            
            System.out.println("*** StartNewGame function called ***");
        }
        
        private void displayHelpMenu(){            
            System.out.println("*** DisplayHelpMenu function called ***");
        }
        
        private void saveGame(){            
            System.out.println("*** StartSaveGame function called ***");
        }
        
        private void resumeGame(){            
            System.out.println("*** StartResumeGame function called ***");
        }
        
        private void exit(){            
            System.out.println("*** ExitGame function called ***");
        }
}
