/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregonTrail.model;


/**
 *
 * @author SysAdmin
 */
public enum Weather {
    
    Snowy("Snowy"),
    Cold("Cold"),
    Cool("Cool"),
    Rainy("Rainy"),
    VeryRainy("VeryRainy"),
    Warm("Warm"),
    Hot("Hot");
    
    private String name;

    private Weather(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Weather{" + "name=" + name + '}';
    }
    
    
    
}
