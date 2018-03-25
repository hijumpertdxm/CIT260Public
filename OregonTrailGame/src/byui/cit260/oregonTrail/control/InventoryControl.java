/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregonTrail.control;
import byui.cit260.oregonTrail.exceptions.InventoryControlException;

/**
 *
 * @author Roller
 */
public class InventoryControl {
    
    public static  double calcInventoryValue(double locationMultiplier, double sumInventoryBase) throws InventoryControlException{
        
        if(locationMultiplier < 1 || locationMultiplier > 3){
            throw new InventoryControlException("You are WAY off the path!");
        }
        
        if(sumInventoryBase < 237 || sumInventoryBase > 7050){
            throw new InventoryControlException("There is a SERIOUS problem with your inventory!");
        }
        
        
        double inventoryValue = locationMultiplier * sumInventoryBase;
        
        return inventoryValue;
    }
    
    public static double calcSumInventoryBase(double basePriceOxen, double numberOxen, double basePriceWheels, double numberWheels, 
                                               double basePriceAxles, double numberAxles, double basePriceTongues, double numberTongues,
                                               double basePriceClothes, double numberClothes, double basePriceAmmunition, double numberAmmunition,
                                               double basePriceFood, double numberFood){
        
        //Check each item for a value error
        if(basePriceOxen < 20 || basePriceOxen > 20){
            throw new InventoryControlException("These are some VERY special oxen");
        }
        
        if(numberOxen < 1 || numberOxen > 8){
            throw new InventoryControlException("You must have at least 2, and no more than 8, oxen.");
        }
                
      
         if(basePriceWheels < 5 || basePriceWheels > 5){
            throw new InventoryControlException("These are some VERY special wheels");
        }
        
        if(numberWheels < 2 || numberWheels > 8){
            throw new InventoryControlException("You must have at least 2, and no more than 8, wheels.");
        }
                
               
        if(basePriceAxles < 10 || basePriceAxles > 10){
            throw new InventoryControlException("These are some VERY special axles");
        }
        
        if(numberAxles < 2 || numberAxles > 4){
            throw new InventoryControlException("You must have at least 2, and no more than 4, axles.");
        }
        
      
        if(basePriceTongues < 15 || basePriceTongues > 15){
            throw new InventoryControlException("These are some VERY special wagon tongues");
        }
        
        if(numberTongues < 1 || numberTongues > 8){
            throw new InventoryControlException("You must have at least 1, and no more than 8, wagon tongues.");
        }      
        
        
        if(basePriceClothes < 4 || basePriceClothes > 4){
            throw new InventoryControlException("These are some VERY special clothes");
        }
        
        if(numberClothes < 1 || numberClothes > 20){
            throw new InventoryControlException("You must have at least 1, and no more than 20, sets of clothing.");
        }     
    
        
        if(basePriceAmmunition < 1 || basePriceAmmunition > 1){
            throw new InventoryControlException("This is some VERY special ammunition");
        }
        
        if(numberAmmunition < 0 || numberAmmunition > 1000){
            throw new InventoryControlException("You have an ammunition problem!");
        }
        
     
        if(basePriceFood < .5 || basePriceFood > .5){
            throw new InventoryControlException("This is some VERY special food");
        }
        
        if(numberFood < 0 || numberFood > 2000){
            throw new InventoryControlException("You have a food problem!");
        }
        
        //calculate the value of each item type in inventory
        double oxenValue = basePriceOxen * numberOxen;
        double wheelsValue = basePriceWheels * numberWheels;
        double axlesValue = basePriceAxles * numberAxles;
        double tonguesValue = basePriceTongues * numberTongues;
        double clothesValue = basePriceClothes * numberClothes;
        double ammunitionValue = basePriceAmmunition * numberAmmunition;
        double foodValue = basePriceFood * numberFood;

        //calculate the value of the total base inventory
        double sumInventoryBase = oxenValue + wheelsValue + axlesValue + tonguesValue + clothesValue + ammunitionValue + foodValue;
        return sumInventoryBase;
}
}
