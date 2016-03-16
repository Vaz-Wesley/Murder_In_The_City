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
public class Game implements Serializable{
    
    private String timePlayed;
    private String noPeople;
    
    private Map map;
    private Player player;
    private Personage[] personage;
    private CaseSolved[] caseSolved;
    private PiecesOfEvidence[] piecesOfEvidence;
    private SuspectList[] suspectList;

    public Game() {
    }

    public String getTimePlayed() {
        return timePlayed;
    }

    public void setTimePlayed(String timePlayed) {
        this.timePlayed = timePlayed;
    }

    public String getNoPeople() {
        return noPeople;
    }

    public void setNoPeople(String noPeople) {
        this.noPeople = noPeople;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Personage[] getPersonage() {
        return personage;
    }

    public void setPersonage(Personage[] personage) {
        this.personage = personage;
    }

    public CaseSolved[] getCaseSolved() {
        return caseSolved;
    }

    public void setCaseSolved(CaseSolved[] caseSolved) {
        this.caseSolved = caseSolved;
    }

    public PiecesOfEvidence[] getPiecesOfEvidence() {
        return piecesOfEvidence;
    }

    public void setPiecesOfEvidence(PiecesOfEvidence[] piecesOfEvidence) {
        this.piecesOfEvidence = piecesOfEvidence;
    }

    public SuspectList[] getSuspectList() {
        return suspectList;
    }

    public void setSuspectList(SuspectList[] suspectList) {
        this.suspectList = suspectList;
    }
    
    
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.timePlayed);
        hash = 53 * hash + Objects.hashCode(this.noPeople);
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
        final Game other = (Game) obj;
        if (!Objects.equals(this.timePlayed, other.timePlayed)) {
            return false;
        }
        if (!Objects.equals(this.noPeople, other.noPeople)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "timePlayed=" + timePlayed + ", noPeople=" + noPeople + '}';
    }
}
