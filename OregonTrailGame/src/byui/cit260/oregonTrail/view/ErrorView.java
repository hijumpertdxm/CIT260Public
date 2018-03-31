/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregonTrail.view;

import java.io.PrintWriter;
import oregontrailgame.OregonTrailGame;

/**
 *
 * @author Roller
 */
public class ErrorView {
    
    private static PrintWriter console = OregonTrailGame.getOutFile();
    private static PrintWriter log = OregonTrailGame.getLogFile();
    
    public static void display(String className, String errorMessage){
        
        console.println(
                "\n--- ERROR ---------------------------------------------------------"
               +"\n" + errorMessage
               +"\n-------------------------------------------------------------------"
        );
        
        log.printf("%n%n%s", className + " - " + errorMessage);
    }
    
}
