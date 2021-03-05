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
public class Insurance_EstimatorTest {
    
    public Insurance_EstimatorTest() {
    }

    @Test
    public void testInsuranceCost() {
        System.out.println("insuranceCost");
        int age = 33;
        double expResult = 465;
        double result = Insurance_Estimator.insuranceCost(age);
        assertEquals(expResult, result);
    }
    
}
