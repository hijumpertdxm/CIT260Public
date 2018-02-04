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
 * @author SysAdmin
 */
public class Animals implements Serializable{
    
    //class instance variables
    private String name;
    private double food;
    private double baseRate;
    private double baseChance;

    public Animals() {
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFood() {
        return food;
    }

    public void setFood(double food) {
        this.food = food;
    }

    public double getBaseRate() {
        return baseRate;
    }

    public void setBaseRate(double baseRate) {
        this.baseRate = baseRate;
    }

    public double getBaseChance() {
        return baseChance;
    }

    public void setBaseChance(double baseChance) {
        this.baseChance = baseChance;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.name);
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.food) ^ (Double.doubleToLongBits(this.food) >>> 32));
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.baseRate) ^ (Double.doubleToLongBits(this.baseRate) >>> 32));
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.baseChance) ^ (Double.doubleToLongBits(this.baseChance) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Animals{" + "name=" + name + ", food=" + food + ", baseRate=" + baseRate + ", baseChance=" + baseChance + '}';
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
        final Animals other = (Animals) obj;
        if (Double.doubleToLongBits(this.food) != Double.doubleToLongBits(other.food)) {
            return false;
        }
        if (Double.doubleToLongBits(this.baseRate) != Double.doubleToLongBits(other.baseRate)) {
            return false;
        }
        if (Double.doubleToLongBits(this.baseChance) != Double.doubleToLongBits(other.baseChance)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
    
    
}
