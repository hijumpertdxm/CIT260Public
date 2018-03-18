/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregonTrail.control;

import byui.cit260.oregonTrail.model.PaceType;
import byui.cit260.oregonTrail.model.PartyHealth;
import byui.cit260.oregonTrail.model.Status;
import oregontrailgame.OregonTrailGame;

/**
 *
 * @author Roller
 */
public class StatusControl {
    
    public static int changePace(PaceType pace){
        
        if(pace == null){
            return -1; //fails
        }
        
        Status status = OregonTrailGame.getCurrentGame().getStatus();
        status.setPace(pace);
        
        return 1; // indicates success 
    }
}
