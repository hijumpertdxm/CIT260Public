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
public class SaveQuitMenuView extends View {

    public SaveQuitMenuView (){
    
       super (
        "==========The Oregon Trail=========="
        +"\n1. Save and Quit"
        +"\n2. Quit"
        +"\nC. Continue"
        +"\n-----What is your choice?"
        +"\n===================================="
            
       );

    }
      @Override
    
    public boolean doAction(String value){
        
        //Set as first element and uppercase it
        value = value.toUpperCase();
        
        switch(value){
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
        //Save game and quit
        System.out.println("The game has been saved");
    }

    private void quitGame() {
        //Exit 
        System.exit(0);
    }

    private void continueGame() {
        //Go back to main menu
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.display();
    }
    
}
