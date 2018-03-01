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
 * @author Randy ther Master
 */
public class ChooseMonthToStartView {
    
    public void displayChooseMonthToStartView() {
        boolean endOfView = false;
        
        do{
            String[] inputs = this.getInputs();
            if((inputs.length < 1) || (inputs[0].toUpperCase().equals("Q"))){
                return;
            }
            endOfView = doAction(inputs);
        }while(endOfView != true);
    }

 private String[] getInputs(){
        
        String[] inputs = new String[1];
        
        System.out.println("=====================================================");
        System.out.println("Choose a month to begin your journ");
        System.out.println("=====================================================");
        System.out.println("1 - March");
        System.out.println("2 - April");
        System.out.println("3 - May");
        System.out.println("4 - June");
        System.out.println("5 - July");
        System.out.println("6 - When Should I leave?");
        System.out.println("=====================================================");
        
        boolean valid = false;
        while(valid == false){
            System.out.println("----What is your choic:");
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
        String months = inputs[0].toUpperCase();
        
        switch(months){
            case "1":
                this.March();
                break;
                
            case "2":
                this.April();
                break;
                
            case "3":
                this.May();
                break;
                
            case "4":
                this.June();
                break;
            case "5":
                this.July();
                break;  
                
             case "6":
                this.leave();
                break;
                
            case "E":
                return true;
                
            default:
              System.out.println("Invalid month");
        }
        
        return false;
    }

    
    private void March() {
       System.out.println("You have selected the month of March");
    }    
    private void April() {
       System.out.println("You have selected the month of April");
    }

    private void May() {
       System.out.println("You have selected the month of May");
    }
    private void June() {
       System.out.println("You have selected the month of June");
    }
    private void July() {
     System.out.println("You have selected the month of July");   
    }
     private void leave() {
        System.out.println("You have selected when should I leave");
    }
}