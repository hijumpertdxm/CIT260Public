/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregonTrail.view;

import byui.cit260.oregonTrail.control.PlayerControl;
import byui.cit260.oregonTrail.exceptions.PlayerControlException;
import oregontrailgame.OregonTrailGame;

public class ChooseWagonPartyView extends View{

    
    public ChooseWagonPartyView () {
        super(
         "====================================================="
        +"\nEnter the names of those in your wagon party below"
        +"\n====================================================="
        +"\n1 - " + ((OregonTrailGame.getPlayer().getPartyMemberNames()[0] == null) ? "" : OregonTrailGame.getPlayer().getPartyMemberNames()[0])
        +"\n2 - " + ((OregonTrailGame.getPlayer().getPartyMemberNames()[1] == null) ? "" : OregonTrailGame.getPlayer().getPartyMemberNames()[1])
        +"\n3 - " + ((OregonTrailGame.getPlayer().getPartyMemberNames()[2] == null) ? "" : OregonTrailGame.getPlayer().getPartyMemberNames()[2])
        +"\n4 - " + ((OregonTrailGame.getPlayer().getPartyMemberNames()[3] == null) ? "" : OregonTrailGame.getPlayer().getPartyMemberNames()[3])
        +"\n5 - " + ((OregonTrailGame.getPlayer().getPartyMemberNames()[4] == null) ? "" : OregonTrailGame.getPlayer().getPartyMemberNames()[4])
        +"\n====================================================="
            );
 
    }
    @Override
    public boolean doAction(String value){
        
        this.setPartyMemberName(value);
        
        return true;
    }

    private void setPartyMemberName(String value) {
        try{
            PlayerControl.addPartyMember(value);
        }
        catch (PlayerControlException e){
            ErrorView.display(this.getClass().getName(), e.getMessage());
        }
    }

}