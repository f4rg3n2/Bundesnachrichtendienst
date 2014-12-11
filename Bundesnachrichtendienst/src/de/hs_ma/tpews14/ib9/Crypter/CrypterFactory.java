package de.hs_ma.tpews14.ib9.Crypter;


import de.hs_ma.tpews14.ib9.Crypter.CrypterType;

public class CrypterFactory {
	
	

	public static Crypter createCrypter(String key, CrypterType v)
	        throws IllegalKeyException {
		switch (v) {
		case CAESAR:
			return new CrypterCaesar(key);

		case SUBSTITUTION:
			return new CrypterSubstitution();

		case REVERSE:
			return new CrypterReverse();

		case XOR:
			return new CrypterXOR(key);

		case NULL:
			return new CrypterNull();
		default:
			return null;
		}
	}

}
