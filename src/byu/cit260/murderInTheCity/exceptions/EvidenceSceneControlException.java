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
public class EvidenceSceneControlException extends Exception {

    public EvidenceSceneControlException() {
    }

    public EvidenceSceneControlException(String string) {
        super(string);
    }

    public EvidenceSceneControlException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public EvidenceSceneControlException(Throwable thrwbl) {
        super(thrwbl);
    }

    public EvidenceSceneControlException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
    
}
