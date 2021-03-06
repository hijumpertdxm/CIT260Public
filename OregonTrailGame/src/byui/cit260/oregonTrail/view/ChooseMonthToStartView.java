/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregonTrail.view;

import byui.cit260.oregonTrail.control.GameControl;


/**
 *
 * @author Randy ther Master
 */
public class ChooseMonthToStartView extends View{

    
    public ChooseMonthToStartView () {
        super(
         "====================================================="
        +"\nChoose a month to begin your journ"
        +"\n====================================================="
        +"\n1 - March"
        +"\n2 - April"
        +"\n3 - May"
        +"\n4 - June"
        +"\n5 - July"
        +"\n6 - When Should I leave?"
        +"\n====================================================="
            );
 
    }
    @Override
    public boolean doAction(String value){
        
        //Set as first element and uppercase it
        value = value.toUpperCase();
        
        switch(value){
            case "1":
                this.March();
                break;
                
            case "2":
                this.April();
                break;
                
            case "3":
                this.May();
                break;
                
            case "4":
                this.June();
                break;
            case "5":
                this.July();
                break;  
                
             case "6":
                this.leave();
                break;
                
            case "E":
                return true;
                
            default:
              ErrorView.display(this.getClass().getName(), "Invalid month");
        }
        
        return false;
    }

    
    private void March() {
       System.out.println("You have selected the month of March");
    }    
    private void April() {
       System.out.println("You have selected the month of April");
    }

    private void May() {
       System.out.println("You have selected the month of May");
    }
    private void June() {
       System.out.println("You have selected the month of June");
    }
    private void July() {
     System.out.println("You have selected the month of July");   
    }
     private void leave() {
        System.out.println("You have selected when should I leave");
    }
}