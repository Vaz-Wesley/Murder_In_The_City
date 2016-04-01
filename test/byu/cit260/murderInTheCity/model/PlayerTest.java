/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.murderInTheCity.model;

import java.io.PrintWriter;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Wady Tupiza
 */
public class PlayerTest {
    
    protected final PrintWriter console = murderinthecity.MurderInTheCity.getOutFile();

    
    public PlayerTest() {
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

    /**
     * Test of getPlayerName method, of class Player.
     */
    @Test
    public void testGetPlayerName() {
        this.console.println("getPlayerName");
        Player instance = new Player();
        String expResult = "";
        String result = instance.getPlayerName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPlayerName method, of class Player.
     */
    @Test
    public void testSetPlayerName() {
        this.console.println("setPlayerName");
        String playerName = "";
        Player instance = new Player();
        instance.setPlayerName(playerName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPlayerRankTitle method, of class Player.
     */
    @Test
    public void testGetPlayerRankTitle() {
        this.console.println("getPlayerRankTitle");
        Player instance = new Player();
        String expResult = "";
        String result = instance.getPlayerRankTitle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPlayerRankTitle method, of class Player.
     */
    @Test
    public void testSetPlayerRankTitle() {
        this.console.println("setPlayerRankTitle");
        String playerRankTitle = "";
        Player instance = new Player();
        instance.setPlayerRankTitle(playerRankTitle);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPlayerProgress method, of class Player.
     */
    @Test
    public void testGetPlayerProgress() {
        this.console.println("getPlayerProgress");
        Player instance = new Player();
        double expResult = 0.0;
        double result = instance.getPlayerProgress();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPlayerProgress method, of class Player.
     */
    @Test
    public void testSetPlayerProgress() {
        this.console.println("setPlayerProgress");
        double playerProgress = 0.0;
        Player instance = new Player();
        instance.setPlayerProgress(playerProgress);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Player.
     */
    @Test
    public void testHashCode() {
        this.console.println("hashCode");
        Player instance = new Player();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Player.
     */
    @Test
    public void testToString() {
        this.console.println("toString");
        Player instance = new Player();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Player.
     */
    @Test
    public void testEquals() {
        this.console.println("equals");
        Object obj = null;
        Player instance = new Player();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
