/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregonTrail.view;


/**
 *
 * @author Randy ther Master
 */
public class ChangePaceView extends View{      
    

        public ChangePaceView() {
           super (
           "==========The Oregon Trail=========="
        +"\nYou can change pace as follows: \n"
        +"\n1. Staedy"
        +"\n2. Strenuou"
        +"\n3. Gruelling"
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

        private void changePaceSteady() {
          System.out.println("The pace has been changed to steady");  
        }

        private void changePaceStrenuous() {
           System.out.println("The pace has been changed to strenuous");
        }

        private void changePaceGruelling() {
         System.out.println("The pace has been changed to gruelling");      
        }
    
   }
