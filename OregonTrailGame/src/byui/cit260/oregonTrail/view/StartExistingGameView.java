/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregonTrail.view;

import byui.cit260.oregonTrail.control.GameControl;
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
         + "\nN - Start new game"
         + "\nR - Restart existing game"
         + "\nE - Exit"
         + "\n====================================================="
        );
    }

    @Override
    public boolean doAction(String value) {
         
        value = value.toUpperCase(); 
         
        switch(value){
             case "N":
                this.startNewGame();
                break;
                
            case "R":
                this.restartGame();
                break;
                   
             case "E":
                return true;
                
            default:
              System.out.println("Invalid menu item");
         }
         return false;
    }

    private void startNewGame() {
        //create new game
        //GameControl.createNewGame(OregonTrailGame.getPlayer());
        //GameControl.gameInitialization();
    }
     private void restartGame() {
        StartExistingGameView startExistingGameView = new StartExistingGameView();
        startExistingGameView.display();
    }
    
}
