/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregonTrail.control;

import byui.cit260.oregonTrail.exceptions.MapControlException;
import byui.cit260.oregonTrail.model.Game;
import byui.cit260.oregonTrail.model.Inventory;
import byui.cit260.oregonTrail.model.ItemType;
import byui.cit260.oregonTrail.model.Location;
import byui.cit260.oregonTrail.model.PaceType;
import byui.cit260.oregonTrail.model.PartyHealth;
import byui.cit260.oregonTrail.model.Player;
import byui.cit260.oregonTrail.model.RationType;
import byui.cit260.oregonTrail.model.Status;
import byui.cit260.oregonTrail.model.Weather;
import oregontrailgame.OregonTrailGame;
import byui.cit260.oregonTrail.exceptions.GameControlException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;

/**
 *
 * @author Roller
 */
public class GameControl {
    
    public static double calcScore(double inventoryValue, double money, int partyHealth, int occupation, int partyNotDead )throws GameControlException{
        
        //inventoryValue failure
        if(inventoryValue < 237 || inventoryValue > 7050){
           throw new GameControlException("The value must be between 237 and 7050");
        }
        
        //money failure
        if(money < 0 || money > 1600){
            throw new GameControlException("Invalid amount of money");
        }
        
        //partyHealth failure
        if(partyHealth < 1 || partyHealth > 3){
            throw new GameControlException("Party member has invald health number");
        }
        
        //occupation failure
        if(occupation < 1 || occupation > 3){
            throw new GameControlException("Invalid entry for occupation");
        }
        
        //partyNotDead failure
        if(partyNotDead < 1 || partyNotDead > 5){
           throw new GameControlException("The value must be between 1 and 5");
        }
        
        double finalScore = (inventoryValue + money) * (partyHealth * occupation * partyNotDead);
                
        return finalScore;
        
    }
    
    public static Player savePlayer(String name) throws GameControlException{
        if(name == null || name.length() < 1){
            throw new GameControlException("Name cannot be null or empty string");
        }
        
        Player player = new Player();
        player.setName(name);
        
        OregonTrailGame.setPlayer(player); //save the player
        
        return player;
    }

    public static void createNewGame(Player player) throws MapControlException,GameControlException{
        if (player == null){
            throw new GameControlException("The player can not be null");
        }
        Game game = new Game();
        game.setPlayer(player);
       
        Inventory[] items = GameControl.createItems();
        game.setInventory(items);

        int noOfRows = 1; //Change this to 0 to throw a MapControlException
        int noOfColumns = 4;
        Location[] map = MapControl.createMap(noOfRows, noOfColumns);

        if(map == null){
           throw new MapControlException("The map cannot be null" );
        }

        game.setLocations(map);
        
        //Set the initial status
        Status status = new Status();
        status.setPace(PaceType.Steady);
        status.setPartyhealth(PartyHealth.Good);
        status.setRation(RationType.Filling);
        //TODO: Weather needs to be based on when they set off
        status.setWeather(Weather.Warm);
        
        game.setStatus(status);
                
        OregonTrailGame.setCurrentGame(game);
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
                case Gruelling:
                    mileMarker += 40;
                    break;
                    
                case Strenuous:
                    mileMarker += 20;
                    
                default: //default is steady
                    mileMarker += 10;
            }
            
