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
public class PoliceOfficeView {
    
    public PoliceOfficeView(){
           
            System.out.println("\n"
                    + "\n -------------------------------------------"
                    + "\n  Police Office                             "
                    + "\n -------------------------------------------"
                    + "\n I - Interrogate Suspect                    "
                    + "\n S - Solve Crime                            "
                    + "\n E - Exit                                   ");
        }
    
    public void displayPoliceOfficeView(){
     
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
          case "I":                            // Interrogate suspect
               this.interrogateSuspect();
             break;
          case "S":                           // Solve crime
               this.solveCrime();         
            break;
          case "E":                            // Exit game
               this.exit();
            break;
         default:
               System.out.println("*** Invalid selection *** Try again");
        }
        
        return false;
    }
    
     private void interrogateSuspect(){            
            System.out.println("*** policeOffice function called ***");
        }
        
        private void solveCrime(){            
            System.out.println("*** laboratory function called ***");
        }
        
        private void exit(){            
            
            MoveToNewLocationView moveToNewLocation = new MoveToNewLocationView(); 
            moveToNewLocation.displayMoveToNewLocationView();
        }
    
}
