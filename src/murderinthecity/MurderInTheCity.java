/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package murderinthecity;

import byu.cit260.murderInTheCity.model.Game;
import byu.cit260.murderInTheCity.model.Player;
import byu.cit260.murderInTheCity.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author Wady Tupiza and Wesley Vaz
 */
public class MurderInTheCity  {
    
    private static Game currentGame = null;
    private static Player player = null;
    
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    
    private static PrintWriter logFile = null;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try{
            
            //open character stream file for end user input and output
            MurderInTheCity.inFile = 
                    new BufferedReader(new InputStreamReader(System.in));

            MurderInTheCity.outFile = new PrintWriter(System.out, true);
            
            //open log file
            String filePath = "log.txt";
            MurderInTheCity.logFile = new PrintWriter(filePath);

            //create StartProgramView and start the program
            StartProgramView startProgramView = new StartProgramView();
            startProgramView.displayStartProgramView();
            return;
        
        } catch (Throwable e) {
            System.out.println("Exception: " + e.toString() +
                               "\nCause: " + e.getCause() +
                               "\nMessage: " + e.getMessage());
            
            e.printStackTrace();;
        
        }
        finally {
            try {
                
                if (MurderInTheCity.inFile != null)
                    MurderInTheCity.inFile.close();
                
                if (MurderInTheCity.outFile != null)
                    MurderInTheCity.outFile.close();
                
                if (MurderInTheCity.logFile != null)
                    MurderInTheCity.logFile.close();
                
            } catch (IOException ex) {
                System.out.println("Error Closing Files");
                return;
            }
        }
    }
    
    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        MurderInTheCity.currentGame = currentGame;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        MurderInTheCity.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        MurderInTheCity.inFile = inFile;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        MurderInTheCity.player = player;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        MurderInTheCity.logFile = logFile;
    }
    
    
         
}
    
