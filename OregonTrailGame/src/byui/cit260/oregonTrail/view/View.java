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
public abstract class View implements ViewInterface{
 
    protected String displayMessage;
    
    public View();{
    
}
    public View(String message) {
        this.displayMessage = message;
    }     

    @Override
    public void display (){
        boolean done = false;
        do{
            // prompt for and get players name
            String vale = this.getInput();
            if (value.toUpperCase().equals("Q")) // user wants to quit
                return; // exit the view
          //do the requested action and display the exit view
          done = this.doAction(value);
        }
        while (!done);
    }

    @Override
    public abstract String getInput();

    @Override
    public abstract void display();
    
   
    
}
