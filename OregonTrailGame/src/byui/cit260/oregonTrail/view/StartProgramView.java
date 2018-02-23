/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregonTrail.view;
import byui.cit260.oregonTrail.control.GameControl;
import byui.cit260.oregonTrail.model.Player;
import java.util.Scanner;

/**
 *
 * @author SysAdmin
 */
public class StartProgramView {

    public StartProgramView() {
    }
    public void displayStartProgramView() {
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
        
        boolean valid = false;
        while(valid == false){
            System.out.println("Please enter the player's name below:");
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
        
        String playersName = inputs[0];
        Player player = GameControl.savePlayer(playersName);
        
        if(player == null){
            System.out.println("Could not create the player. Please enter a different name.");
            return false;
        }
        
        System.out.println("=====================================================");
        System.out.println("Welcome to the game " + playersName);
        System.out.println("We hope you have a lot of fun!");
        System.out.println("=====================================================");
        
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.displayMainMenuView();
        
        return true;
    }
    
}
