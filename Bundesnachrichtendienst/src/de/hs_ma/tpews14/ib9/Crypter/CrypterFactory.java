package de.hs_ma.tpews14.ib9.Crypter;

import java.util.LinkedList;

public class CrypterFactory {
	public enum Verschluesselungen {
		CAESAR, SUBSTITUTION, REVERSE, XOR, NULL
	};

	public static Crypter createCrypter(String key, Verschluesselungen v)
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
