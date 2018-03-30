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
    
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;

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

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        OregonTrailGame.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        OregonTrailGame.inFile = inFile;
    }
    
    public static void main(String[] args) {
       try{
           
       OregonTrailGame.inFile =
               new BufferedReader(new InputStreamReader(System.in));
       
       OregonTrailGame.outFile = new PrintWriter(System.out, true);
           
       StartProgramView startProgramView = new StartProgramView();
       startProgramView.display();
       }
       catch (Throwable e){
           System.out.println("Oops, something went wrong, if persistent contact the developer: " + e.getMessage());
           e.printStackTrace();
           return;
       }
       
       finally {
           OregonTrailGame.inFile.close();
           OregonTrailGame.outFile.close();
       } catch (IOException ex) {
               Logger.getLogger(OregonTrailGame.class.getName()).log(Level.S.....);
               }
    }
    
}
