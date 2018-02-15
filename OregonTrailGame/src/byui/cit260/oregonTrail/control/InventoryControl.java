/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregonTrail.control;

/**
 *
 * @author Roller
 */
public class InventoryControl {
    
    public static  double calcInventoryValue(double locationMultiplier, double sumInventoryBase){
        
        if(locationMultiplier < 1 || locationMultiplier > 3){
            return -1;
        }
        
        if(sumInventoryBase < 238 || sumInventoryBase > 7050){
            return -1;
        }
        
        
        double inventoryValue = locationMultiplier * sumInventoryBase;
        
        return inventoryValue;
    }
    
}
