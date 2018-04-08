/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregonTrail.view;

import byui.cit260.oregonTrail.control.InventoryControl;

/**
 *
 * @author ayami
 */
public class HuntingView extends View{
    
    public HuntingView() {
      
        super(
        "==========The Oregon Trail=========="
        +"\nType the word below to hunt:"
        +"\nBang!"
        +"\nC. Continue the game"
        +"\n-----What is your choice?"
        +"\n===================================="
          );
    }  
       
   @Override
    
    public boolean doAction(String value){
        
        //Set as first element and uppercase it
        value = value.toUpperCase();
        
        switch(value){  
            case "BANG!":
                this.hunt();
                  break;      
            case "C":
                this.continueGame();
                break;
                
            default:
              ErrorView.display(this.getClass().getName(), "Invalid menu item");
        }
        
        return false;
    }
    
  
    private void continueGame() {
        //Go back to main menu
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.display();
    }

    private void hunt() {
        InventoryControl.hunting();
                }
    
}
