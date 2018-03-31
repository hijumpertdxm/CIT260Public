/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregonTrail.view;

import byui.cit260.oregonTrail.control.PlayerControl;
import byui.cit260.oregonTrail.exceptions.PlayerControlException;
import byui.cit260.oregonTrail.model.OccupationType;

/**
 *
 * @author SysAdmin
 */
public class ChooseOccupationView extends View {
    
    public ChooseOccupationView() {
            
            super("\n"
                + "\n====================================================="
                + "\n| Choose an Occupation"
                + "\n====================================================="
                + "\n1 - Banker"
                + "\n2 - Carpenter"
                + "\n3 - Farmer"
                + "\n4 - Dragon" //Not real, and should be taken out, only for testing purposes
                + "\nQ - Quit"
                + "\n=====================================================");
        }
   
    @Override
    public boolean doAction(String value){
        //Set as first element and uppercase it
        value = value.toUpperCase();
        
        //Convert to Number
        int num;
        try{
            num = Integer.parseInt(value);
        }
        catch (NumberFormatException e){
            ErrorView.display(this.getClass().getName(), "Your input was not valid: " + e.getMessage());
            return false;
        }
        
        switch(num){
            case 1:
                this.setOccupation(OccupationType.Banker.ordinal() + 1);
                break;
                
            case 2:
                this.setOccupation(OccupationType.Carpenter.ordinal() + 1);
                break;
                
            case 3:
                this.setOccupation(OccupationType.Farmer.ordinal() + 1);
                break;
                
            case 4:
                this.setOccupation(4);
                break;
                
            default:
              ErrorView.display(this.getClass().getName(), "Invalid menu item");
        }
        
        return true;
    }

    private void setOccupation(int occupation) {
        try{
            PlayerControl.playerOccupation(occupation);
        }
        catch (PlayerControlException e){
            ErrorView.display(this.getClass().getName(), e.getMessage());
        }
    }
}
