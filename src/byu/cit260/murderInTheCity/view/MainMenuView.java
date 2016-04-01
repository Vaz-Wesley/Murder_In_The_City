/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.murderInTheCity.view;

import byu.cit260.murderInTheCity.control.GameControl;
import byu.cit260.murderInTheCity.model.MurderInTheCity;

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
               ErrorView.display(this.getClass().getName(),
                       "*** Invalid selection *** Try again");
        }
        
        return false;
    }
    
    
        private void startNewGame(){
            
            //create a new game
            GameControl.createNewGame(MurderInTheCity.getPlayer());
            
            //display the game plya menu
            GamePlayMenuView gamePlayMenu = new GamePlayMenuView();
            gamePlayMenu.display();
        }
        
        private void getHelp(){            
            
            HelpMenuView helpMenuView = new HelpMenuView(); 
            helpMenuView.display();
        }
        
        private void saveGame(){            
           this.console.println("\nEnter the file path for file where the game"
                                + " is to be saved");
           
           String filePath = this.getInput();
           
            try {
               //save the fame to the specified file
               GameControl.saveGame(MurderInTheCity.getCurrentGame(), filePath);
            } catch (Exception ex) {
                ErrorView.display("MainMenuView", ex.getMessage());
            }
        } 
        
        private void resumeGame(){            
            
            this.console.println("\n\nEnter the file path file where the game"
                                + "\nis to be continued");
            
            String filePath = this.getInput();
            
            try {
                //start a saved game
                GameControl.getSavedGame(filePath);
            } catch (Exception ex) {
                ErrorView.display("MainMenuView", ex.getMessage());
            }
            
            GamePlayMenuView gameMenu = new GamePlayMenuView();
            gameMenu.display();
        }
}
