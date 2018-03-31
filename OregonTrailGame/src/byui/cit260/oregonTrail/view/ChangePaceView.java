/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregonTrail.view;

import byui.cit260.oregonTrail.control.StatusControl;
import byui.cit260.oregonTrail.exceptions.StatusControlException;
import byui.cit260.oregonTrail.model.PaceType;
import java.util.logging.Level;
import java.util.logging.Logger;


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
        +"\n4. Continue the game"
        +"\n-----What is your choice?"
        +"\n===================================="
           );
        }

    @Override
    public boolean doAction(String value){
        
        //Set as first element and uppercase it
        value = value.toUpperCase();
        
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
                this.changePaceSteady();
                break;
                
            case 2:
                this.changePaceStrenuous();
                break;
                
            case 3:
                this.changePaceGruelling();
                break;    
                
            case 4:
                this.continueGame();
                break;
                
            default:
              ErrorView.display(this.getClass().getName(), "Invalid menu item");
        }
        
        return false;
    }

    private void continueGame() {
        //Go back to main menu
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.display();
    }

        private void changePaceSteady() {
            try {
                StatusControl.changePace(PaceType.Steady);
            } catch (StatusControlException ex) {
                ErrorView.display(this.getClass().getName(), ex.getMessage());
            }
            ErrorView.display(this.getClass().getName(), "The pace has been changed to steady");
        }

        private void changePaceStrenuous() {
            try {
                StatusControl.changePace(PaceType.Strenuous);
            } catch (StatusControlException ex) {
                ErrorView.display(this.getClass().getName(), ex.getMessage());
            }
            ErrorView.display(this.getClass().getName(), "The pace has been changed to strenuous");
        }

        private void changePaceGruelling() {
            try {
                StatusControl.changePace(PaceType.Gruelling);
            } catch (StatusControlException ex) {
                ErrorView.display(this.getClass().getName(), ex.getMessage());
            }
            ErrorView.display(this.getClass().getName(), "The pace has been changed to gruelling");   
        }
    
   }
