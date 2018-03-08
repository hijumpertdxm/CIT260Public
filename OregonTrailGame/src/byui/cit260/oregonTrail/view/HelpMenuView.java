/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregonTrail.view;

/**
 *
 * @author Roller
 */
public class HelpMenuView extends View {
    public HelpMenuView (){  
        super(
        "\n====================================================="
        +"\n| Help Menu"       
        +"\n====================================================="
        +"\nG - What is the goal of the game?"
        +"\nM - How to move"
        +"\nR - Getting resources"
        +"\nQ - Quit" 
        +"\n====================================================="
        );
    }
    @Override
    public boolean doAction(String value){
        
        //Set as first element and uppercase it
        value = value.toUpperCase();
        
        switch(value){
            case "G":
                this.getGoalOfGame();
                break;
                
            case "M":
                this.getHowToMove();
                break;
                
            case "R":
                this.getGettingResources();
                break;
                
            default:
              System.out.println("Invalid menu item");
        }
        
        return false;
    }

    private void getGoalOfGame() {
        System.out.println("The goal of the game is to reach the end of the trail with as many party members alive and as much inventory as possible.\n");
    }

    private void getGettingResources() {
        System.out.println("While out on the trail you can hunt and get food. Otherwise you should buy all of your supplies at the beginning of the game.\n");
    }

    private void getHowToMove() {
        System.out.println("Each new day you move X amount of miles based on the pace that you set.\n");
    }
    
}
