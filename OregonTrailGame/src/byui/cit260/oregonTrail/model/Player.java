/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregonTrail.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author SysAdmin
 */
public class Player implements Serializable{
    //class instance variables
    public String name;
    public double highScore;
    public int occupation;
    private ArrayList<Game> games = new ArrayList<Game>();

    public Player() {
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHighScore() {
        return highScore;
    }

    public void setHighScore(double highScore) {
        this.highScore = highScore;
    }

    public int getOccupation() {
        return occupation;
    }

    public void setOccupation(int occupation) {
        this.occupation = occupation;
    }
    
    public ArrayList<Game> getGames() {
        return games;
    }

    public void setGames(ArrayList<Game> games) {
        this.games = games;
    }
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.name);
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.highScore) ^ (Double.doubleToLongBits(this.highScore) >>> 32));
        hash = 79 * hash + this.occupation;
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
        final Player other = (Player) obj;
        if (Double.doubleToLongBits(this.highScore) != Double.doubleToLongBits(other.highScore)) {
            return false;
        }
        if (this.occupation != other.occupation) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", highScore=" + highScore + ", occupation=" + occupation + '}';
    }
    
    
}
