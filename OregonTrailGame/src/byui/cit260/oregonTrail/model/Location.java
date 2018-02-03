/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregonTrail.model;

import java.io.Serializable;
import java.util.Objects;


/**
 *
 * @author SysAdmin, Mason Roller
 */
public class Location implements Serializable{
        //class instance variables
        public String name;
        public String type;
        public double mileMarker;
        public int dateVisted;
        private Inventory inventory;

    public Location() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getMileMarker() {
        return mileMarker;
    }

    public void setMileMarker(double mileMarker) {
        this.mileMarker = mileMarker;
    }

    public int getDateVisted() {
        return dateVisted;
    }

    public void setDateVisted(int dateVisted) {
        this.dateVisted = dateVisted;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.name);
        hash = 43 * hash + Objects.hashCode(this.type);
        hash = 43 * hash + (int) (Double.doubleToLongBits(this.mileMarker) ^ (Double.doubleToLongBits(this.mileMarker) >>> 32));
        hash = 43 * hash + this.dateVisted;
        hash = 43 * hash + Objects.hashCode(this.inventory);
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
        final Location other = (Location) obj;
        if (Double.doubleToLongBits(this.mileMarker) != Double.doubleToLongBits(other.mileMarker)) {
            return false;
        }
        if (this.dateVisted != other.dateVisted) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        if (!Objects.equals(this.inventory, other.inventory)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Location{" + "name=" + name + ", type=" + type + ", mileMarker=" + mileMarker + ", dateVisted=" + dateVisted + ", inventory=" + inventory + '}';
    }
        
}
