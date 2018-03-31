//I am still having trouble calling the thing I want, and I am not sure if it is how I learned or what, 
//but my intuition just seems to be wrong. So more work to do on this.
//Example: I really want to call sumInventoryBase from InventoryControl using something like 
//“InventoryControl.sumInventoryBase” and it would just give me the number. 
//Or better yet, just run calcInventoryValue using InventoryControl.calcInventoryValue 
//and the InventoryControl could automatically go out and pull in all the inputs it needs 
//from elsewhere using similar language. But that was not where we ended up at all.

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
public class LosingView extends View{
    
    public LosingView() {
    
        super (
        "\n====================================================="
        +"\n| *************** The Organ Trail  ***************" 
        +"\n======================================================"
        +"\n  ***********All wagon members have died***********"
        +"\n"
        +"\nRemaining locations in map:            XX"
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