/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregonTrail.view;

import byui.cit260.oregonTrail.control.GameControl;
import byui.cit260.oregonTrail.exceptions.GameControlException;
import byui.cit260.oregonTrail.model.Game;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import oregontrailgame.OregonTrailGame;

/**
 *
 * @author ayami
 */
public class SaveGameView extends View {
    
    protected final BufferedReader keyboard = OregonTrailGame.getInFile();
    protected final PrintWriter console = OregonTrailGame.getOutFile();

    public SaveGameView (){
    
       super (
        "==========The Oregon Trail=========="
        +"\n To save the game please input a file name path."
        +"\n-----What is your choice?"
        +"\n===================================="
            
       );

    }
    
    @Override
    public boolean doAction(String value){
        
        String filePath = value;
        Game game = OregonTrailGame.getCurrentGame();
        try{
            GameControl.saveGame(game, filePath);
        } catch (GameControlException | IOException e){
            ErrorView.display(this.getClass().getName(), "Error: " + e.getMessage());
            return false;
        }
        
        return true;
    }
    
}
