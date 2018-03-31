/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregonTrail.view;

import byui.cit260.oregonTrail.control.InventoryControl;
import byui.cit260.oregonTrail.exceptions.InventoryControlException;
import byui.cit260.oregonTrail.model.Inventory;
import java.io.IOException;
import oregontrailgame.OregonTrailGame;

/**
 *
 * @author Roller
 */
public class PrintCurrentInventoryView extends View{
    
    public PrintCurrentInventoryView(){
            
        super (
        "====================================================="
        +"\nPrinting your Inventory"
        +"\n====================================================="
        + "\n To print your Inventory, please input a file name path."
        +"\n====================================================="
        );
    }
  @Override
    
    public boolean doAction(String value){
        
        String filePath = value;
        Inventory[] inventory = OregonTrailGame.getCurrentGame().getInventory();
        try{
            InventoryControl.printCurrentInventory(inventory, filePath);
            this.console.println("The inventory list was saved successfully!");
        } catch (InventoryControlException | IOException e){
            ErrorView.display(this.getClass().getName(), "Error: " + e.getMessage());
            return false;
        }
        return true;
    }
}