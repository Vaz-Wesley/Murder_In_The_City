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
public class PoliceOfficeViewControlException extends Exception{

    public PoliceOfficeViewControlException() {
    }

    public PoliceOfficeViewControlException(String string) {
        super(string);
    }

    public PoliceOfficeViewControlException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public PoliceOfficeViewControlException(Throwable thrwbl) {
        super(thrwbl);
    }

    public PoliceOfficeViewControlException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
    
}
