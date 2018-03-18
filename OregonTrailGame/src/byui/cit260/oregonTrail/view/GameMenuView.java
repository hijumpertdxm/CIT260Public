/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregonTrail.view;

import byui.cit260.oregonTrail.model.Location;
import byui.cit260.oregonTrail.model.PaceType;
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
        +"\nQ. Quit"
        +"\n----What is your choice?"
        +"\n====================================================="
           );
   
    }
    @Override
    public boolean doAction(String value){
        
        //Set as first element and uppercase it
        value = value.toUpperCase();
        
        switch(value){
            case "1":
                this.continueTrail();
                break;
                
            case "2":
                this.checkSupplies();
                break;
                
            case "3":
                this.displayMap();
                break;
                
            case "4":
                this.changePace();
                break;
                
            case "5":
                this.changeRations();
                break;
                
            case "6":
                this.rest();
                break;
                
            case "7":
                this.hunt();
                break;
                
            default:
              System.out.println("Invalid menu item");
        }
        
        return false;
    }

    private void continueTrail() {
        System.out.println("continueTrail() was called from the game menu");
    }

    private void checkSupplies() {
        System.out.println("checkSupplies() was called from the game menu");
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
        ChangeRationsView changeRationsView = new ChangeRationsView();
        changeRationsView.display();
    }

    private void rest() {
        StopToRestView stopToRestView = new StopToRestView();
        stopToRestView.display();
    }

    private void hunt() {
        System.out.println("hunt() was called from the game menu");
    }
    
}
