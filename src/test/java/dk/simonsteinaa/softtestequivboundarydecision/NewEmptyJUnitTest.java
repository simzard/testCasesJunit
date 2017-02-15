/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.simonsteinaa.softtestequivboundarydecision;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author simon
 */
public class NewEmptyJUnitTest {
    
    Account a = new Account(1000);
    
    public NewEmptyJUnitTest() {
    }
    
    
     /*******************************
      * Equivalence partition tests *
      ******************************/
    /*
    @Test
    // page 80-90
    // invalid
    public void amountLessThanZero() {
        assert(a.getInterest() == -50); 
        
    }
    
    @Test
    // 3%
    public void  amountBetweenZeroAndHundred() {
        assert(a.getInterest() == 50 );
    }
    
    @Test
    // 5%
    public void amountBetweenHundredAndNineHundredAndNinetyNine() {
        // need to change amount 
        // expected intere
        assert(a.getInterest() == 500 );
    }
    
    @Test
    // 7%
    public void amountGreaterOrEqualToAThousand() {
        assert(a.getInterest() == 50000);
    }
    
    /************************
     * Boundary Value Tests *
     ***********************/
    /*
    @Test
    // invalid
    public void amountIsExactlyZeroPointZeroOne() {
        assert(a.getInterest() == 0.01);
    }
    
    @Test
    // valid for 3%
    public void validForThreePercent() {
        assert(a.getInterest() == 0);
        assert(a.getInterest() == 100);
        
    }
    */
    @Test
    public void decisionTable() {
        Customer c = new Customer(true, true, true);
        assert(c.getResult() == -1);
        c = new Customer(true, true, false);
        assert(c.getResult() == -1);
        c = new Customer(true, false, true);
        assert(c.getResult() == 20);
        c = new Customer(true, false, false);
        assert(c.getResult() == 15);
        c = new Customer(false, true, true);
        assert(c.getResult() == 30);
        c = new Customer(false, true, false);
        assert(c.getResult() == 10);
        c = new Customer(false, false, true);
        assert(c.getResult() == 20);
        c = new Customer(false, false, false);
        assert(c.getResult() == 0);
        
        
    }
    
    
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
