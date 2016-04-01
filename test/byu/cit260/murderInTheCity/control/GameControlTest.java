/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.murderInTheCity.control;

import byu.cit260.murderInTheCity.model.Player;
import java.io.PrintWriter;
import murderinthecity.MurderInTheCity;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Wady Tupiza
 */
public class GameControlTest {
    
    protected final PrintWriter console = MurderInTheCity.getOutFile();

    
    public GameControlTest() {
    }

    /**
     * Test of createPlayer method, of class GameControl.
     */
    @Test
    public void testCreatePlayer() {
        this.console.println("createPlayer");
        String name = "";
        Player expResult = null;
        Player result = GameControl.createPlayer(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
