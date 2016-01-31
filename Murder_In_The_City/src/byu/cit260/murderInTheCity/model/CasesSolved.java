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
public class CasesSolved implements Serializable{
    private String caseName;
    private String date;

    public CasesSolved() {
    }
    

    public String getCaseName() {
        return caseName;
    }

    public void setCaseName(String caseName) {
        this.caseName = caseName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.caseName);
        hash = 29 * hash + Objects.hashCode(this.date);
        return hash;
    }

    @Override
    public String toString() {
        return "CasesSolved{" + "caseName=" + caseName + ", date=" + date + '}';
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
        final CasesSolved other = (CasesSolved) obj;
        if (!Objects.equals(this.caseName, other.caseName)) {
            return false;
        }
        if (!Objects.equals(this.date, other.date)) {
            return false;
        }
        return true;
    }
    
    
}
