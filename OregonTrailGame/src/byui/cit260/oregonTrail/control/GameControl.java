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
public class GameControl {
    
    public static double calcScore(double inventoryValue, double money, int partyHealth, int occupation, int partyNotDead){
        
        //inventoryValue failure
        if(inventoryValue < 237 || inventoryValue > 7050){
            return -1;
        }
        
        //money failure
        if(money < 0 || money > 1600){
            return -1;
        }
        
        //partyHealth failure
        if(partyHealth < 1 || partyHealth > 3){
            return -1;
        }
        
        //occupation failure
        if(occupation < 1 || occupation > 3){
            return -1;
        }
        
        //partyNotDead failure
        if(partyNotDead < 1 || partyNotDead > 5){
            return -1;
        }
        
        double finalScore = (inventoryValue + money) * (partyHealth * occupation * partyNotDead);
                
        return finalScore;
        
    }
    
}
