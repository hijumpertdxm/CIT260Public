/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregonTrail.view;

import byui.cit260.oregonTrail.control.GameControl;
import byui.cit260.oregonTrail.control.MapControl;
import byui.cit260.oregonTrail.control.PlayerControl;
import byui.cit260.oregonTrail.exceptions.GameControlException;
import byui.cit260.oregonTrail.exceptions.MapControlException;
import byui.cit260.oregonTrail.exceptions.PlayerControlException;
import byui.cit260.oregonTrail.model.Game;
import byui.cit260.oregonTrail.model.Location;
import byui.cit260.oregonTrail.model.Player;
import java.io.IOException;
import oregontrailgame.OregonTrailGame;


/**
 *
 * @author Roller
 */
public class PrintPlayerView extends View{
    
    public PrintPlayerView(){
            
        super (
        "====================================================="
        +"\nPrinting the Player"
        +"\n====================================================="
        + "\n To print the player information please input a path."
        +"\n====================================================="
        );
    }
  @Override
    
    public boolean doAction(String value){
        
        String filePath = value;
        Player player = OregonTrailGame.getCurrentGame().getPlayer();
        try{
            PlayerControl.printPlayer(player, filePath);
            this.console.println("The map was saved successfully!");
        } catch (PlayerControlException | IOException e){
            ErrorView.display(this.getClass().getName(), "Error: " + e.getMessage());
            return false;
        }
        
        return true;
    }
      
}
