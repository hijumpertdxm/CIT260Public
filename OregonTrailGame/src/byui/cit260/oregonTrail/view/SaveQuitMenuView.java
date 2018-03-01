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
 * @author ayami
 */
public class SaveQuitMenuView {
    public void displaySaveQuitMenuView(){
        boolean endView = false;
        do{
            String[] inputs = this.getInputs();
            if(inputs.length < 1){
                return;
            }
            endView = doAction(inputs);
        }while(endView != true);
    }
    
    private String[] getInputs(){
        
        String[] inputs = new String[1];
        
        System.out.println("==========The Oregon Trail==========");
        System.out.println("1. Save and Quit");
        System.out.println("2. Quit");
        System.out.println("C. Continue");
        System.out.println("-----What is your choice?");
        System.out.println("====================================");
        
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
            case "1":
                this.saveAndQuitGame();
                break;
                
            case "2":
                this.quitGame();
                break;
                
            case "C":
                this.continueGame();
                break;
                
            default:
              System.out.println("Invalid menu item");
        }
        
        return false;
    }
    
    private void saveAndQuitGame() {
        //save game and quit
        GameControl.createNewGame(OregonTrailGame.getPlayer());
        
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.displayGameMenuView();
    }

    private void quitGame() {
        //Exit 
        System.exit(0);
    }

    private void continueGame() {
        //go back to main menu
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.displayGameMenuView();
    }
    
}
