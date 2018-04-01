/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregonTrail.view;

import byui.cit260.oregonTrail.control.GameControl;
import byui.cit260.oregonTrail.control.MapControl;
import byui.cit260.oregonTrail.exceptions.GameControlException;
import byui.cit260.oregonTrail.exceptions.MapControlException;
import byui.cit260.oregonTrail.model.Game;
import byui.cit260.oregonTrail.model.Location;
import java.io.IOException;
import oregontrailgame.OregonTrailGame;


/**
 *
 * @author Roller
 */
public class PrintGameView extends View{
    
    public PrintGameView(){
            
        super (
        "====================================================="
        +"\nPrinting the map"
        +"\n====================================================="
        + "\n To print the gmae menu out please input a file name path."
        +"\n====================================================="
        );
    }
  @Override
    
    public boolean doAction(String value){
        
        String filePath = value;
        Game game = OregonTrailGame.getCurrentGame();
        try{
            GameControl.printGame(game, filePath);
            this.console.println("The map was saved successfully!");
        } catch (GameControlException | IOException e){
            ErrorView.display(this.getClass().getName(), "Error: " + e.getMessage());
            return false;
        }
        
        return true;
    }
      
}
