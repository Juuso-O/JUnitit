
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.jamk.oo1k2014;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author juuso
 */
public class NoppaTest {
    
    private Noppa noppa;
    
    public NoppaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
         noppa = new Noppa();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of heitä method, of class Noppa.
     */
    @Test
    public void testHeitä() {
        System.out.println("heitä");
        int tulos = noppa.heitä();
        if (tulos > 0 && tulos < 7) {
            assertEquals(1,1);
            System.out.println("Heitosta saatiin järkevä tulos: " + tulos);
        } else {
            fail("Heitto antoi ei mahdollisen tuloksen: " + tulos);
        }
    }

    /**
     * Test of annaSilmät method, of class Noppa.
     */
    @Test
    public void testAnnaSilmät() {
        System.out.println("annaSilmät");
        final int expResult1 = 1;
        final int expResult2 = 2;
        final int expResult3 = 3;
        final int expResult4 = 4;
        final int expResult5 = 5;
        final int expResult6 = 6;
        int result = noppa.heitä();
        switch(result) {
            case expResult1:
                assertEquals(expResult1, result);
                break;
            case expResult2:
                assertEquals(expResult2, result);
                break;
            case expResult3:
                assertEquals(expResult3, result);
                break;
            case expResult4:
                assertEquals(expResult4, result);
                break;
            case expResult5:
                assertEquals(expResult5, result);
                break;
            case expResult6:
                assertEquals(expResult6, result);
                break;
            default:
                fail("Odottamaton nopanheittotulos: " + result);
                break;
        }
        System.out.println("Nopanheitto palautti oikean tuloksen väliltä 1-6: " + result);
    }

    /**
     * Test of getYkköset method, of class Noppa.
     */
    @Test
    public void testGetYkköset() {
        System.out.println("getYkköset");
        for(int i = 0; i < 100; i++) {
            noppa.heitä();
        }
        int expResultMin = 0;
        int expResultMax = 100;
        int result = Noppa.getYkköset();
        if (result > expResultMin && result < expResultMax) {
            assertEquals(result, result);
            System.out.println("100 heitolla ykkösiä tuli " + result);
        } else {
            fail("100 heitolla ykkösiä tuli alle 0 tai yli 100: " + result);
        }
    }

    /**
     * Test of getHeittokerrat method, of class Noppa.
     */
    @Test
    public void testGetHeittokerrat() {
        System.out.println("getHeittokerrat");
        int result = Noppa.getHeittokerrat();
        int expResult = result + 52;
        System.out.println("Heittokertoja nyt" + result);
        System.out.println("Suoritetaan 52 heittoa.");
        for (int i = 0; i < 52; i++) {
            noppa.heitä();
        }
        result = Noppa.getHeittokerrat();
        if (result == expResult) {
            assertEquals(expResult, result);
            System.out.println("52:n heiton jälkeen heittoja on: " + result);
        } else {
            fail("Heittojen määrä väärä. Piti olla 52, tällä hetkellä: " + result);
        }
    }
}

