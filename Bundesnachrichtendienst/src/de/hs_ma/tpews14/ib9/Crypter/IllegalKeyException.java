package de.hs_ma.tpews14.ib9.Crypter;

public class IllegalKeyException extends CrypterException{

	public IllegalKeyException() {
	    super("Schl�ssel ist nihct g�ltig.");
    }
	public IllegalKeyException(String message){
		super(message);
	}
}
