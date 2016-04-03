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
    private String interrogation;

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

    public String getInterrogation() {
        return interrogation;
    }

    public void setInterrogation(String interrogation) {
        this.interrogation = interrogation;
    }
}
