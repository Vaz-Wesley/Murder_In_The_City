/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.murderInTheCity.view;

/**
 *
 * @author Wady Tupiza
 */
public class HelpMenuView extends View {
    
    public HelpMenuView(){
        super("\n"
            + "\n -------------------------------------------"
            + "\n   Get Help                                 "
            + "\n -------------------------------------------"
            + "\n P - Purpose of the game                    "
            + "\n M - Moving in the game                     "
            + "\n T - Calculate time since death             "
            + "\n D - Calculate celsius to fahrenheit        "
            + "\n V - Validate a suspect's alibi             "
            + "\n E - Exit Help                              " 
            + "\n -------------------------------------------");
    }
    
    @Override
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase();
        
        switch (choice){

          case "P":                         // purpose of the game
          case "p":
              this.showPurposeGame();       
             break;
          case "M":                         // moving in the game
          case "m":
               this.showHowToMove();         
            break;
          case "T":                            // calculate time since death
          case "t":
                this.calcTimeSinceDeath(); 
            break;  
          case "D":                            // calculate celsius to fahrenheit
          case "d":
               this.celsiusToFahrenheit(); 
            break;
          case "V":                            // validate a suspect's alibi
          case "v":
               this.validateAlibi();  
            break;
          case "E":                            // validate a suspect"s alibi
          case "e":
              return true;
          default:
               System.out.println("*** Help Invalid selection *** Try again");
               break;
        }
        
        return false;
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
}
