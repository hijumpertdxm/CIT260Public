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
public class GameControlTest {
    
    public GameControlTest() {
    }

    /**
     * Test of calcScore method, of class GameControl.
     */
    @Test
    public void testCalcScoreSuccess() {
        System.out.println("calcScore");
        
        //Test Case - successful call
        System.out.println("\tTest Case 1: Successful call");
        
        //defining the input variables
        double inventoryValue = 250.0;
        double money = 20.0;
        int partyHealth = 2;
        int occupation = 2;
        int partyNotDead = 3;
        
        double expResult = 3240.0; //define expected output variable
        
        //calling method
        double result = GameControl.calcScore(inventoryValue, money, partyHealth, occupation, partyNotDead);
        
        //testing to see if the result returned equals the expected result
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testCalcScoreInventoryValueLowerBound() {
        //Test Case - successful call
        System.out.println("\tTest Case 2: InventoryValue lower bound failure");
        
        //defining the input variables
        double inventoryValue = 236.0;
        double money = 20.0;
        int partyHealth = 2;
        int occupation = 2;
        int partyNotDead = 3;
        
        double expResult = -1.0; //define expected output variable
        
        //calling method
        double result = GameControl.calcScore(inventoryValue, money, partyHealth, occupation, partyNotDead);
        
        //testing to see if the result returned equals the expected result
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testCalcScoreInventoryValueUpperBound() {
        //Test Case - successful call
        System.out.println("\tTest Case 3: InventoryValue upper bound failure");
        
        //defining the input variables
        double inventoryValue = 7051.0;
        double money = 20.0;
        int partyHealth = 2;
        int occupation = 2;
        int partyNotDead = 3;
        
        double expResult = -1.0; //define expected output variable
        
        //calling method
        double result = GameControl.calcScore(inventoryValue, money, partyHealth, occupation, partyNotDead);
        
        //testing to see if the result returned equals the expected result
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testCalcScoreMoneyLowerBound() {
        //Test Case - successful call
        System.out.println("\tTest Case 4: Money lower bound failure");
        
        //defining the input variables
        double inventoryValue = 240.0;
        double money = -1.0;
        int partyHealth = 2;
        int occupation = 2;
        int partyNotDead = 3;
        
        double expResult = -1.0; //define expected output variable
        
        //calling method
        double result = GameControl.calcScore(inventoryValue, money, partyHealth, occupation, partyNotDead);
        
        //testing to see if the result returned equals the expected result
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testCalcScoreMoneyUpperBound() {
        //Test Case - successful call
        System.out.println("\tTest Case 5: Money upper bound failure");
        
        //defining the input variables
        double inventoryValue = 240.0;
        double money = 1601.0;
        int partyHealth = 2;
        int occupation = 2;
        int partyNotDead = 3;
        
        double expResult = -1.0; //define expected output variable
        
        //calling method
        double result = GameControl.calcScore(inventoryValue, money, partyHealth, occupation, partyNotDead);
        
        //testing to see if the result returned equals the expected result
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testCalcScorePartyHealthLowerBound() {
        //Test Case - successful call
        System.out.println("\tTest Case 6: PartyHealth lower bound failure");
        
        //defining the input variables
        double inventoryValue = 240.0;
        double money = 500.0;
        int partyHealth = 0;
        int occupation = 2;
        int partyNotDead = 3;
        
        double expResult = -1.0; //define expected output variable
        
        //calling method
        double result = GameControl.calcScore(inventoryValue, money, partyHealth, occupation, partyNotDead);
        
        //testing to see if the result returned equals the expected result
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testCalcScorePartyHealthUpperBound() {
        //Test Case - successful call
        System.out.println("\tTest Case 7: PartyHealth upper bound failure");
        
        //defining the input variables
        double inventoryValue = 240.0;
        double money = 500.0;
        int partyHealth = 4;
        int occupation = 2;
        int partyNotDead = 3;
        
        double expResult = -1.0; //define expected output variable
        
        //calling method
        double result = GameControl.calcScore(inventoryValue, money, partyHealth, occupation, partyNotDead);
        
        //testing to see if the result returned equals the expected result
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testCalcScoreOccupationLowerBound() {
        //Test Case - successful call
        System.out.println("\tTest Case 8: Occupation lower bound failure");
        
        //defining the input variables
        double inventoryValue = 240.0;
        double money = 500.0;
        int partyHealth = 2;
        int occupation = 0;
        int partyNotDead = 3;
        
        double expResult = -1.0; //define expected output variable
        
        //calling method
        double result = GameControl.calcScore(inventoryValue, money, partyHealth, occupation, partyNotDead);
        
        //testing to see if the result returned equals the expected result
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testCalcScoreOccupationUpperBound() {
        //Test Case - successful call
        System.out.println("\tTest Case 9: Occupation upper bound failure");
        
        //defining the input variables
        double inventoryValue = 240.0;
        double money = 500.0;
        int partyHealth = 2;
        int occupation = 4;
        int partyNotDead = 3;
        
        double expResult = -1.0; //define expected output variable
        
        //calling method
        double result = GameControl.calcScore(inventoryValue, money, partyHealth, occupation, partyNotDead);
        
        //testing to see if the result returned equals the expected result
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testCalcScorePartyNotDeadLowerBound() {
        //Test Case - successful call
        System.out.println("\tTest Case 10: PartyNotDead lower bound failure");
        
        //defining the input variables
        double inventoryValue = 240.0;
        double money = 500.0;
        int partyHealth = 2;
        int occupation = 2;
        int partyNotDead = 0;
        
        double expResult = -1.0; //define expected output variable
        
        //calling method
        double result = GameControl.calcScore(inventoryValue, money, partyHealth, occupation, partyNotDead);
        
        //testing to see if the result returned equals the expected result
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testCalcScorePartyNotDeadUpperBound() {
        //Test Case - successful call
        System.out.println("\tTest Case 11: PartyNotDead upper bound failure");
        
        //defining the input variables
        double inventoryValue = 240.0;
        double money = 500.0;
        int partyHealth = 2;
        int occupation = 2;
        int partyNotDead = 6;
        
        double expResult = -1.0; //define expected output variable
        
        //calling method
        double result = GameControl.calcScore(inventoryValue, money, partyHealth, occupation, partyNotDead);
        
        //testing to see if the result returned equals the expected result
        assertEquals(expResult, result, 0.0);
    }
    
}
