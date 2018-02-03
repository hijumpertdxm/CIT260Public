/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrailgame;

import byui.cit260.oregonTrail.model.Inventory;
import byui.cit260.oregonTrail.model.Location;
import byui.cit260.oregonTrail.model.PartyHealth;
import byui.cit260.oregonTrail.model.Player;

/**
 *
 * @author Roller
 */
public class OregonTrailGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Testing Player
        Player playerOne = new Player();
        
        playerOne.setName("Pioneer Pete");
        playerOne.setHighScore(0);
        playerOne.setOccupation(1);
        
        System.out.println(playerOne.toString());
        
        //Testing PartyHealth
        System.out.println(PartyHealth.Good.getPartyHealth());
        
        //Testing Inventory
        Inventory inventoryOne = new Inventory();
        
        inventoryOne.setName("Food");
        inventoryOne.setQuantity(700);
        inventoryOne.setBasePrice(2);
        
        System.out.println(inventoryOne.toString());
        
        
        //Testing Location
        Location locationOne = new Location();
        
        locationOne.setDateVisted(0);
        locationOne.setInventory(inventoryOne);
        locationOne.setMileMarker(20.5);
        locationOne.setName("Fort Smith");
        locationOne.setType("Outpost");
        
        System.out.println(locationOne.toString());
        

    }
    
}
