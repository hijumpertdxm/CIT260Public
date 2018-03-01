/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregonTrail.view;

import byui.cit260.oregonTrail.control.GameControl;
import java.util.Scanner;

/**
 *
 * @author Roller
 */
public class StopToRestView {
    
    public void displayStopToRestView() {
        //May need to call the other views to setup the game first
        boolean endView = false;
        do{
            this.getInputs();
            endView = doAction();
        }while(endView != true);
    }
    
    private void getInputs(){
        
        boolean valid = false;
        while(valid == false){
            
            System.out.println("=====================================================");
            System.out.println("Stopped to rest");
            System.out.println("=====================================================");
            System.out.println("Press enter to continue");
            System.out.println("=====================================================");

            Scanner scanner = new Scanner(System.in);
            
            //user string input
            String userInput = scanner.nextLine().trim();
            
            if(userInput.length() != 0){
                //Shouldn't be able to get here
                System.out.println("*** You must press enter to continue to continue. ***");
                continue;
            }
            
            valid = true;
        }
        
    }
    
    private boolean doAction(){
        
        //Calling this with a zero means stopping to rest
        GameControl.progressOneDay(0);
        
        return true;
    }
    
}
