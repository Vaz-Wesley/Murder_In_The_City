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
public class MoveToNewLocationView {
    
    public MoveToNewLocationView(){
           
            System.out.println("\n"
                    + "\n -------------------------------------------"
                    + "\n  Move to a new location                    "
                    + "\n -------------------------------------------"
                    + "\n P - Police Office                          "
                    + "\n L - Laboratory                             "
                    + "\n C - Crime Scene                            "          
                    + "\n E - Exit                                   "
                    + "\n -------------------------------------------");
        }
    
    public void displayMoveToNewLocationView(){
     
       boolean done = false;
        
        do{            
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("E"))
                return;
            
            done = this.doAction(menuOption);
            
            } while (!done);
    }
    
    private String getMenuOption(){             
        
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        String value =" "; // value to be returned
        
        boolean valid = false; // initialize to not valid
        
        while (!valid) { // loop while an invalid value is entered
            System.out.println("\n Enter your option" );
            
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
          case "P":                            // Police Office
               this.policeOffice();
             break;
          case "L":                           // Laboratory
               this.laboratory();         
            break;
          case "C":                            // Crime Scene
                this.crimeScene();
            break;
          case "E":                            // Exit game
               this.exit();
            break;
         default:
               System.out.println("*** Invalid selection *** Try again");
        }
        
        return false;
    }
    
     private void policeOffice(){            
            System.out.println("*** policeOffice function called ***");
        }
        
        private void laboratory(){            
            System.out.println("*** laboratory function called ***");
        }
       
        private void crimeScene(){            
            System.out.println("*** crimeScene function called ***");
        }
        
        private void exit(){            
            
            GamePlayMenu gamePlayMenu = new GamePlayMenu(); 
            gamePlayMenu.displayGamePlayMenuView();
        }
}
