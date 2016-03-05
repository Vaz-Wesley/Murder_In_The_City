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
public class MainMenuView extends View {
    
    public MainMenuView(){
                super("\n"
                    + "\n -------------------------------------------"
                    + "\n  Main Menu                                 "
                    + "\n -------------------------------------------"
                    + "\n L - Start new Game                         "
                    + "\n H - Get help                               "
                    + "\n S - Save game                              "
                    + "\n R - Resume game (if any)                   "
                    + "\n E - Exit game                              "
                    + "\n -------------------------------------------");
    }
    
    @Override
    public boolean doAction(String choice) {
                
        choice = choice.toUpperCase();
        
        switch (choice){
          case "L":                            //Create and start New game
               this.startNewGame();
             break;
          case "H":                           // Get Help
               this.getHelp();         
            break;
          case "S":                            //Save the game
                this.saveGame();
            break;  
          case "R":                            //Resume the game (if any)
               this.resumeGame();
            break;
          case "E":                            // Exit game
               return true;
         default:
               System.out.println("*** Invalid selection *** Try again");
        }
        
        return false;
    }
    
    
        private void startNewGame(){
            
            GamePlayMenuView gamePlayMenu = new GamePlayMenuView();
            gamePlayMenu.display();
        }
        
        private void getHelp(){            
            
            HelpMenuView helpMenuView = new HelpMenuView(); 
            helpMenuView.display();
        }
        
        private void saveGame(){            
            System.out.println("*** saveGame function called ***");
        }
        
        private void resumeGame(){            
            System.out.println("*** resumeGame function called ***");
        }
}
