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
 * @author Wesley_Vaz
 */
public class CaseSolved implements Serializable{
    private String caseName;

    public CaseSolved() {
    }

    public String getCaseName() {
        return caseName;
    }

    public void setCaseName(String caseName) {
        this.caseName = caseName;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.caseName);
        return hash;
    }

    @Override
    public String toString() {
        return "CasesSolved{" + "caseName=" + caseName +'}';
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
        final CaseSolved other = (CaseSolved) obj;
        if (!Objects.equals(this.caseName, other.caseName)) {
            return false;
        }
        return true;
    }
    
    
}
