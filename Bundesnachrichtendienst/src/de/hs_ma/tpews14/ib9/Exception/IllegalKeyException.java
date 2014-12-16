package de.hs_ma.tpews14.ib9.Exception;


public class IllegalKeyException extends CrypterException{

	
    private static final long serialVersionUID = 1L;
    
	/**
	 * Wirft eine Fehlermeldung bei einem nichtgueltigen
	 * Schluessel.
	 */
	public IllegalKeyException() {
	    super("Schl�ssel ist nicht g�ltig.");
    }
	
	/**
	 * Gibt die uebergebene Nachricht als Fehlermeldung aus.
	 * 
	 * @param message
	 */
	public IllegalKeyException(String message){
		super(message);
	}
}
