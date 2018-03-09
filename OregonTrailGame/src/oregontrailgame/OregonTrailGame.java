/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrailgame;

import byui.cit260.oregonTrail.model.Game;
import byui.cit260.oregonTrail.model.Player;
import byui.cit260.oregonTrail.view.StartProgramView;

/**
 *
 * @author Roller
 */
public class OregonTrailGame {

    private static Game currentGame = null;
    private static Player player = null;

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        OregonTrailGame.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        OregonTrailGame.player = player;
    }
    
    public static void main(String[] args) {
        
       StartProgramView startProgramView = new StartProgramView();
       startProgramView.display();
    }
    
}
