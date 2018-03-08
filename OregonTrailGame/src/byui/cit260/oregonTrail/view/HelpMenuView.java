/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregonTrail.view;

import java.util.Scanner;

/**
 *
 * @author Roller
 */
public class HelpMenuView extends View {

//    public void displayHelpMenuView() {
//        boolean endView = false;
//        do{
//            String[] inputs = this.getInputs();
//            if((inputs.length < 1) || (inputs[0].toUpperCase().equals("Q"))){
//                return;
//            }
//            endView = doAction(inputs);
//        }while(endView != true);
//    }
//    
//    private String[] getInputs(){
//        
//        String[] inputs = new String[1];
//        
//        System.out.println("=====================================================");
//        System.out.println("Help Menu");
//        System.out.println("=====================================================");
//        System.out.println("G - What is the goal of the game?");
//        System.out.println("M - How to move");
//        System.out.println("R - Getting resources");
//        System.out.println("Q - Quit");
//        System.out.println("=====================================================");
//        
//        boolean valid = false;
//        while(valid == false){
//            System.out.println("Please enter the action to take below:");
//            Scanner scanner = new Scanner(System.in);
//            
//            //user string input
//            String userInput = scanner.nextLine().trim();
//            
//            if(userInput.length() < 1){
//                System.out.println("You must enter a non-blank value");
//                continue;
//            }
//            
//            inputs[0] = userInput;
//            valid = true;
//        }
//        
//        return inputs;
//    }
//    
    private boolean doAction(String[] inputs){
        
        //Set as first element and uppercase it
        String menuItem = inputs[0].toUpperCase();
        
        switch(menuItem){
            case "G":
                this.getGoalOfGame();
                break;
                
            case "M":
                this.getHowToMove();
                break;
                
            case "R":
                this.getGettingResources();
                break;
                
            default:
              System.out.println("Invalid menu item");
        }
        
        return false;
    }

    private void getGoalOfGame() {
        System.out.println("The goal of the game is to reach the end of the trail with as many party members alive and as much inventory as possible.\n");
    }

    private void getGettingResources() {
        System.out.println("While out on the trail you can hunt and get food. Otherwise you should buy all of your supplies at the beginning of the game.\n");
    }

    private void getHowToMove() {
        System.out.println("Each new day you move X amount of miles based on the pace that you set.\n");
    }
    
}
