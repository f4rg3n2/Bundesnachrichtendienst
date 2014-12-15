package de.hs_ma.tpews14.ib9.Crypter;

public class CrypterException extends Exception {

	/**
	 * 
	 */
    private static final long serialVersionUID = 1L;
    
    public CrypterException() {
	   super("Verschlüsselung ist fehlgeschlagen.");
    }
    
    public CrypterException(String message) {
	    super(message);
    }

}
