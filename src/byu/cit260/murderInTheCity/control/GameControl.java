/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.murderInTheCity.control;

import byu.cit260.murderInTheCity.model.MurderInTheCity;
import byu.cit260.murderInTheCity.model.Player;

/**
 *
 * @author Wady Tupiza
 */
public class GameControl {
    
    public static Player createPlayer(String name){
        
         if (name == null){
            return null;            
        }
        
        Player player = new Player();
        player.setPlayerName(name);
        
        MurderInTheCity.setPlayer(player);
        return player;
    }

    public static void createNewGame(Player player) {
        System.out.println("*** createNewGame stub function called ***");    
    }
}
    