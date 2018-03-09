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
public class StartProgramView extends View{
    
    public StartProgramView(){
        super("\n"
                + "Please enter the player's name below:\n");
    }
    
    @Override
    public boolean doAction(String value){
        
        String playersName = value;
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
        mainMenuView.display();
        
        return true;
    }
    
}
