/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregonTrail.view;

import byui.cit260.oregonTrail.control.GameControl;
import byui.cit260.oregonTrail.control.StatusControl;
import oregontrailgame.OregonTrailGame;
/**
 *
 * @author ayami
 */
public class ChangeRationsView extends View{
    
    public ChangeRationsView (String text) {
      
        super(
        "==========The Oregon Trail=========="
        +"\nYou can change food rations as follows:" 
        +text
        +"\nC. Continue the game"
        +"\n-----What is your choice?"
        +"\n===================================="
          );
    }  
       
   @Override
    
    public boolean doAction(String value){
        
        //Set as first element and uppercase it
        value = value.toUpperCase();
        
        switch(value){
            case "1":
                this.changeRationsFilling();
                break;
                
            case "2":
                this.changeRationsMeager();
                break;
                
            case "3":
                this.changeRationsBones();
                break;    
                
            case "C":
                this.continueGame();
                break;
                
            default:
              System.out.println("Invalid menu item");
        }
        
        return false;
    }
    
    private void changeRationsFilling() {
        //Change first rations parameter
        System.out.println("The food rations have been changed to Filling");
    }

     private void changeRationsMeager() {
        //Change second rations parameter
        System.out.println("The food rations have been changed to Meager");
    }
     
      private void changeRationsBones() {
        //Change third rations parameter
        System.out.println("The food rations have been changed to Bare Bones");
    }

    private void continueGame() {
        //Go back to main menu
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.display();
    }
    
}
