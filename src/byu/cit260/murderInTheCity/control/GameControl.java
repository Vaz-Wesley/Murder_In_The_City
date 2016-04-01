/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.murderInTheCity.control;

import byu.cit260.murderInTheCity.exceptions.GameControlException;
import byu.cit260.murderInTheCity.model.Cases;
import byu.cit260.murderInTheCity.model.Game;
import byu.cit260.murderInTheCity.model.Map;
import byu.cit260.murderInTheCity.model.MurderInTheCity;
import byu.cit260.murderInTheCity.model.PiecesOfEvidence;
import byu.cit260.murderInTheCity.model.Player;
import byu.cit260.murderInTheCity.model.SuspectList;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author Wady Tupiza
 */
public class GameControl {
    
    protected final static PrintWriter console = murderinthecity.MurderInTheCity.getOutFile();
    
    public static void saveGame(Game game, String filepath)
            throws GameControlException{
        
        try (FileOutputStream fops = new FileOutputStream(filepath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);
            
            output.writeObject(game); //write the game out to file
        }
        catch(Exception e) {
            throw new GameControlException(e.getMessage());
        }
    }
    
    public static void getSavedGame(String filepath)
            throws GameControlException{
        
        Game game = null;
        
        try (FileInputStream fips = new FileInputStream(filepath)) {
            ObjectInputStream input = new ObjectInputStream(fips);
            
            game = (Game) input.readObject(); //read the game object from file
        }
        catch(Exception e) {
            throw new GameControlException(e.getMessage());
        }
        
        //close the output file
        MurderInTheCity.setCurrentGame(game); //save in MurderInTheCity
    }
    
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
        
        Game game = new Game();
        MurderInTheCity.setCurrentGame(game);
        
        game.setPlayer(player);
        
        SuspectList[] suspectList = SuspectListControl.createSuspectList();
        game.setSuspectList(suspectList);
        
        Cases[] cases = CasesControl.createCases();
        game.setCases(cases);
        
        PiecesOfEvidence[] piecesOfEvidence = PiecesOfEvidenceControl.createPiecesOfEvidence();
        game.setPiecesOfEvidence(piecesOfEvidence);
        
       // ArrayList<SuspectList> suspectList = SuspectListControl.addSuspect();
       // game.setSuspectList(suspectList);
        
        // = MapControl.addLocation();
        //game.setMap(location);
    }
    
    public static PiecesOfEvidence[] getSortedPiecesOfEvidence(){
        GameControl.console.println("*** called getSortedPiecesOfEvidence() in GameControl ***");
        return null;
    }
}
    