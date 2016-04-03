/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.murderInTheCity.control;

import byu.cit260.murderInTheCity.exceptions.CasesControlException;
import byu.cit260.murderInTheCity.exceptions.MapControlException;
import byu.cit260.murderInTheCity.model.Map;
import byu.cit260.murderInTheCity.view.MapView;
import byu.cit260.murderInTheCity.view.PoliceOfficeView;
import byu.cit260.murderInTheCity.view.View;
import java.io.PrintWriter;
import java.util.ArrayList;
import murderinthecity.MurderInTheCity;

/**
 *
 * @author Wesley Vaz_2
 */
public class MapControl {
    
    protected static final PrintWriter console = MurderInTheCity.getOutFile();
    
    public static String findLocation(String input) throws MapControlException{
        
        //MapView input = new MapView();
        //input.getInput();
        
        Map[] locations = locationsList();
        
        String values ="";
        //String map = "";
        
        for (int i = 0; i < locations.length; i++){
            String locationName = locations[i].getLocationName();
            
            if(locationName.equals(input))
              values = ("\n" + locations[i].getLocationChar() + 
                                         " - " + locations[i].getLocationName());
        }
        
        if (values == ""){
            throw new MapControlException("Case Does Not Exist");
        }
        
        return values;
    }
       
     public enum Locations{
        cassino,
        stadium,
        park;
    }
    
    public static Map[] locationsList(){
        
        //created array of locations
        Map[] locationName = new Map[3];
        
        Map cassinoLocation = new Map();
        cassinoLocation.setLocationChar("B");
        cassinoLocation.setLocationName("Billionaire Cassino");
        locationName[Locations.cassino.ordinal()] = cassinoLocation;
        
        Map StadiumLocation = new Map();
        StadiumLocation.setLocationChar("S");
        StadiumLocation.setLocationName("Black Rock Stadium");
        locationName[Locations.stadium.ordinal()] = StadiumLocation;
        
        Map parkLocation = new Map();
        parkLocation.setLocationChar("K");
        parkLocation.setLocationName("Kid Mania Park");
        locationName[Locations.park.ordinal()] = parkLocation;
        
        return locationName;
    }
}
