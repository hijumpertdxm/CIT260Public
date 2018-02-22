/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregonTrail.view;
import java.util.Scanner;

/**
 *
 * @author SysAdmin
 */
public class StartProgramView {

    public StartProgramView() {
    }
    public void displayStartProgramView() {
        boolean endOfView = false;
        
        do{
            String[] inputs = this.getInputs();
            if((inputs.length < 1) || (inputs[0].toUpperCase().equals("Q"))){
                return;
            }
            endOfView = doAction(inputs);
        }while(endOfView != true);
    }
    
    private String[] getInputs(){
        
        String[] inputs = new String[1];
        
        boolean valid = false;
        while(valid == false){
            System.out.println("What do you want to enter? ");
            Scanner inString = new Scanner(System.in);
            
            //user string input
            String userInput = inString.nextLine().trim();
            
            if(userInput.length() < 1){
                System.out.println("You must enter a non-blank value");
                continue;
            }
            
            inputs[0] = userInput;
            valid = true;
        }
        
        return inputs;
    }
    
    private boolean doAction(String[] inputs){
        System.out.println("**** doAction() called ****");
        System.out.println("\tinputs = " + inputs[0]);
        
        return true;
    }
    
}
