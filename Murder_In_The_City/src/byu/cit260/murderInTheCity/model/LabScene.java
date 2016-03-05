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
public class LabScene implements Serializable{
    
    // class instance variables
    private String description;
    private String fingerPrintTest;
    private String dnaTest;
   
    // default constructor function
    public LabScene() {
    }
    
    // public getter and setter functions
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFingerPrintTest() {
        return fingerPrintTest;
    }

    public void setFingerPrintTest(String fingerPrintTest) {
        this.fingerPrintTest = fingerPrintTest;
    }

    public String getDnaTest() {
        return dnaTest;
    }

    public void setDnaTest(String dnaTest) {
        this.dnaTest = dnaTest;
    }
    
    // hashCode function
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 31 * hash + Objects.hashCode(this.description);
        hash = 31 * hash + Objects.hashCode(this.fingerPrintTest);
        hash = 31 * hash + Objects.hashCode(this.dnaTest);
        return hash;
    }

    // toString function
    @Override
    public String toString() {
        return "LabScene{" + "description=" + description + ", fingerPrintTest=" + fingerPrintTest + ", dnaTest=" + dnaTest + '}';
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
        final LabScene other = (LabScene) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.fingerPrintTest, other.fingerPrintTest)) {
            return false;
        }
        if (!Objects.equals(this.dnaTest, other.dnaTest)) {
            return false;
        }
        return true;
    }
    
    
}
