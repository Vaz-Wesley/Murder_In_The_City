/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.murderInTheCity.exceptions;

/**
 *
 * @author Wesley Vaz_2
 */
public class PiecesOfEvidenceControlException extends Exception {

    public PiecesOfEvidenceControlException() {
    }

    public PiecesOfEvidenceControlException(String string) {
        super(string);
    }

    public PiecesOfEvidenceControlException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public PiecesOfEvidenceControlException(Throwable thrwbl) {
        super(thrwbl);
    }

    public PiecesOfEvidenceControlException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
    
}
