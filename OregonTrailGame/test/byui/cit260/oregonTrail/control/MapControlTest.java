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
public class MapControlTest {
    
    public MapControlTest() {
    }

    /**
     * Test of calcRiverChance method, of class MapControl.
     */
    @Test
    public void testCalcRiverChanceSuccess() {
        System.out.println("calcRiverChance");
        
        //Test case - successful call
        System.out.println("\tTest Case 1: Successful call");
        
        //defining the input variables
        double depth = 20.0;
        double width = 100.0;
        int[] rainyDays = {0,1,0,0,1,0,1};
        
        double expResult = 45.0; //define expected output variable
        
        //calling method
        double result = MapControl.calcRiverChance(depth, width, rainyDays);
        
        //testing to see if the result returned equals the expected result
        assertEquals(expResult, result, 0.0);            
    }
    
    @Test
    public void testCalcRiverChanceDepthLowerBound() {
        //Test case - Depth lower bound fail
        System.out.println("\tTest Case 2: Depth lower bound fail");
        
        //defining the input variables
        double depth = -1.0;
        double width = 100.0;
        int[] rainyDays = {0,1,0,0,1,0,1};
        
        double expResult = -1.0; //define expected output variable
        
        //calling method
        double result = MapControl.calcRiverChance(depth, width, rainyDays);
        
        //testing to see if the result returned equals the expected result
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testCalcRiverChanceDepthUpperBound() {
        //Test case - Depth upper bound fail
        System.out.println("\tTest Case 3: Depth upper bound fail");
        
        //defining the input variables
        double depth = 73.0;
        double width = 100.0;
        int[] rainyDays = {0,1,0,0,1,0,1};
        
        double expResult = -1.0; //define expected output variable
        
        //calling method
        double result = MapControl.calcRiverChance(depth, width, rainyDays);
        
        //testing to see if the result returned equals the expected result
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testCalcRiverChanceWidthLowerBound() {
        //Test case - Width lower bound fail
        System.out.println("\tTest Case 4: Width lower bound fail");
        
        //defining the input variables
        double depth = 10.0;
        double width = 19.0;
        int[] rainyDays = {0,1,0,0,1,0,1};
        
        double expResult = -1.0; //define expected output variable
        
        //calling method
        double result = MapControl.calcRiverChance(depth, width, rainyDays);
        
        //testing to see if the result returned equals the expected result
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testCalcRiverChanceWidthUpperBound() {
        //Test case - Width upper bound fail
        System.out.println("\tTest Case 5: Width upper bound fail");
        
        //defining the input variables
        double depth = 50.0;
        double width = 501.0;
        int[] rainyDays = {0,1,0,0,1,0,1};
        
        double expResult = -1.0; //define expected output variable
        
        //calling method
        double result = MapControl.calcRiverChance(depth, width, rainyDays);
        
        //testing to see if the result returned equals the expected result
        assertEquals(expResult, result, 0.0);
    }
}
