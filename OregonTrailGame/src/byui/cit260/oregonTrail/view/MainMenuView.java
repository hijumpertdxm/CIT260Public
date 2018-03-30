/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregonTrail.view;

import byui.cit260.oregonTrail.control.GameControl;
import byui.cit260.oregonTrail.exceptions.MapControlException;
import java.util.Scanner;
import oregontrailgame.OregonTrailGame;

/**
 *
 * @author SysAdmin
 */
public class MainMenuView extends View {
    
        public MainMenuView() {
            
            super("\n"
                + "\n====================================================="
                + "\n| Main Menu"
                + "\n====================================================="
                + "\nN - Start new game"
                + "\nR - Restart existing game"
                + "\nH - Get help on how to play the game"
                + "\nE - Exit"
                + "\n=====================================================");
        }
   
    @Override
    public boolean doAction(String value){
        //Set as first element and uppercase it
        value = value.toUpperCase();
        
        switch(value){
            case "N":
                this.startNewGame();
                break;
                
            case "R":
                this.restartGame();
                break;
                
            case "H":
                this.getHelp();
                break;
                
            case "E":
                return true;
                
            default:
              ErrorView.display(this.getClass().getName(), "Invalid menu item");
        }
        
        return false;
    }

    private void startNewGame(){
        //create new game
        try{
            GameControl.createNewGame(OregonTrailGame.getPlayer());
        }
        catch(MapControlException e){
            System.out.println(e.getMessage());
            return; //take this return out and it propagates up to the main function and returns null
        }
        catch (Throwable e){
            System.out.println(e.getMessage());
            e.printStackTrace();
            return;
        }
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.display();
    }

    private void restartGame() {
        StartExistingGameView startExistingGameView = new StartExistingGameView();
        startExistingGameView.display();
    }

    private void getHelp() {
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.display();
    }
    
}
