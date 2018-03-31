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
import byui.cit260.oregonTrail.exceptions.StatusControlException;

/**
 *
 * @author Roller
 */
public class StatusControl{
    
    public static void changePace(PaceType pace) throws StatusControlException {
        
        if(pace == null){
            throw new StatusControlException("Pace has not been specified.");
        }
        
        Status status = OregonTrailGame.getCurrentGame().getStatus();
        status.setPace(pace);
    }
}
