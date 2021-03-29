/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author heman
 */
public class LifeInsuranceCostTest {
    
    public LifeInsuranceCostTest() {
        
    }

    
    @org.junit.jupiter.api.Test
    public void testCalculateInsurance() throws Exception {
        System.out.println("calculateInsurance");
        int age = 33;
        double expResult = 465.0;
        double result = LifeInsuranceCost.calculateInsurance(age);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
      
    }
     @Test
    public void testThatExceptionThrown2() throws Exception {
        Exception exception = assertThrows(InvalidAgeException.class, () -> {
            LifeInsuranceCost.calculateInsurance(100000);
        });
    }
    
  
}
