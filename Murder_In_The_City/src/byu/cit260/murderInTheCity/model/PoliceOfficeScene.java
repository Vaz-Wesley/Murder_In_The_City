/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.murderInTheCity.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Wesley Vaz_2
 */
public class PoliceOfficeScene implements Serializable{
    
    // class instance variables
    private String description;
    private String alibiValidation;
    
    // default constructor function
    public PoliceOfficeScene() {
    }
    
    // public getter and setter functions
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAlibiValidation() {
        return alibiValidation;
    }

    public void setAlibiValidation(String alibiValidation) {
        this.alibiValidation = alibiValidation;
    }

    // hashCode function
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.description);
        hash = 17 * hash + Objects.hashCode(this.alibiValidation);
        return hash;
    }

    // toString function
    @Override
    public String toString() {
        return "PoliceOfficeScene{" + "description=" + description + ", alibiValidation=" + alibiValidation + '}';
    }

    // equals function
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PoliceOfficeScene other = (PoliceOfficeScene) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.alibiValidation, other.alibiValidation)) {
            return false;
        }
        return true;
    }
    
    
    
    }
