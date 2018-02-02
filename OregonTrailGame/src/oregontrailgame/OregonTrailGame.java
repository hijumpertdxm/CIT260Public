/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrailgame;

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
        Player playerOne = new Player();
        
        playerOne.setName("Pioneer Pete");
        playerOne.setHighScore(0);
        playerOne.setOccupation(1);
        
        System.out.println(PartyHealth.Good.getPartyHealth());
              
        System.out.println(playerOne.toString());
    }
    
}
