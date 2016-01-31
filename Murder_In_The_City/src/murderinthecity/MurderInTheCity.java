/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package murderinthecity;

import byu.cit260.murderInTheCity.model.Actor;
import byu.cit260.murderInTheCity.model.CasesSolved;
import byu.cit260.murderInTheCity.model.EvidenceScene;
import byu.cit260.murderInTheCity.model.Game;
import byu.cit260.murderInTheCity.model.LabScene;
import byu.cit260.murderInTheCity.model.Location;
import byu.cit260.murderInTheCity.model.Map;
import byu.cit260.murderInTheCity.model.Personage;
import byu.cit260.murderInTheCity.model.PiecesOfEvidence;
import byu.cit260.murderInTheCity.model.Player;
import byu.cit260.murderInTheCity.model.PoliceOfficeScene;
import byu.cit260.murderInTheCity.model.SuspectList;

/**
 *
 * @author Wady Tupiza and Wesley Vaz
 */
public class MurderInTheCity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // this is the SuspectList instance
        SuspectList suspectListInfo = new SuspectList();
        
        suspectListInfo.setSuspectName("To Be Set");
        suspectListInfo.setCaseInvolved("To BE Set");
        
        
        // call the toString function to display the contents in the console
        String SuspectListCheck = suspectListInfo.toString();
        System.out.println(suspectListInfo);
        
        // this is the Map instance
        Map mapInfo = new Map();
        
        mapInfo.setRowCount(0);
        mapInfo.setColumnCount(0);
        
        
        // call the toString function to display the contents in the console
        String MapCheck = mapInfo.toString();
        System.out.println(mapInfo);
        
        // this is the Personage instance
        Personage personageInfo = new Personage();
        
        personageInfo.setPersonageType("To Be Set");
        personageInfo.setPersonageName("To Be Set");
        personageInfo.setDescription("To Be Set");
        personageInfo.setCoordinates(0);
        
        // call the toString function to display the contents in the console
        String PersonageCheck = personageInfo.toString();
        System.out.println(personageInfo);
        
        // this is the Game instance
        Game gameInfo = new Game();
        
        gameInfo.setTimePlayed("To Be Set");
        gameInfo.setNoPeople("To Be Set");
      
        // call the toString function to display the contents in the console
        String GameCheck = gameInfo.toString();
        System.out.println(gameInfo);
        
        // this is the CaseSolved instance
        CasesSolved casesSolvedInfo = new CasesSolved();
        
        casesSolvedInfo.setCaseName("To Be Set");
        casesSolvedInfo.setDate("To Be Set");
        
        // call the toString function to display the contents in the console
        String CaseSolvedCheck = casesSolvedInfo.toString();
        System.out.println(casesSolvedInfo);
        
        // this is the LabScene instance
        LabScene labSceneInfo = new LabScene();
        
        labSceneInfo.setDescription("To Be Set");
        labSceneInfo.setFingerPrintTest("To Be Set");
        labSceneInfo.setDnaTest("To Be Set");
        
        // call the toString function to display the contents in the console
        String labSceneCheck = labSceneInfo.toString();
        System.out.println(labSceneInfo);
        
        // this is the PoliceOfficeScene instance
        PoliceOfficeScene policeOfficeSceneInfo = new PoliceOfficeScene();
        
        policeOfficeSceneInfo.setDescription("To Be Set");
        policeOfficeSceneInfo.setAlibiValidation("To Be Set");
        
        // call the toString function to display the contents in the console
        String policeOfficeSceneCheck = policeOfficeSceneInfo.toString();
        System.out.println(policeOfficeSceneInfo);
        
        // this is the Evidence instance
        EvidenceScene evidenceSceneInfo = new EvidenceScene();
        
        evidenceSceneInfo.setSceneName("To Be Set");
        evidenceSceneInfo.setDescription("To Be Set");
        evidenceSceneInfo.setObjects("To Be Set");
        
        // call the toString function to display the contents in the console
        String evidenceSceneCheck = evidenceSceneInfo.toString();
        System.out.println(evidenceSceneInfo);
        
        // this is the Actor instance
        Actor actorInfo = new Actor();
        
        actorInfo.setName("Albert Hancock");
        actorInfo.setDescription("To Be Set");
        actorInfo.setCoordinates(0);
        
        // call the toString function to display the contents in the console
        String actorCheck = actorInfo.toString();
        System.out.println(actorInfo);
        
        // this is the Location instance
        Location locationInfo = new Location();
        
        locationInfo.setRow(0);
        locationInfo.setColumn(0);
        locationInfo.setVisited("To Be Set");
        
        // call the toString function to display the contents in the console
        String locationCheck = locationInfo.toString();
        System.out.println(locationInfo);
        
        // this is the PiecesOfEvidence instance
        PiecesOfEvidence evidenceInfo = new PiecesOfEvidence();
        
        evidenceInfo.setEvidenceName("To Be Set");
        evidenceInfo.setEvidenceOrigin("To Be Set");
        evidenceInfo.setEvidenceType("To Be Set");
        
        String evidenceCheck = evidenceInfo.toString();
        System.out.println(evidenceInfo);
        
        // this is the Player instance
        Player playerOne = new Player();
        
        playerOne.setName("");
        playerOne.setRankTitle("Probational Detective");
        playerOne.setProgress(0.0);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
    }
    
}
