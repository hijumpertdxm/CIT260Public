/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregonTrail.view;

/**
 *
 * @author ayami
 */
public class CheckSuppliesView extends View{
    
    public CheckSuppliesView() {
      
        super(
        "==========The Oregon Trail=========="
        +"\nThese are your current supplies:"
        +"\nOxen"
        +"\nFood"
        +"\nClothing"
        +"\nAmmunition"
        +"\nSpare Parts"
        +"\n"
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
    
}
