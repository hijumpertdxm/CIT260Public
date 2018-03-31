/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregonTrail.view;

import java.io.BufferedReader;
import java.io.PrintWriter;
import oregontrailgame.OregonTrailGame;

/**
 *
 * @author Randy ther Master
 */
public abstract class View implements ViewInterface{
 
    protected String displayMessage;
    
    protected final BufferedReader keyboard = OregonTrailGame.getInFile();
    protected final PrintWriter console = OregonTrailGame.getOutFile();
    
    public View() {
  
}
    public View(String message) {
        this.displayMessage = message;
    }     

    @Override
    public void display (){
        boolean done = false;
        do{
            // prompt for and get players name
            String value = this.getInput();
            if (value.toUpperCase().equals("Q")) // user wants to quit
                return; // exit the view
          //do the requested action and display the exit view
          done = this.doAction(value);
        }
        while (!done); //exite the view when done == true
    }

    @Override
    public String getInput() {
        boolean valid = false;
        String value = null;
        try{
            //while a valid name has not bee retrieved
            while (!valid) {

                // prompt for the player's name
                this.console.println("\n" + this.displayMessage);

                // get the value entered from the keyboard
                value = this.keyboard.readLine();
                value = value.trim();

                if (value.length() < 1) { //blank value entered
                    this.console.println("\n*** You must enter a value *** ");
                    continue;
                }

                break;
            }
        }
        catch (Exception e){
            ErrorView.display(this.getClass().getName(), "Error reading the input: " + e.getMessage());
        }
        
        return value; //return the name
    }

}
