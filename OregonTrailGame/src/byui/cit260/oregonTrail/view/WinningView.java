/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregonTrail.view;

import byui.cit260.oregonTrail.control.InventoryControl;
import byui.cit260.oregonTrail.exceptions.InventoryControlException;
import oregontrailgame.OregonTrailGame;

/**
 *
 * @author ayami
 */
public class WinningView extends View{
    
    public WinningView() throws InventoryControlException {
        
        super(
        "\n====================================================="
        +"\n| *************** The Oregon Trail  ***************" 
        +"\n======================================================"
        +"\n  ***************Congratulations!***************"
        +"\nYou have succesfully traveled"
        +"\nfrom Independence, Missouri to Oregon"
        +"\nFinal Results:"
        +"\nWagon Members Still Living:     "
        +"\nValue of Remaining Possessions: "+
                        InventoryControl.calcInventoryValue(OregonTrailGame.getCurrentGame().getMileMarker())
        +"\nTotal Remaining Cash:           "
        +"\n"
        +"\nProfession Bonus:               "
        +"\n"
        +"\nFinal Score:                    "    
        +"\n"
        +"\n N. Start a New Game"
        +"\n E. Exit the game"        
        +"\n ---- What is your choice?                            "           
        );
     
}
//Second part
@Override
    public boolean doAction(String value){  
        //Set as first element and uppercase it
        value = value.toUpperCase();
        
        switch(value){
            case "N":
                this.newGame();
                break;
            case "E":
                this.exitGame();
                break;
                
            default:
              System.out.println("Invalid menu item");
        }   
        return false;
        }    

    //Third part
private void newGame() {
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.display();
    }

    private void exitGame() {
        //Exit 
        System.exit(0);
    }
    
}  