/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregonTrail.view;

import java.util.Scanner;

/**
 *
 * @author Randy ther Master
 */
public class ChangePaceView {
    
    public class ChangePaceView {
    public void displayChangePaceView(){
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
        System.out.println("You can change pace as follows: \n");
        System.out.println("1. Staedy");
        System.out.println("2. Strenuou");
        System.out.println("3. Gruelling");
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
                this.changePaceSteady();
                break;
                
            case "2":
                this.changePaceStrenuous();
                break;
                
            case "3":
                this.changePaceGruelling();
                break;    
                
            case "C":
                this.continueGame();
                break;
                
            default:
              System.out.println("Invalid menu item");
        }
        
        return false;
    }

    private void continueGame() {
        //Go back to main menu
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.displayGameMenuView();
    }

        private void changePaceSteady() {
          System.out.println("The pace has been changed to steady");  
        }

        private void changePaceStrenuous() {
           System.out.println("The pace has been changed to strenuous");
        }

        private void changePaceGruelling() {
         System.out.println("The pace has been changed to gruelling");      
        }
    
    
    
    
    
    
}
