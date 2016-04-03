/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.murderInTheCity.control;

import byu.cit260.murderInTheCity.model.SuspectList;
import java.util.ArrayList;

/**
 *
 * @author Wesley Vaz_2
 */
public class SuspectListControl {
    
    public static String checkList(String suspectName){
        
        SuspectList[] suspects = createSuspectList();
        
        String values ="";
        
        for (int i = 0; i < suspects.length; i++){
            
            if(suspectName.equals(suspects[i].getSuspectName()))
                values += "\nSuspect Name: " + suspects[i].getSuspectName() + "\n" +
                          "Case Involved: " + suspects[i].getCaseInvolved() + "\n" +
                          "Interrogation: " + suspects[i].getInterrogation() + "\n";
        }
        return values; 
    }
    
     public enum Suspects{
        daniel,
        ralph,
        chris,
        giulliani;
    }
    
    public static SuspectList[] createSuspectList(){
        
        //created array of personages 
        SuspectList[] suspectList = new SuspectList[4];
        
        SuspectList daniel = new SuspectList();
        daniel.setSuspectName("Daniel");
        daniel.setCaseInvolved("The Park");
        daniel.setInterrogation("Go to a location called Kid Mania Park. "
                              + "There you may find evidence which incriminates me");
        suspectList[Suspects.daniel.ordinal()] = daniel;
        
        SuspectList ralph = new SuspectList();
        ralph.setSuspectName("Ralph");
        ralph.setCaseInvolved("The Billionaire");
        ralph.setInterrogation("Go to a location called Billionaire Cassino. "
                              + "There you may find evidence which incriminates me");
        suspectList[Suspects.ralph.ordinal()] = ralph;
        
        SuspectList chris = new SuspectList();
        chris.setSuspectName("Chris");
        chris.setCaseInvolved("The Stadium");
        chris.setInterrogation("Go to a location called Black Rock Stadium. "
                              + "There you may find evidence which incriminates me");
        suspectList[Suspects.chris.ordinal()] = chris;
        
        SuspectList giulliani = new SuspectList();
        giulliani.setSuspectName("Giulliani");
        giulliani.setCaseInvolved("The Stadium");
        giulliani.setInterrogation("Go to a location called Black Rock Stadium. "
                              + "There you may find evidence which incriminates me");
        suspectList[Suspects.giulliani.ordinal()] = giulliani;
        
        return suspectList;
    }
    
    /*public enum Suspects{
        daniel,
        chris,
        ralph;
    }
    
    public static ArrayList<SuspectList> addSuspect(){
        
        ArrayList<SuspectList> suspectList = new ArrayList<>();
        
        suspectList.add(Suspects.daniel.ordinal(), new SuspectList("Daniel"));
        suspectList.add(Suspects.chris.ordinal(), new SuspectList("Chris"));
        suspectList.add(Suspects.ralph.ordinal(), new SuspectList("Ralph"));
        
        return suspectList;
    }
    
    public void removeSuspect(ArrayList<SuspectList> suspectList, SuspectList suspect) {
    
            suspectList.remove(suspect); //remove by an object reference
     }*/
}
