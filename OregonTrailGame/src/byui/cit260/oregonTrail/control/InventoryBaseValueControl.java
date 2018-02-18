/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregonTrail.control;

/**
 *
 * @author Vale
 */
public class InventoryBaseValueControl {
    
    public static  double calcsumInventoryBase(double basePriceOxen, double numberOxen, double basePriceWheels, double numberWheels, 
                                               double basePriceAxles, double numberAxles, double basePriceTongues, double numberTongues,
                                               double basePriceClothes, double numberClothes, double basePriceAmmunition, double numberAmmunition
                                               double basePriceFood, double numberFood){
        
        if(basePriceOxen < 20 || basePriceOxen > 20){
            return -1;
        }
        
        if(numberOxen < 1 || numberOxen > 8){
            return -1;
        }
                
        double oxenValue = basePriceOxen * numberOxen;
        
        return oxenValue;

         if(basePriceWheels < 5 || basePriceWheels > 5){
            return -1;
        }
        
        if(numberWheels < 1 || numberWheels > 8){
            return -1;
        }
                
        double wheelsValue = basePriceWheels * numberWheels;
        
        return wheelsValue;   
        
        
        if(basePriceAxles < 10 || basePriceAxles > 10){
            return -1;
        }
        
        if(numberAxles < 2 || numberAxles > 4){
            return -1;
        }
                
        double axlesValue = basePriceAxles * numberAxles;
        
        return axlesValue;
        
}
        if(basePriceTongues < 15 || basePriceTongues > 15){
            return -1;
        }
        
        if(numberTongues < 1 || numberTongues > 8){
            return -1;
        }
                
        double tonguesValue = basePriceTongues * numberTongues;
        
        return tonguesValue;
        
        
        if(basePriceClothes < 4 || basePriceClothes > 4){
            return -1;
        }
        
        if(numberClothes < 1 || numberClothes > 20){
            return -1;
        }
                
        double clothesValue = basePriceClothes * numberClothes;
        
        return clothesValue;
    
        
        if(basePriceAmmunition < 1 || basePriceAmmunition > 1){
            return -1;
        }
        
        if(numberAmmunition < 0 || numberAmmunition > 1000){
            return -1;
        }
                
        double ammunitionValue = basePriceAmmunition * numberAmmunition;
        
        return ammunitionValue;
        
       
        if(basePriceFood < .5 || basePriceFood > .5){
            return -1;
        }
        
        if(numberFood < 0 || numberFood > 2000){
            return -1;
        }
                
        double foodValue = basePriceFood * numberFood;
        
        return foodValue;
        
        sumInventoryBase = oxenValue + wheelsValue + axlesValue + tonguesValue + clothesValue + ammunitionValue + foodValue
}
    

    
        
    

