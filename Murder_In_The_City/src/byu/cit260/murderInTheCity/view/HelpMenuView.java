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
public class HelpMenuView {
    
    
    private final String Menu = "\n"
            + "\n -------------------------------------------"
            + "\n | Main Menu                               |"
            + "\n |------------------------------------------"
            + "\n P - Purpose of the game                    "
            + "\n M - Moving in the game                     "
            + "\n T - Calculate time since death             "
            + "\n D - Calculate celsius to fahrenheit        "
            + "\n V - Validate a suspect's alibi             "
            + "\n E - Exit Help                              " 
            + "\n -------------------------------------------";
            

    public void displayMenu() {
        
        char selection = ' ';
        
        do {
            
            System.out.println(Menu);             //display the menu
            
            String input = this.getInput();       //get the user selection
            selection =input.charAt(0);           //get first character
            
            this.doAction(selection);             //do action based on selection
                       
        } while (selection != 'E');               // a selection is not "Exit"
        
        
    }   

    private void doAction(char selection) {
        
        switch (selection){

          case 'P':                         // purpose of the game
              this.showPurposeGame();       
             break;
          case 'M':                         // moving in the game
               this.showHowToMove();         
            break;
          case 'T':                            // calculate time since death
                this.calcTimeSinceDeath(); 
            break;  
          case 'D':                            // calculate celsius to fahrenheit
               this.celsiusToFahrenheit(); 
            break;
          case 'V':                            // validate a suspect's alibi
               this.validateAlibi();  
            break;
          case 'E':                            // exit help
               this.exit();
             break;
          default:
               System.out.println("*** Invalid selection *** Try again");
        }
    }
    
    
        private void showPurposeGame(){            
            System.out.println("*** showPurposeGame function called ***");
        }
        
        private void showHowToMove(){            
            System.out.println("*** showHowToMove function called ***");
        }
        
        private void calcTimeSinceDeath(){            
            System.out.println("*** calcTimeSinceDeath function called ***");
        }
        
        private void celsiusToFahrenheit(){            
            System.out.println("*** celsiusToFahrenheit function called ***");
        }
        
        private void validateAlibi(){            
            System.out.println("*** validateAlibi function called ***");
        }
        
        private void exit(){            
            System.out.println("*** exit function called ***");
        }

    
        private String getInput() {
        Scanner keyboard = new Scanner(System.in);   // get infile for keyboard
        String value ="";                            // value to be returned
        
        boolean valid = false;                      // initialize to not valid
        
        while (!valid) {                            // loop while an invalid value is entered  
            System.out.println("\n");
            
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
    
    
}
