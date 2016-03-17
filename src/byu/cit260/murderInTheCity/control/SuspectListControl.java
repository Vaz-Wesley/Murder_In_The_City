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
    
    public SuspectListControl(SuspectList[] value ){
        
        for (int i = 0; i < list.length-1; ++i){
            if ( list[i] == value){
                return i;
            }
            
            return -1;
        }
    }
    
     public enum Suspects{
        daniel,
        ralph,
        chris,
        giulliani;
    }
    
    public static SuspectList[] createSuspectList(){
        
        //created array of personages 
        SuspectList[] suspectList = new SuspectList[20];
        
        SuspectList daniel = new SuspectList();
        daniel.setSuspectName("Suspect");
        daniel.setCaseInvolved("Daniel");
        suspectList[Suspects.daniel.ordinal()] = daniel;
        
        SuspectList ralph = new SuspectList();
        ralph.setSuspectName("Suspect");
        ralph.setCaseInvolved("Ralph");
        suspectList[Suspects.ralph.ordinal()] = ralph;
        
        SuspectList chris = new SuspectList();
        chris.setSuspectName("Suspect");
        chris.setCaseInvolved("Chris");
        suspectList[Suspects.chris.ordinal()] = ralph;
        
        SuspectList giulliani = new SuspectList();
        giulliani.setSuspectName("Suspect");
        giulliani.setCaseInvolved("Giulliani");
        suspectList[Suspects.giulliani.ordinal()] = ralph;
        
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
