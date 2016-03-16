/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.murderInTheCity.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author W
 */
public class Game implements Serializable{
    
    private String timePlayed;
    private String noPeople;
    
    private Player player;
    private SuspectList[] suspectList;
    private Cases[] cases;
    private PiecesOfEvidence[] piecesOfEvidence;
    //private ArrayList<SuspectList> suspectList;
    private ArrayList<Map> map;

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

    public ArrayList<Map> getMap() {
        return map;
    }

    public void setMap(ArrayList<Map> location) {
        this.map = location;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Cases[] getCaseSolved() {
        return cases;
    }

    public void setCases(Cases[] caseSolved) {
        this.cases = cases;
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
