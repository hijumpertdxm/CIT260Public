/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregonTrail.exceptions;

/**
 *
 * @author ayami
 */
public class StatusControlException extends Exception{

    public StatusControlException() {
    }

    public StatusControlException(String string) {
        super(string);
    }

    public StatusControlException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public StatusControlException(Throwable thrwbl) {
        super(thrwbl);
    }

    public StatusControlException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
}
