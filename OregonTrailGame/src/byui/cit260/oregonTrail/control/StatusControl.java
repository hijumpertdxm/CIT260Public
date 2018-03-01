/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregonTrail.control;

import byui.cit260.oregonTrail.model.PartyHealth;
import byui.cit260.oregonTrail.model.Status;

/**
 *
 * @author Roller
 */
public class StatusControl {
    
    public static Status statusInitialization(){
        
        Status status = new Status();
        
        // TODO : Make sure the other status' like weather and money are being set at the beginning from the occupation and month leave views
        status.setPace("steady");
        status.setPartyhealth(PartyHealth.Good);
        status.setRation("filling");
        
        return status;
    }
    
}
