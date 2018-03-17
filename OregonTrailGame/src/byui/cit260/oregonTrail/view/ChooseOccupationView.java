/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregonTrail.view;

import byui.cit260.oregonTrail.control.PlayerControl;

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
                + "\nB - Banker"
                + "\nC - Carpenter"
                + "\nF - Farmer"
                + "\nQ - Quit"
                + "\n=====================================================");
        }
   
    @Override
    public boolean doAction(String value){
        //Set as first element and uppercase it
        value = value.toUpperCase();
        
        switch(value){
            case "B":
                this.setOccupation(1);
                break;
                
            case "C":
                this.setOccupation(2);
                break;
                
            case "F":
                this.setOccupation(3);
                break;
                
            case "Q":
                return true;
                
            default:
              System.out.println("Invalid menu item");
        }
        
        return false;
    }

    private void setOccupation(int occupation) {
        PlayerControl.playerOccupation(occupation);
    }
}
