/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.murderInTheCity.view;

import byu.cit260.murderInTheCity.control.GameControl;
import byu.cit260.murderInTheCity.model.Player;
import java.util.Scanner;

/**
 *
 * @author Wesley Vaz_2
 */
public class StartProgramView {
    
    private String promptMessage;
    
    // constructor function
    public StartProgramView() {
       this.promptMessage = "\nPlease enter your name: ";
       this.displayBanner();
       
    }

    private void displayBanner() {
        
        System.out.println(
                  "\n**********************************************************"
                + "\n*                                                        *"
                + "\n* Murder in the City is a text based role playing game   *"
                + "\n* that takes the user on a journey as a police officer   *"
                + "\n* named Albert Hancock. His quest is to move up the      *"
                + "\n* ranks from probational police detective, to police     *"
                + "\n* detective, to head detective,and finally chief of      *"
                + "\n* police. Throughout his entire life, Albert has dreamt  *"
                + "\n* of following his father's footsteps and defending his  *"
                + "\n* city. He is a family man with a wife and two children, *"
                + "\n* and struggles to care for them on a police officer's   *"
                + "\n* budget.                                                *"
                + "\n*                                                        *" 
                + "\n* The game begins on Albert's first day as a probational *"
                + "\n* police detective. During the game, you will need to    *"
                + "\n* solve crimes that happen throughout the city. With     *"
                + "\n* each high-profile crime that is solved, new            *"
                + "\n* opportunities for promotion arise. You will have to    *"
                + "\n* determine the difference between murder-suicides,      *"
                + "\n* protect your family from potential danger, and work    *"
                + "\n* with other agencies to solve crimes that will shock    *"
                + "\n* the nation. The game ends when you are promoted to the *"
                + "\n* chief of police.                                       *"
                + "\n*                                                        *"
                + "\n**********************************************************"
                );         
    }
    
    /**
     * display the start program view
     */
    public void displayStartProgramView() {
        
        boolean done = false;
        do{            
            String playersName = this.getPlayersName();
            if(playersName.toUpperCase().equals("E"))
                return;
            
            done = this.doAction(playersName);
                        
        } while (!done);
    }

    private String getPlayersName() {        
          
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        boolean valid = false; // initialize to not valid
        String value =" "; // value to be returned
        
        while (!valid) { // loop while an invalid value is entered
            System.out.println("\n" + this.promptMessage);
            
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

    private boolean doAction(String playersName) {
        
        
        if (playersName.length() < 2){            
            System.out.println("\nInvalid players name: "
                     + "The name must be greater than one character in length");
            return false;
        }
        
        Player player = GameControl.createPlayer(playersName);
        
        if (player == null){            
            System.out.println("\nError creating the player");
            return false;   
        }
        
        this.displayNextView(player);
        
        return true;   
    }

    private void displayNextView(Player player) {
       
        System.out.println("\n============================================="
                           + "\n Welcome to the game " + player.getPlayerName()
                           + "\n We hope you have a lot of fun             "
                           + "\n==========================================="
                           );
        
            MainMenuView mainMenuView = new MainMenuView();
            mainMenuView.display();            
    }  
}
