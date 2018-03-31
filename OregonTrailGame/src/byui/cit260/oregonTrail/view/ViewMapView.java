/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregonTrail.view;

import byui.cit260.oregonTrail.control.GameControl;
import byui.cit260.oregonTrail.view.PrintMapView;
import oregontrailgame.OregonTrailGame;


/**
 *
 * @author Roller
 */
public class ViewMapView extends View{
    
    public ViewMapView(String maps){
            
        super (
        "====================================================="
        +"\nViewing the map"
        +"\n====================================================="
        + maps
        + "\n1: Print the map to a file"
        + "\n\nEnter Q to go back to the game menu"
        +"\n====================================================="
        );
    }
  @Override
    
    public boolean doAction(String value){
        
        //Set as first element and uppercase it
        value = value.toUpperCase();
        //Convert to Number
        int option;
        try{
            option = Integer.parseInt(value);
        }
        catch (NumberFormatException e){
            ErrorView.display(this.getClass().getName(), "Your input was not valid: " + e.getMessage());
            return false;
        }
        
        switch(option){
            case 1:
                this.printMap();
                break;
                
            default:
              ErrorView.display(this.getClass().getName(), "Invalid menu item");
        }
        
        return false;
    }

    private void printMap() {
        PrintMapView printMap = new PrintMapView();
        printMap.display();
    }

      
}
