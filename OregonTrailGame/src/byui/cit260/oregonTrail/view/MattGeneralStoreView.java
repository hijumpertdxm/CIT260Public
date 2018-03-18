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
        
        super (
        "\n====================================================="
        +"\n| ***** The Organ Trail - Matt's General Store *****" 
        +"\n======================================================"
        +"\n  Items Name         Price        Quantity       Total"
        +"\n1. Oxen              $XX            0            $0  "
        +"\n2. Food (1 Puond)    $XX            0            $0  "
        +"\n3. Clothing          $XX            0            $0  "
        +"\n4. Ammunition        $XX            0            $0  "
        +"\n5. Spare Parts       $XX            0            $0  "
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
                this.getFood();
                break;
                
            case "3":
                this.getClothing();
                break;
                
            case "4":
                this.getAmmunition();
                break;
                
            case "5":
                this.getSpareParts();
                break;
                
            case "C":
                this.getContinue();
                break;
                
            default:
              System.out.println("Invalid Store item");
        }   
        return false;
        }    

    private void getOxen() {
        System.out.println("You have selected Oxen");
    }

    private void getFood() {
       System.out.println("You have selected Food");
    }

    private void getClothing() {
       System.out.println("You have selected Clothing");
    }

    private void getAmmunition() {
        System.out.println("You have selected Ammunition"); }

    private void getSpareParts() {
        System.out.println("You have selected Spare Parts");
    }

    private void getContinue() {
        System.out.println("continueTrail() was called from the game menu");
    }
        
}    
            
                
  
