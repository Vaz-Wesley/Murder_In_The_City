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
            + "\n   Get Help                                 "
            + "\n -------------------------------------------"
            + "\n P - Purpose of the game                    "
            + "\n M - Moving in the game                     "
            + "\n T - Calculate time since death             "
            + "\n D - Calculate celsius to fahrenheit        "
            + "\n V - Validate a suspect's alibi             "
            + "\n E - Exit Help                              " 
            + "\n -------------------------------------------";
            

    public void displayHelpMenuView() {
        
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
            System.out.println("\n The game begins on Albert's first day as a   "
                            + "\n probational police detective. During the     "
                            + "\n game, you will need to solve crimes that     "
                            + "\n happen throughout the city. With each        "
                            + "\n high-profile crime that is solved, new       "
                            + "\n opportunities for promotion arise. You will  "
                            + "\n have to determine the difference between     "
                            + "\n murder-suicides, protect your family from    "
                            + "\n potential danger, and work with other        "
                            + "\n agencies to solve crimes that will shock the "
                            + "\n nation. The game ends when you are promoted  "
                            + "\n to the chief of police.                      "
                             );
        }
        
        private void showHowToMove(){            
            System.out.println("\n The screen prompts the payer to enter the   "
                            + "\n name of the location they would like to move "
                            + "\n to. If the location name is invalid, the     "
                            + "\n computer will throw an error message and     "
                            + "\n return to the previous screen. If the input  "
                            + "\n is valid, the player will be moved to the    "
                            + "\n desired location.                            "
                             );
        }
        
        private void calcTimeSinceDeath(){            
            System.out.println("\n A menu appears which asks the player to     "
                            + "\n enter the time the body was found, body      "
                            + "\n temperature, and room temperature. Then the  "
                            + "\n computer calculates the since death.         "
                              );
        }
        
        private void celsiusToFahrenheit(){            
            System.out.println("\n The player will enter the temperature in    "
                            + "\n Celsius to convert it to Fahrenheit.         "
                              );
        }
        
        private void validateAlibi(){            
            System.out.println("\n Using the time of death and Celsius         "
                            + "\n to Fahrenheit calculations, the computer will"
                            + "\n prompt the player to enter the information.  "
                            + "\n It will then output a distance from the e.   "
                            + "\n crime scene. The player will then be able to "
                            + "\n see based on the evidence if the suspect     "
                            + "\n could have committed the crime based on      "
                            + "\n their alibis.                                "
                              );
        }
        
        private void exit(){            
            MainMenuView mainMenuView = new MainMenuView();
                
            mainMenuView.displayMainMenuView();
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
    
    
}
