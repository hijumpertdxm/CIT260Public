/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregonTrail.view;

import byui.cit260.oregonTrail.control.GameControl;


/**
 *
 * @author Roller
 */
public class StopToRestView extends View{
    
    public StopToRestView(){
            
            super (
            "====================================================="
            +"\nStopped to rest"
            +"\n====================================================="
            +"\nPress enter to continue"
            +"\n====================================================="
            );
    }
  @Override
    
    public boolean doAction(String Value){
        
        //Calling this with a zero means stopping to rest
        
        // TODO : game variables need to be setup before this happens
        //GameControl.progressOneDay(0);
        
        return true;
    }

      
}
