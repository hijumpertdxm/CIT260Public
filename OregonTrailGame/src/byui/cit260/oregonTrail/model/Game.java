/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregonTrail.model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author SysAdmin
 */
public class Game implements Serializable{
    //class instance variables
    private double mileMarker;
    private int daysTraveled;
    private Status status;
    private Inventory[] inventory;
    private Player player;
    private int[] rainyDays;
    private Location[] locations;

    public Game() {
    }

    public double getMileMarker() {
        return mileMarker;
    }

    public void setMileMarker(double mileMarker) {
        this.mileMarker = mileMarker;
    }

    public int getDaysTraveled() {
        return daysTraveled;
    }

    public void setDaysTraveled(int daysTraveled) {
        this.daysTraveled = daysTraveled;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Inventory[] getInventory() {
        return inventory;
    }

    public void setInventory(Inventory[] inventory) {
        this.inventory = inventory;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public int[] getRainyDays() {
        return rainyDays;
    }

    public void setRainyDays(int[] rainyDays) {
        this.rainyDays = rainyDays;
    }

    public Location[] getLocations() {
        return locations;
    }

    public void setLocations(Location[] locations) {
        this.locations = locations;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.mileMarker) ^ (Double.doubleToLongBits(this.mileMarker) >>> 32));
        hash = 23 * hash + this.daysTraveled;
        hash = 23 * hash + Objects.hashCode(this.status);
        hash = 23 * hash + Arrays.deepHashCode(this.inventory);
        hash = 23 * hash + Objects.hashCode(this.player);
        hash = 23 * hash + Arrays.hashCode(this.rainyDays);
        hash = 23 * hash + Arrays.deepHashCode(this.locations);
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
        if (Double.doubleToLongBits(this.mileMarker) != Double.doubleToLongBits(other.mileMarker)) {
            return false;
        }
        if (this.daysTraveled != other.daysTraveled) {
            return false;
        }
        if (!Objects.equals(this.status, other.status)) {
            return false;
        }
        if (!Arrays.deepEquals(this.inventory, other.inventory)) {
            return false;
        }
        if (!Objects.equals(this.player, other.player)) {
            return false;
        }
        if (!Arrays.equals(this.rainyDays, other.rainyDays)) {
            return false;
        }
        if (!Arrays.deepEquals(this.locations, other.locations)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "mileMarker=" + mileMarker + ", daysTraveled=" + daysTraveled + ", status=" + status + ", inventory=" + inventory + ", player=" + player + ", rainyDays=" + rainyDays + ", locations=" + locations + '}';
    }
        
}
