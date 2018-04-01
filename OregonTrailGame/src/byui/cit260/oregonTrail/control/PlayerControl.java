/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregonTrail.control;

import byui.cit260.oregonTrail.exceptions.MapControlException;
import byui.cit260.oregonTrail.exceptions.PlayerControlException;
import byui.cit260.oregonTrail.model.Location;
import byui.cit260.oregonTrail.model.Player;
import oregontrailgame.OregonTrailGame;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author SysAdmin
 */
public class PlayerControl {

    public static void playerOccupation(int occupation) throws PlayerControlException{
        
        if(occupation < 1 || occupation > 3){
            throw new PlayerControlException("That occupation does not exist!");
        }
        Player player = OregonTrailGame.getPlayer();
        player.setOccupation(occupation);
        
    }

    public static int addPartyMember(String value) throws PlayerControlException {
        
        if(value == null || value.length() == 0){
            throw new PlayerControlException("You must enter a name.");
        }
        
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
    
        
    public static void printPlayer(Player player, String filePath) throws PlayerControlException,IOException {
     if(filePath == null || filePath.length() < 1){
            throw new PlayerControlException("You put in an invalid path, please try again.");
        }
        
        PrintWriter printWriter = new PrintWriter(filePath);
        printWriter.println("Player Information");
        printWriter.println("Player's Name\tPlayer's Score");
        for(String play : player.getPartyMemberNames()) {
           printWriter.println(play + "\t\t" + player.getHighScore());
       }
        printWriter.close (); 
    }
    
}
