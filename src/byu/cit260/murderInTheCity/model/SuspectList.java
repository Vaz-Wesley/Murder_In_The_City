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
 * @author W
 */
public class SuspectList implements Serializable{
    
    private String suspectName;
    private String caseInvolved;

    public SuspectList() {
    }

    public String getSuspectName() {
        return suspectName;
    }

    public void setSuspectName(String suspectName) {
        this.suspectName = suspectName;
    }

    public String getCaseInvolved() {
        return caseInvolved;
    }

    public void setCaseInvolved(String caseInvolved) {
        this.caseInvolved = caseInvolved;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.suspectName);
        hash = 59 * hash + Objects.hashCode(this.caseInvolved);
        return hash;
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
        final SuspectList other = (SuspectList) obj;
        if (!Objects.equals(this.suspectName, other.suspectName)) {
            return false;
        }
        if (!Objects.equals(this.caseInvolved, other.caseInvolved)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "SuspectList{" + "suspectName=" + suspectName + ", caseInvolved=" + caseInvolved + '}';
    }
    
    
    
}
