/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.murderInTheCity.model;

import java.io.Serializable;

/**
 *
 * @author W
 */
public class Map implements Serializable{
    
    private String locationName;
    private String locationChar;
    

    public Map() {
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }  

    public String getLocationChar() {
        return locationChar;
    }

    public void setLocationChar(String locationChar) {
        this.locationChar = locationChar;
    }
    
}