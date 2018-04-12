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
public class MattGeneralStoreView extends  View{
    
    public MattGeneralStoreView() {
        
        printWriter.println(
        "\n====================================================="
        +"\n ***** The Oregon Trail - Matt's General Store *****" 
        +"\n======================================================"
        +"\n *****   Please select something to purchase   *****"
        +"\n"
//        printWriter.println("Item\t\tPrice\t\tTotal");
//        for(Inventory i : inventory) {
//           printWriter.println(iNumberforkeyboardentry + "\t\t" i.getName() + "\t\t" + i.currentPrice());
//      }
        +"\n       Total Bill                                $0  "
        +"\n       Total Funds                               $800"
        +"\n       Total Remaining                           $800"
        +"\nC Continue the game                                  "       
        +"\n ---- What is you choice?                            "           
        );     
    }
  @Override
    public boolean doAction(String value){  
        //Set as first element and uppercase it
        value = value.toUpperCase();
        
        switch(value){
            case "1":
                this.getOxen();
                break;
            case "2":
                this.getWheels();
                break;
                
            case "3":
                this.getAxles();
                break;
                
            case "4":
                this.getTongues();
                break;
                
            case "5":
                this.getClothes();
                break;
                
            case "6":
                this.getAmmunition();
                break;
                
            case "7":
                this.getFood();
                break;
                
            case "C":
                this.getContinue();
                break;
                
            default:
              ErrorView.display(this.getClass().getName(), "Invalid menu item");
        }   
        return false;
        }    

    private void getOxen() {
        System.out.println("You have selected Oxen");
    }

    private void getWheels() {
        System.out.println("You have selected Wheels");
    }

    private void getAxles() {
        System.out.println("You have selected Axles");
    }

    private void getTongues() {
        System.out.println("You have selected Tongues");
    }
    
    private void getClothes() {
       System.out.println("You have selected Clothing");
    }

    private void getAmmunition() {
        System.out.println("You have selected Ammunition"); }
    
    private void getFood() {
       System.out.println("You have selected Food");
    }    

    private void getContinue() {
        System.out.println("continueTrail() was called from the game menu");
    }
}    