/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package murderinthecity;

import byu.cit260.murderInTheCity.model.Game;
import byu.cit260.murderInTheCity.model.Player;
import byu.cit260.murderInTheCity.view.StartProgramView;

/**
 *
 * @author Wady Tupiza and Wesley Vaz
 */
public class MurderInTheCity {
    
    private static Game currentGame = null;
    private static Player player = null;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.displayStartProgramView();
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        MurderInTheCity.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        MurderInTheCity.player = player;
    }
    
    
    
         
    }
    
