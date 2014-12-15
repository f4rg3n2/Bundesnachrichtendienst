package de.hs_ma.tpews14.ib9.Crypter;

import java.util.regex.Pattern;

import de.hs_ma.tpews14.ib9.Crypter.CrypterType;

public class CrypterFactory {

	public static Crypter createCrypter(String key, CrypterType v)
	        throws IllegalKeyException {
		switch (v) {
		case CAESAR:
			if (key.length() > 1 || key.charAt(0) < 65 || key.charAt(0) > 91) {
				throw new IllegalKeyException();
			}
			return new CrypterCaesar(key);

		case SUBSTITUTION:
			if (key.length() == 26 && key.matches("[A-Z]*")) {
				return new CrypterSubstitution(key);
			} else {
				throw new IllegalKeyException();
			}
		case REVERSE:
			return new CrypterReverse();

		case XOR:
			if (!key.matches("[A-Z]*")) {
				throw new IllegalKeyException();
			} 
			return new CrypterXOR(key);

		case NULL:
			return new CrypterNull();
		default:
			return null;
		}
	}

}
