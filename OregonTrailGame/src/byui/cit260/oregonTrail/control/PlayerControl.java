/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregonTrail.control;

import byui.cit260.oregonTrail.model.Player;
import oregontrailgame.OregonTrailGame;

/**
 *
 * @author SysAdmin
 */
public class PlayerControl {

    public static void playerOccupation(int occupation) {
        System.out.println("Eureka! Good job Edward!");
    }

    public static int addPartyMember(String value) {
        
        //number of party members that are set
        int setMembers = 0;
        
        //Get the current player
        Player player = OregonTrailGame.getPlayer();
        
        //Get the party members that are currently there
        String[] partyMemberNames = player.getPartyMemberNames();
        
        //Set next party member name
        for (String i : partyMemberNames){
            if(i != null)
                setMembers += 1;
        }
        
        //Set party member name
        if(setMembers < 5){
            partyMemberNames[setMembers] = value;
            setMembers += 1;
        }
        
        //save change
        player.setPartyMemberNames(partyMemberNames);
        
        //return length of party so view layer can loop
        return setMembers;
    }
    
}
