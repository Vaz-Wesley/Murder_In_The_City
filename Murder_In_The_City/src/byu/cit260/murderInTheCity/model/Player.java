/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.murderInTheCity.model;

import java.io.Serializable;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author Wady Tupiza and Wesley Vaz
 */
public class Player implements Serializable {
    
    private String playerName;
    private String playerRankTitle;
    private double playerProgress;

    public Player() {
    	
    	
    }

    @SuppressWarnings("resource")
	public String getPlayerName() {
    	
    	   	
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerRankTitle() {
        return playerRankTitle;
    }

    public void setPlayerRankTitle(String playerRankTitle) {
        this.playerRankTitle = playerRankTitle;
    }

    public double getPlayerProgress() {
        return playerProgress;
    }

    public void setPlayerProgress(double playerProgress) {
        this.playerProgress = playerProgress;
    }
      
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.playerName);
        hash = 17 * hash + Objects.hashCode(this.playerRankTitle);
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.playerProgress) ^ (Double.doubleToLongBits(this.playerProgress) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Player{" + "playerName=" + playerName + ", playerRankTitle=" + playerRankTitle + ", playerProgress=" + playerProgress + '}';
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
        final Player other = (Player) obj;
        if (Double.doubleToLongBits(this.playerProgress) != Double.doubleToLongBits(other.playerProgress)) {
            return false;
        }
        if (!Objects.equals(this.playerName, other.playerName)) {
            return false;
        }
        if (!Objects.equals(this.playerRankTitle, other.playerRankTitle)) {
            return false;
    }
        return true;
    }    
    
}
