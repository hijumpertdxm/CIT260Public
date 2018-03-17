/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregonTrail.view;

import byui.cit260.oregonTrail.control.GameControl;
import byui.cit260.oregonTrail.model.Location;
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
        + "\n\nEnter Q to go back to the game menu"
        +"\n====================================================="
        );
    }
  @Override
    
    public boolean doAction(String Value){
        
        return true;
    }

      
}
