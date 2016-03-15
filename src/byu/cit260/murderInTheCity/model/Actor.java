/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.murderInTheCity.model;

import java.awt.Point;
import java.io.Serializable;

/**
 *
 * @author Wesley Vaz_2
 */
public enum Actor implements Serializable {
    
    Albert("The Detective.");
    
    // class instance variables
    private final String description;
    private final Point coordinates;
    
    // default constructor function
    Actor(String description) {
        this.description = description;
        coordinates = new Point(1,1);
    }

    // public getter and setter functions   
    public String getDescription() {
        return description;
    }

    public Point getCoordinates() {
        return coordinates;
    }   
    // toString function
    //@Override
    //public String toString() {
        //return "Actor{" + "name=" + name + ", description=" + description + ", coordinates=" + coordinates + '}';
    //}  
}
