/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregonTrail.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Roller
 */
public class InventoryControlTest {
    
    public InventoryControlTest() {
    }

    /**
     * Test of calcInventoryValue method, of class InventoryControl.
     */
    @Test
    public void tesLocationMultiplierLowerBound() {
        System.out.println("calcInventoryValue");
        
        //Test case 1 - failing locationMultiplier
        System.out.println("\tTest case 1");
        
        //defining the input variables
        double locationMultiplier = 0.0;
        double sumInventoryBase = 238;
        
        double expResult = -1.0; //define expected output variable
        
        //calling method
        double result = InventoryControl.calcInventoryValue(locationMultiplier, sumInventoryBase);
        
        //testing to see if the result returned equals the expected result
        assertEquals(expResult, result, 0.0001);
    }
    
    @Test
    public void testSunInventoryBaseLowerBound(){
        
        //Test case 2 - failing sumInventoryBase
        System.out.println("\tTest case 2: Failing sumInventoryBase lower bound");
        
        //defining the input variables
        double locationMultiplier = 1.0;
        double sumInventoryBase = 236;
        
        double expResult = -1.0; //define expected output variable
        
        //calling method
        double result = InventoryControl.calcInventoryValue(locationMultiplier, sumInventoryBase);
        
        //testing to see if the result returned equals the expected result
        assertEquals(expResult, result, 0.0001);
    }
    
    @Test
    public void testCalcInventoryValueSuccess(){
        
        //Test case 3 - successful
        System.out.println("\tTest case 3");
        
        //defining the input variables
        double locationMultiplier = 2.3;
        double sumInventoryBase = 400;
        
        double expResult = 920.0; //define expected output variable
        
        //calling method
        double result = InventoryControl.calcInventoryValue(locationMultiplier, sumInventoryBase);
        
        //testing to see if the result returned equals the expected result
        assertEquals(expResult, result, 0.0001);
    }
    
}
