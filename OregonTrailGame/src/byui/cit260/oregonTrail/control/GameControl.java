/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregonTrail.control;

import byui.cit260.oregonTrail.model.Player;
import byui.cit260.oregonTrail.model.Status;
import oregontrailgame.OregonTrailGame;

/**
 *
 * @author Roller
 */
public class GameControl {
    
    public static void gameInitialization(){
        //setup all of the game variables
        
        Status status = StatusControl.statusInitialization();

        OregonTrailGame.getCurrentGame().setDaysTraveled(0);
        OregonTrailGame.getCurrentGame().setMileMarker(0.0);
        OregonTrailGame.getCurrentGame().setStatus(status);
    }
    
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
    
    public static Player savePlayer(String name){
        if(name == null || name.length() < 1){
            return null;
        }
        
        Player player = new Player();
        player.setName(name);
        
        OregonTrailGame.setPlayer(player); //save the player
        
        return player;
    }

    public static void createNewGame(Player player){
        System.out.println("createNewGame called in GameControl class");
    }

    public static void progressOneDay(int progress) {
        //progress one day by continuing on the trail or stopping to rest
        
        //Add one day to total travelled
        int daysTravelled = OregonTrailGame.getCurrentGame().getDaysTraveled() + 1;
        OregonTrailGame.getCurrentGame().setDaysTraveled(daysTravelled);
        
        //if progress is 0, then rest stop, 1 is regular progress
        if(progress != 0){
            // TODO : Need to add in food subtraction when we straighten out inventory later
            
            double mileMarker = OregonTrailGame.getCurrentGame().getMileMarker();
            
            switch(OregonTrailGame.getCurrentGame().getStatus().getPace()){
                case "gruelling":
                    mileMarker += 40;
                    break;
                    
                case "strenuous":
                    mileMarker += 20;
                    
                default: //default is steady
                    mileMarker += 10;
            }
            
            //Change the mileMarker based on pace switch statement
            OregonTrailGame.getCurrentGame().setMileMarker(mileMarker);
        }
    }
    
}
