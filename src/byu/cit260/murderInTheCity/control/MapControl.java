/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.murderInTheCity.control;

import byu.cit260.murderInTheCity.model.Map;
import java.util.ArrayList;

/**
 *
 * @author Wesley Vaz_2
 */
public class MapControl {
    
    public static String map;
    
    public static String cityView(){
       
                map = ("\n"
                    + "\n -------------------------------------"
                    + "\n  City Locations                      "
                    + "\n -------------------------------------"
                    + "\n Police Office                        "
                    + "\n Laboratory                           "
                    + "\n Billionaire Cassino                  "
                    + "\n Black Rock Stadium                   "
                    + "\n Kid Mania Park                       "
                    + "\n -------------------------------------");
        
        return map;
    }
       
   /* public enum Locations{
        cassino,
        stadium,
        park;
    }
    
    public static ArrayList<Map> addLocation(){
        
        ArrayList<Map> locationName = new ArrayList<>();
        
        locationName.add(Locations.cassino.ordinal(), new Map("Cassino"));
        locationName.add(Locations.stadium.ordinal(), new Map("Stadium"));
        locationName.add(Locations.park.ordinal(), new Map("Kid Mania Park"));
        
        return locationName;
    }
    
    public void removeLocation(ArrayList<Map> location, Map place) {
    
            location.remove(place); //remove by an object reference
     }*/
}
