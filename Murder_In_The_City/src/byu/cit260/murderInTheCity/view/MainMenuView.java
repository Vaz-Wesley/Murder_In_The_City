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
        
    //System.out.println("\n"
        
        //private final String menu;
        
        public MainMenuView(){
            
            
            
           // this.menu = "\n"
           
            System.out.println("\n"
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

    
    
    public void displayMainMenuView(){
     
       boolean done = false;
        
        do{            
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("E"))
                return;
            
            done = this.doAction(menuOption);
            
            } while (!done);
    }

       
    private String getMenuOption(){        
        //System.out.println("\n***getMenuOption() is called");
        //return "N";
        
        
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        String value =" "; // value to be returned
        
        boolean valid = false; // initialize to not valid
        
        while (!valid) { // loop while an invalid value is entered
            System.out.println("\n Enter your option" );//+ this.promptMessage);
            
            value = keyboard.nextLine(); // get next lyne typed on keyboard
            value = value.trim(); // trim off leading and trailing blanks
            
            if (value.length() < 1) { //value is blank
                System.out.println("\nInvalid value: value can not be blank");
                continue;
            }
            
            break; //end the loop
        }
        
        return value; // return the value entered
        
    }
    
    
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
               this.exit();
            break;
         default:
               System.out.println("*** Invalid selection *** Try again");
        }
        
        return true;
    }
    
    
        private void startNewGame(){    
            
           System.out.println("*** StartNewGame function called ***");
          
        }
        
        private void getHelp(){            
            System.out.println("*** getHelp function called ***");
        }
        
        private void saveGame(){            
            System.out.println("*** saveGame function called ***");
        }
        
        private void resumeGame(){            
            System.out.println("*** resumeGame function called ***");
        }
        
        private void exit(){            
            System.out.println("*** exit function called ***");
        }
}
