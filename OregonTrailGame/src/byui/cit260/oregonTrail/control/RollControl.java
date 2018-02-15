/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregonTrail.control;

import java.util.Random;

/**
 *
 * @author Roller
 */
public class RollControl {
    
    public double rollChance(double chance, double maxNumber){
        
        Random rand = new Random();
        
        double rollChance = maxNumber * rand.nextDouble();
        
        return rollChance;
    }
    
}
