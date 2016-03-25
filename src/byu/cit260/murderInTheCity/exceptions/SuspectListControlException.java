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
public class SuspectListControlException extends Exception {

    public SuspectListControlException() {
    }

    public SuspectListControlException(String string) {
        super(string);
    }

    public SuspectListControlException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public SuspectListControlException(Throwable thrwbl) {
        super(thrwbl);
    }

    public SuspectListControlException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
    
}
