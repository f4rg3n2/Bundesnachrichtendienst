package de.hs_ma.tpews14.ib9.Crypter;

public class IllegalKeyException extends CrypterException{

	public IllegalKeyException() {
	    super("Schlüssel ist nihct gültig.");
    }
	public IllegalKeyException(String message){
		super(message);
	}
}
