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
public class PiecesOfEvidence implements Serializable{
        
    // class instance variables
    private String evidenceName;
    private String evidenceType;
    private String evidenceOrigin;
    
    // default constructor function
    public PiecesOfEvidence() {
    }
    
    // public getter and setter functions
    public String getEvidenceName() {
        return evidenceName;
    }

    public void setEvidenceName(String evidenceName) {
        this.evidenceName = evidenceName;
    }

    public String getEvidenceType() {
        return evidenceType;
    }

    public void setEvidenceType(String evidenceType) {
        this.evidenceType = evidenceType;
    }

    public String getEvidenceOrigin() {
        return evidenceOrigin;
    }

    public void setEvidenceOrigin(String evidenceOrigin) {
        this.evidenceOrigin = evidenceOrigin;
    }

    // hashCode function
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.evidenceName);
        hash = 67 * hash + Objects.hashCode(this.evidenceType);
        hash = 67 * hash + Objects.hashCode(this.evidenceOrigin);
        return hash;
    }

    // toString function
    @Override
    public String toString() {
        return "PiecesOfEvidence{" + "evidenceName=" + evidenceName + ", evidenceType=" + evidenceType + ", evidenceOrigin=" + evidenceOrigin + '}';
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
        final PiecesOfEvidence other = (PiecesOfEvidence) obj;
        if (!Objects.equals(this.evidenceName, other.evidenceName)) {
            return false;
        }
        if (!Objects.equals(this.evidenceType, other.evidenceType)) {
            return false;
        }
        if (!Objects.equals(this.evidenceOrigin, other.evidenceOrigin)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
