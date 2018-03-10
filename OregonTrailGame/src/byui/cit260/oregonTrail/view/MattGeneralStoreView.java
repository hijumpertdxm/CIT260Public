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
                
            default:
              System.out.println("Invalid Store item");
        }   
        return false;
        }    

    private void getOxen() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void getFood() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void getClothing() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void getAmmunition() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void getSpareParts() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
}    
            
                
  
