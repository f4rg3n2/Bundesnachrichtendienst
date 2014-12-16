package de.hs_ma.tpews14.ib9.Crypter;

public class CrypterException extends Exception {

	
    private static final long serialVersionUID = 1L;
    
    /**
     * Gibt eine Fehlermeldung das beim Verschluesselungsverfahren 
     * ein Fehler aufgetreten ist.
     */
    public CrypterException() {
	   super("Verschlüsselung ist fehlgeschlagen.");
    }
    
    /**
     * Gibt die uebergebene Nachricht als Fehlermeldung aus.
     * 
     * @param message
     */
    public CrypterException(String message) {
	    super(message);
    }

}