            //Change the mileMarker based on pace switch statement
            OregonTrailGame.getCurrentGame().setMileMarker(mileMarker);
        }
    }

    public static Inventory[] createItems() {
        System.out.println("createItems was called in the GameControl");
        Inventory[] inventory = new Inventory[7];
        
        //Set Oxen item for the game inventory
        Inventory itemOne = new Inventory();
        itemOne.setName("Oxen");
        itemOne.setQuantity(0.0);
        itemOne.setBasePrice(20.0);
        inventory[ItemType.Oxen.ordinal()] = itemOne;
        
        //Set Spare Parts item for the game inventory
        Inventory itemTwo = new Inventory();
        itemTwo.setName("Wagon Wheels");
        itemTwo.setQuantity(0.0);
        itemTwo.setBasePrice(20.0);
        inventory[ItemType.Wheels.ordinal()] = itemTwo;
        //wheels, axles, tongues, etc.
        
        //Set Spare Parts item for the game inventory
        Inventory itemThree = new Inventory();
        itemThree.setName("Wagon Axles");
        itemThree.setQuantity(0.0);
        itemThree.setBasePrice(10.0);
        inventory[ItemType.Axles.ordinal()] = itemThree;
        //wheels, axles, tongues, etc.
        
        //Set Spare Parts item for the game inventory
        Inventory itemFour = new Inventory();
        itemFour.setName("Wagon Tongues");
        itemFour.setQuantity(0.0);
        itemFour.setBasePrice(10.0);
        inventory[ItemType.Tongues.ordinal()] = itemFour;
        //wheels, axles, tongues, etc.
      
        //Set Clothing item for the game inventory
        Inventory itemFive = new Inventory();
        itemFive.setName("Clothing");
        itemFive.setQuantity(0.0);
        itemFive.setBasePrice(5.0);
        inventory[ItemType.Clothes.ordinal()] = itemFive;
        
        //Set Ammunition item for the game inventory
        Inventory itemSix = new Inventory();
        itemSix.setName("Ammunition");
        itemSix.setQuantity(0.0);
        itemSix.setBasePrice(1.0);
        inventory[ItemType.Ammunition.ordinal()] = itemSix;
        
        //Set Food item for the game inventory
        Inventory itemSeven = new Inventory();
        itemSeven.setName("Food (1 pound)");
        itemSeven.setQuantity(100.0);
        itemSeven.setBasePrice(1.0);
        inventory[ItemType.Food.ordinal()] = itemSeven;
        
        return inventory;
    }

    public static void saveGame(Game game, String filePath) throws GameControlException, IOException {
        
        if(filePath == null || filePath.length() < 1){
            throw new GameControlException("You put in an invalid path, please try again.");
        }
        
        ObjectOutputStream saveGame = new ObjectOutputStream(new FileOutputStream(filePath));
        saveGame.writeObject(game);
    }

    public static void getGame(String filePath) throws GameControlException, IOException, ClassNotFoundException{
        if(filePath == null || filePath.length() < 1){
            throw new GameControlException("You put in an invalid path, please try again.");
        }
        
        ObjectInputStream getGame = new ObjectInputStream(new FileInputStream(filePath));
        
        Game game = (Game) getGame.readObject();
        OregonTrailGame.setCurrentGame(game);
        OregonTrailGame.setPlayer(game.getPlayer());
        
    }

    public static void printGame(Game game, String filePath) throws GameControlException, IOException {
      if(filePath == null || filePath.length() < 1){
            throw new GameControlException("You put in an invalid path, please try again.");
        }
        
        PrintWriter printWriter = new PrintWriter(filePath);
        printWriter.println("List of Game object");
        printWriter.println("Item Name\tQuantity\tBase Price");
        for(Inventory gam : game.getInventory()) {
           printWriter.println(gam.getName() + "\t\t" + gam.getQuantity() + "\t\t" + gam.getBasePrice());
       }
        printWriter.close (); }

    public static void continueTrail() {
        Game game = OregonTrailGame.getCurrentGame();
        double mileMarker = 0.0;
        if(game.getStatus().getPace() == PaceType.Steady){
            mileMarker += 1;
        }
        if(game.getStatus().getPace() == PaceType.Strenuous){
            mileMarker += 2;
        }
        if(game.getStatus().getPace() == PaceType.Gruelling){
            mileMarker += 3;
        }
        game.setMileMarker(mileMarker);
        System.out.println("You went " + mileMarker + " miles.");
    }
    
}
