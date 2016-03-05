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
public class Personage implements Serializable{
    
    private String personageType;
    private String personageName;
    private String description;
    private int coordinates;

    public Personage() {
    }

    public String getPersonageType() {
        return personageType;
    }

    public void setPersonageType(String personageType) {
        this.personageType = personageType;
    }

    public String getPersonageName() {
        return personageName;
    }

    public void setPersonageName(String personageName) {
        this.personageName = personageName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(int coordinates) {
        this.coordinates = coordinates;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.personageType);
        hash = 29 * hash + Objects.hashCode(this.personageName);
        hash = 29 * hash + Objects.hashCode(this.description);
        hash = 29 * hash + this.coordinates;
        return hash;
    }

    @Override
    public String toString() {
        return "Personage{" + "personageType=" + personageType + ", personageName=" + personageName + ", description=" + description + ", coordinates=" + coordinates + '}';
    }
    
    
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
        final Personage other = (Personage) obj;
        if (this.coordinates != other.coordinates) {
            return false;
        }
        if (!Objects.equals(this.personageType, other.personageType)) {
            return false;
        }
        if (!Objects.equals(this.personageName, other.personageName)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }

    

    
    
}
