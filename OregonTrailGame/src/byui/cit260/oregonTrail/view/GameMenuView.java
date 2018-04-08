/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregonTrail.view;

import byui.cit260.oregonTrail.control.GameControl;
import byui.cit260.oregonTrail.control.InventoryControl;
import byui.cit260.oregonTrail.exceptions.InventoryControlException;
import byui.cit260.oregonTrail.model.Location;
import byui.cit260.oregonTrail.model.PaceType;
import byui.cit260.oregonTrail.model.RationType;
import java.util.logging.Level;
import java.util.logging.Logger;
import oregontrailgame.OregonTrailGame;

/**
 *
 * @author Roller
 */
public class GameMenuView extends View{
    
   public GameMenuView(){
           
      super (        
        "====================================================="
        +"\nThe Oregon Trail"
        +"\n====================================================="
        +"\nLocation: " //Need to setup locations first
        +"\nDate: "
        +"\nWeather: " + OregonTrailGame.getCurrentGame().getStatus().getWeather().getName()
        +"\nHealth: "  + OregonTrailGame.getCurrentGame().getStatus().getPartyhealth().name()
        +"\nPace: "   + OregonTrailGame.getCurrentGame().getStatus().getPace()
        +"\nRations: "  + OregonTrailGame.getCurrentGame().getStatus().getRation()
        +"\n\n1. Continue on trail"
        +"\n2. Check supplies"
        +"\n3. Display the map"
        +"\n4. Change pace"
        +"\n5. Change food rations"
        +"\n6. Stop to rest"
        +"\n7. Hunt"
        +"\n8. Winning View"   
        +"\n9. Occupation Set" 
        +"\n10. Wagon Party Set"
        +"\n11. Save the game"
        +"\n12. Print Game"        
                
        +"\n13. Print party members"        
        +"\nQ. Quit"
        +"\n----What is your choice?"
        +"\n====================================================="
           );
   
    }
    @Override
    public boolean doAction(String value){
        
        //Set as first element and uppercase it
        value = value.toUpperCase();
        //Convert to Number
        int option;
        try{
            option = Integer.parseInt(value);
        }
        catch (NumberFormatException e){
            ErrorView.display(this.getClass().getName(), "Your input was not valid: " + e.getMessage());
            return false;
        }
        
        switch(option){
            case 1:
                this.continueTrail();
                break;
                
            case 2:
                this.checkSupplies();
                break;
                
            case 3:
                this.displayMap();
                break;
                
            case 4:
                this.changePace();
                break;
                
            case 5:
                this.changeRations();
                break;
                
            case 6:
                this.rest();
                break;
                
            case 7:
                this.hunt();
                break;
                
            case 8:
                this.winningView();
                break;
                
            case 9:
                this.occupationView();
                break;
                
            case 10:
                this.wagonParty();
                break;
                
            case 11:
                this.saveGame();
                break;
            case 12:
                this.printGame();
                break;
                
                
                
                
            case 13:
                this.printPlayer();
                break;    
                
                
            default:
              ErrorView.display(this.getClass().getName(), "Invalid menu item");
        }
        
        return false;
    }

    private void continueTrail() {
        GameControl.continueTrail();
    }

    private void checkSupplies() {
        //Go to Check Supplies View
        CheckSuppliesView checkSuppliesView = new CheckSuppliesView();
        checkSuppliesView.display();
    }

    private void displayMap() {
        String maps = "";
        Location[] locations = OregonTrailGame.getCurrentGame().getLocations();
        for(int i=0; i <= locations.length - 1; i++){
            maps += "\n" + locations[i].getName() + " at Mile Marker: " + locations[i].getMileMarker() + "";
        }
        ViewMapView viewMap = new ViewMapView(maps);
        viewMap.display();
    }

    private void changePace() {
        String pacing = "";
        for(PaceType pace: PaceType.values()){
            pacing += "\n" + (pace.ordinal() + 1) + ". " + pace.name();
        }
        ChangePaceView paceView = new ChangePaceView(pacing);
        paceView.display();
    }

    private void changeRations() {
        //Go to Change Rations View
        String rations = "";
        for(RationType ration: RationType.values()){
            rations += "\n" + (ration.ordinal() + 1) + ". " + ration.name();
        }        
        ChangeRationsView changeRationsView = new ChangeRationsView(rations);
        changeRationsView.display();
    }

    private void rest() {
        StopToRestView stopToRestView = new StopToRestView();
        stopToRestView.display();
    }

    private void winningView() { 
       double locationMultiplier = 1.0;
       WinningView winView = null;
       try {
           //temporary hard-coding values so that it will somewhat function for now
           winView = new WinningView();
           winView.display();
       } catch (InventoryControlException ex) {
           ErrorView.display(this.getClass().getName(), ex.getMessage());
       }                               
    }

    private void hunt() {
        System.out.println("The hunt view was called");
    }

    private void occupationView() {
        ChooseOccupationView occupationView = new ChooseOccupationView();
        occupationView.display();
    }

    private void wagonParty() {
        ChooseWagonPartyView wagonSetView = new ChooseWagonPartyView();
        wagonSetView.display();
    }

    private void saveGame() {
        SaveGameView saveView = new SaveGameView();
        saveView.display();
    }

    private void printGame() {
        PrintGameView PrintView = new PrintGameView();
        PrintView.display();  }
    
    
    
    
   private void printPlayer() {
        PrintPlayerView printPlayer = new PrintPlayerView();
        printPlayer.display();
    }
    
}
