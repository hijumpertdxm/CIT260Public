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
public class MapControl {
    
    public static double calcRiverChance(double depth, double width, int[] rainyDays){
        
        //Failing depth
        if(depth > 72 || depth < 0){
            return -1;
        }
        
        //Failing width
        if(width > 500 || width < 20){
            return -1;
        }
        
        //Calculating past 7 rainyDays
        int sumRainyDays = 0;
        for(int i : rainyDays){
            sumRainyDays += i;
        }
        
        //Caluclating reverFailChance
        double riverFailChance = depth  + (.1 * width) + (sumRainyDays * 5);
        
        return riverFailChance;
    }
    
}
