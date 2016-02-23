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
 * @author Wady Tupiza
 */
public class GameMenuView {

    private void startNewGame(){
                // create a new game
           GameControl.createNewGame(MurderInTheCity.getPlayer());  
           
           // display the game menu
           GameMenuView gameMenu = new GameMenuView();
           gameMenu.displayMenu();
    }

    void displayMenu() {
        System.out.println("*** GameMenuView displayMenu function called ***");
    }
    
}
