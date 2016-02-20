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
 * @author Wesley Vaz_2
 */
public class GameControl {

    // (test) stub function
    public static Player createPlayer(String name) {
        
        if (name == null){
            return null;
        }
        
        Player player = new Player();
        player.setPlayerName(name);
        
        MurderInTheCity.setPlayer(player); // save the player
        
        return player;
    }
    
}
