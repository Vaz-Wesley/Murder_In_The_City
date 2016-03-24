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
public class CasesControlException extends Exception {

    public CasesControlException() {
    }

    public CasesControlException(String string) {
        super(string);
    }

    public CasesControlException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public CasesControlException(Throwable thrwbl) {
        super(thrwbl);
    }

    public CasesControlException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
}
