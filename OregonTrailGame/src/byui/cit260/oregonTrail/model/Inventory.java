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
public class Inventory implements Serializable{
        //class instance variables
        public String name;
        public double quantity;
        public double basePrice;

    public Inventory() {
    }
        
        

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.name);
        hash = 43 * hash + (int) (Double.doubleToLongBits(this.quantity) ^ (Double.doubleToLongBits(this.quantity) >>> 32));
        hash = 43 * hash + (int) (Double.doubleToLongBits(this.basePrice) ^ (Double.doubleToLongBits(this.basePrice) >>> 32));
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
        final Inventory other = (Inventory) obj;
        if (Double.doubleToLongBits(this.quantity) != Double.doubleToLongBits(other.quantity)) {
            return false;
        }
        if (Double.doubleToLongBits(this.basePrice) != Double.doubleToLongBits(other.basePrice)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Inventory{" + "name=" + name + ", quantity=" + quantity + ", basePrice=" + basePrice + '}';
    }
    

}
