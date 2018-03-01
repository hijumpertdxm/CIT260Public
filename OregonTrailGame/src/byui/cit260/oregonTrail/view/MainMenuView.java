/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregonTrail.view;

import byui.cit260.oregonTrail.control.GameControl;
import java.util.Scanner;
import oregontrailgame.OregonTrailGame;

/**
 *
 * @author SysAdmin
 */
class MainMenuView {
    
    public void displayMainMenuView(){
        boolean endView = false;
        do{
            String[] inputs = this.getInputs();
            if((inputs.length < 1) || (inputs[0].toUpperCase().equals("Q"))){
                return;
            }
            endView = doAction(inputs);
        }while(endView != true);
    }
    
    private String[] getInputs(){
        
        String[] inputs = new String[1];
        
        System.out.println("=====================================================");
        System.out.println("Main Menu");
        System.out.println("=====================================================");
        System.out.println("N - Start new game");
        System.out.println("R - Restart existing game");
        System.out.println("H - Get help on how to play the game");
        System.out.println("E - Exit");
        System.out.println("=====================================================");
        
        boolean valid = false;
        while(valid == false){
            System.out.println("Please enter the action to take below:");
            Scanner scanner = new Scanner(System.in);
            
            //user string input
            String userInput = scanner.nextLine().trim();
            
            if(userInput.length() < 1){
                System.out.println("You must enter a non-blank value");
                continue;
            }
            
            inputs[0] = userInput;
            valid = true;
        }
        
        return inputs;
    }
    
    private boolean doAction(String[] inputs){
        
        //Set as first element and uppercase it
        String menuItem = inputs[0].toUpperCase();
        
        switch(menuItem){
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
              System.out.println("Invalid menu item");
        }
        
        return false;
    }

    private void startNewGame() {
        //create new game
        GameControl.createNewGame(OregonTrailGame.getPlayer());
        //GameControl.gameInitialization();
        
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.displayGameMenuView();
    }

    private void restartGame() {
        StartExistingGameView startExistingGameView = new StartExistingGameView();
        startExistingGameView.displayStartExistingGameView();
    }

    private void getHelp() {
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.displayHelpMenuView();
    }
    
}
