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
public class GameMenuView {
    
    public void displayGameMenuView() {
        //May need to call the other views to setup the game first
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
        System.out.println("The Oregon Trail");
        System.out.println("=====================================================");
        System.out.println("Location: ");
        System.out.println("Date: ");
        System.out.println("Weather: ");
        System.out.println("Health: ");
        System.out.println("Pace: ");
        System.out.println("Rations: \n");
        System.out.println("1. Continue on trail");
        System.out.println("2. Check supplies");
        System.out.println("3. Display the map");
        System.out.println("4. Change pace");
        System.out.println("5. Change food rations");
        System.out.println("6. Stop to rest");
        System.out.println("7. Hunt");
        System.out.println("Q. Quit");
        System.out.println("----What is your choice?");
        System.out.println("=====================================================");
        
        boolean valid = false;
        while(valid == false){

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
                this.continueTrail();
                break;
                
            case "2":
                this.checkSupplies();
                break;
                
            case "3":
                this.displayMap();
                break;
                
            case "4":
                this.changePace();
                break;
                
            case "5":
                this.changeRations();
                break;
                
            case "6":
                this.rest();
                break;
                
            case "7":
                this.hunt();
                break;
                
            default:
              System.out.println("Invalid menu item");
        }
        
        return false;
    }

    private void continueTrail() {
        System.out.println("continueTrail() was called from the game menu");
    }

    private void checkSupplies() {
        System.out.println("checkSupplies() was called from the game menu");
    }

    private void displayMap() {
        System.out.println("displayMap() was called from the game menu");
    }

    private void changePace() {
        System.out.println("changePace() was called from the game menu");
    }

    private void changeRations() {
        //Go to Change Rations View
        ChangeRationsView changeRationsView = new ChangeRationsView();
        changeRationsView.displayChangeRationsView();
    }

    private void rest() {
        System.out.println("rest() was called from the game menu");
    }

    private void hunt() {
        System.out.println("hunt() was called from the game menu");
    }
    
}
