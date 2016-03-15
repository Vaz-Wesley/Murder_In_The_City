/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.murderInTheCity.control;

import byu.cit260.murderInTheCity.model.CaseSolved;
import byu.cit260.murderInTheCity.model.Game;
import byu.cit260.murderInTheCity.model.Map;
import byu.cit260.murderInTheCity.model.MurderInTheCity;
import byu.cit260.murderInTheCity.model.Personage;
import byu.cit260.murderInTheCity.model.PiecesOfEvidence;
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
        
        Game game = new Game();
        MurderInTheCity.setCurrentGame(game);
        
        game.setPlayer(player);
        
        Personage[] personage = GameControl.createPersonage();
        game.setPersonage(personage);
        
        CaseSolved[] caseSolved = GameControl.createCaseSolved();
        game.setCaseSolved(caseSolved);
        
        PiecesOfEvidence[] piecesOfEvidence = GameControl.createPiecesOfEvidence();
        game.setPiecesOfEvidence(piecesOfEvidence);
        
        Map map = MapControl.createMap();
        game.setMap(map);
        
        MapControl.moveActorToStartingLocation(map);    
    }
    
    public enum Personages{
        daniel,
        ralph;
    }
    
    public static PiecesOfEvidence[] createPiecesOfEvidence(){
        
        PiecesOfEvidence[] piecesOfEvidence = new PiecesOfEvidence[50];
        
        PiecesOfEvidence knife = new PiecesOfEvidence();
        knife.setEvidenceName("Knife");
        knife.setEvidenceType("Object");
        knife.setEvidenceOrigin("To be Set");
        piecesOfEvidence[0] = knife;
        
        PiecesOfEvidence blood = new PiecesOfEvidence();
        blood.setEvidenceName("Blood");
        blood.setEvidenceType("Organic");
        blood.setEvidenceOrigin("To be Set");
        piecesOfEvidence[1] = blood;
        
        return piecesOfEvidence;
    }
    
    public static CaseSolved[] createCaseSolved(){
        
        //created array of case solved
        CaseSolved[] caseSolved = new CaseSolved[10];
        
        CaseSolved thePark = new CaseSolved();
        thePark.setCaseName("Walking in the Park");
        caseSolved[0] = thePark;
        
        return caseSolved;
    }
    
    public static Personage[] createPersonage(){
        
        //created array of personages 
        Personage[] personage = new Personage[20];
        
        Personage daniel = new Personage();
        daniel.setPersonageType("Suspect");
        daniel.setPersonageName("Daniel");
        daniel.setDescription("Description Here");
        personage[Personages.daniel.ordinal()] = daniel;
        
        Personage ralph = new Personage();
        ralph.setPersonageType("Suspect");
        ralph.setPersonageName("Ralph");
        ralph.setDescription("Description Here");
        personage[Personages.ralph.ordinal()] = ralph;
        
        return personage;
    }
    
    public static PiecesOfEvidence[] getSortedPiecesOfEvidence(){
        System.out.println("*** called getSortedPiecesOfEvidence() in GameControl ***");
        return null;
    }
}
    