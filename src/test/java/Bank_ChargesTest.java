/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author amaro
 */
public class Bank_ChargesTest {
    
    public Bank_ChargesTest() {
    }

    @Test
    public void testCheckCost() {
        System.out.println("checkCost");
        int amount = 11;
        double expResult = 11.1;
        double result = Bank_Charges.checkCost(amount);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCheckCost2() {
        System.out.println("checkCost");
        int amount = 30;
        double expResult = 12.4;
        double result = Bank_Charges.checkCost(amount);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCheckCost3() {
        System.out.println("checkCost");
        int amount = 50;
        double expResult = 13;
        double result = Bank_Charges.checkCost(amount);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCheckCost4() {
        System.out.println("checkCost");
        int amount = 90;
        double expResult = 13.6;
        double result = Bank_Charges.checkCost(amount);
        assertEquals(expResult, result);
    }
    
}
