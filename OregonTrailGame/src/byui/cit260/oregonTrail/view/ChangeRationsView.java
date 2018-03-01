/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregonTrail.view;

import byui.cit260.oregonTrail.control.GameControl;
import byui.cit260.oregonTrail.control.StatusControl;
import java.util.Scanner;
import oregontrailgame.OregonTrailGame;
/**
 *
 * @author ayami
 */
public class ChangeRationsView {
    public void displayChangeRationsView(){
        boolean endView = false;
        do{
            String[] inputs = this.getInputs();
            if((inputs.length < 1)  || (inputs[0].toUpperCase().equals("Q"))){
                return;
            }
            endView = doAction(inputs);
        }while(endView != true);
        
    }
    
    private String[] getInputs(){
        
        String[] inputs = new String[1];
        
        System.out.println("==========The Oregon Trail==========");
        System.out.println("You can change food rations as follows: \n");
        System.out.println("1. Filling - Large and generous meals.");
        System.out.println("2. Meager - Small, but adequate meals.");
        System.out.println("3. Bare bones - Very small insufficient meals.");
        System.out.println("C. Continue the game");
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
                this.changeRationsFilling();
                break;
                
            case "2":
                this.changeRationsMeager();
                break;
                
            case "3":
                this.changeRationsBones();
                break;    
                
            case "C":
                this.continueGame();
                break;
                
            default:
              System.out.println("Invalid menu item");
        }
        
        return false;
    }
    
    private void changeRationsFilling() {
        //Change first rations parameter
        System.out.println("The food rations have been changed to Filling");
    }

     private void changeRationsMeager() {
        //Change second rations parameter
        System.out.println("The food rations have been changed to Meager");
    }
     
      private void changeRationsBones() {
        //Change third rations parameter
        System.out.println("The food rations have been changed to Bare Bones");
    }

    private void continueGame() {
        //Go back to main menu
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.displayGameMenuView();
    }
    
}
