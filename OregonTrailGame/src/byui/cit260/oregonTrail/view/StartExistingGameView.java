/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregonTrail.view;

import byui.cit260.oregonTrail.control.GameControl;
import byui.cit260.oregonTrail.exceptions.GameControlException;
import byui.cit260.oregonTrail.exceptions.MapControlException;
import byui.cit260.oregonTrail.model.Game;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import oregontrailgame.OregonTrailGame;

/**
 *
 * @author Roller
 */
public class StartExistingGameView extends View {

    public  StartExistingGameView() {
        
        super(                
            "displayStartExistingGameView was called"
         + "\n====================================================="
         + "\nGive us the path of the game you want to restart."
         + "\n====================================================="
        );
    }

    @Override
    public boolean doAction(String value){
        
        String filePath = value;
        try{
            GameControl.getGame(filePath);
        } catch (GameControlException | IOException | ClassNotFoundException e){
            ErrorView.display(this.getClass().getName(), "Error: " + e.getMessage());
            return false;
        }
        
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.display();
        return true;
    }
    
}
