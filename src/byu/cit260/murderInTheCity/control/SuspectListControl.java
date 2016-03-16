/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.murderInTheCity.control;

import java.util.ArrayList;

/**
 *
 * @author Wesley Vaz_2
 */
public class SuspectListControl {
    
    public ArrayList<SuspectList> addSuspect(){
        
        ArrayList<SuspectList> suspectList = new ArrayList<>();
        
        //suspectList.add(SuspectList.daniel.ordinal(), new SuspectList("Daniel"));
        
        return suspectList;
    }
     
    
    public enum SuspectList{
        daniel,
        chris,
        ralph;
    }
    
   
    
    
}
