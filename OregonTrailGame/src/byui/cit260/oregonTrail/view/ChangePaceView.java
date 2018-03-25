/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregonTrail.view;

import byui.cit260.oregonTrail.control.StatusControl;
import byui.cit260.oregonTrail.model.PaceType;


/**
 *
 * @author Randy ther Master
 */
public class ChangePaceView extends View{      
    

        public ChangePaceView(String text) {
           super (
           "==========The Oregon Trail=========="
        +"\nYou can change pace as follows: \n"
        + text
        +"\nC. Continue the game"
        +"\n-----What is your choice?"
        +"\n===================================="
           );
        }

    @Override
    public boolean doAction(String value){
        
        //Set as first element and uppercase it
        value = value.toUpperCase();
        
        int paceTest;
        try{
            paceTest = Integer.parseInt(value);
        }
        catch (NumberFormatException e){
            System.out.println("Your input was not valid: " + e.getMessage());
            return false;
        }
        
        switch(value){
            case "1":
                this.changePaceSteady();
                break;
                
            case "2":
                this.changePaceStrenuous();
                break;
                
            case "3":
                this.changePaceGruelling();
                break;    
                
            case "C":
                this.continueGame();
                break;
                
            default:
              System.out.println("Invalid menu item");
        }
        
        return false;
    }

    private void continueGame() {
        //Go back to main menu
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.display();
    }

    //I get these errors when I remove the "return 1" in Status control class and change the method to void:
        private void changePaceSteady() {
            int success = StatusControl.changePace(PaceType.Steady);
            //TODO: need to return error here
            System.out.println("The pace has been changed to steady");  
        }

        private void changePaceStrenuous() {
            int success = StatusControl.changePace(PaceType.Strenuous);
            //TODO: need to return error here
            System.out.println("The pace has been changed to strenuous"); 
        }

        private void changePaceGruelling() {
            int success = StatusControl.changePace(PaceType.Gruelling);
            //TODO: need to return error here
            System.out.println("The pace has been changed to gruelling");      
        }
    
   }
