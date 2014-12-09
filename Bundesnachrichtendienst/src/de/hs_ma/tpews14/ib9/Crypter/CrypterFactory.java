package de.hs_ma.tpews14.ib9.Crypter;

public class CrypterFactory {
	public enum Verschluesselungen{CAESAR, SUBSTITUTION, REVERSE, XOR, NULL};
	
	public Crypter createCrypter(Verschluesselungen v, String key) throws IllegalKeyException{
		return null;
	}
	
}
