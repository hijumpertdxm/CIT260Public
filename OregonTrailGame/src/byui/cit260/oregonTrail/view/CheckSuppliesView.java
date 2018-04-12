/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregonTrail.view;

import byui.cit260.oregonTrail.model.Inventory;
import oregontrailgame.OregonTrailGame;

/**
 *
 * @author ayami
 */
public class CheckSuppliesView extends View{
    
    public CheckSuppliesView() {
      
//        super(
//        "==========The Oregon Trail=========="
//        +"\nThese are your current supplies:"
//        +"\nOxen"
//        +"\nFood"
//        +"\nClothing"
//        +"\nAmmunition"
//        +"\nSpare Parts"
//        +"\n"
//        +"\nC. Continue the game"
//        +"\n-----What is your choice?"
//        +"\n===================================="
//          );

        Inventory[] inventory = OregonTrailGame.getCurrentGame().getInventory();
        printWriter.println("List of Inventory");
            printWriter.println("Name\tQuantity");
            for(Inventory i : inventory) {
                printWriter.println(i.getName() + "\t\t" + i.getQuantity());
            }
    }  
       
   @Override
    
    public boolean doAction(String value){
        
        //Set as first element and uppercase it
        value = value.toUpperCase();
        
        switch(value){  
                
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
    
}
