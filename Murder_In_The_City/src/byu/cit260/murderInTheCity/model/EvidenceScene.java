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
public class EvidenceScene implements Serializable{
    
    // class instance variables
    private String description;
    private String sceneName;
    private String objects;
    
    // default constructor function
    public EvidenceScene() {
    }
    
    // public getter and setter functions
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSceneName() {
        return sceneName;
    }

    public void setSceneName(String sceneName) {
        this.sceneName = sceneName;
    }

    public String getObjects() {
        return objects;
    }

    public void setObjects(String objects) {
        this.objects = objects;
    }

    // hashCode function
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.description);
        hash = 67 * hash + Objects.hashCode(this.sceneName);
        hash = 67 * hash + Objects.hashCode(this.objects);
        return hash;
    }

    // toString function
    @Override
    public String toString() {
        return "EvidenceScene{" + "description=" + description + ", sceneName=" + sceneName + ", objects=" + objects + '}';
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
        final EvidenceScene other = (EvidenceScene) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.sceneName, other.sceneName)) {
            return false;
        }
        if (!Objects.equals(this.objects, other.objects)) {
            return false;
        }
        return true;
    }
    
    
}
