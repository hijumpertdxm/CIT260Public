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
        
        if(sumInventoryBase < 237 || sumInventoryBase > 7050){
            return -1;
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
            return -1;
        }
        
        if(numberOxen < 1 || numberOxen > 8){
            return -1;
        }
                
      
         if(basePriceWheels < 5 || basePriceWheels > 5){
            return -1;
        }
        
        if(numberWheels < 1 || numberWheels > 8){
            return -1;
        }
                
               
        if(basePriceAxles < 10 || basePriceAxles > 10){
            return -1;
        }
        
        if(numberAxles < 2 || numberAxles > 4){
            return -1;
        }
        
      
        if(basePriceTongues < 15 || basePriceTongues > 15){
            return -1;
        }
        
        if(numberTongues < 1 || numberTongues > 8){
            return -1;
        }      
        
        
        if(basePriceClothes < 4 || basePriceClothes > 4){
            return -1;
        }
        
        if(numberClothes < 1 || numberClothes > 20){
            return -1;
        }     
    
        
        if(basePriceAmmunition < 1 || basePriceAmmunition > 1){
            return -1;
        }
        
        if(numberAmmunition < 0 || numberAmmunition > 1000){
            return -1;
        }
        
     
        if(basePriceFood < .5 || basePriceFood > .5){
            return -1;
        }
        
        if(numberFood < 0 || numberFood > 2000){
            return -1;
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
