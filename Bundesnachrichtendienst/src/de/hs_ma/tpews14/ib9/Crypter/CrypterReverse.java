package de.hs_ma.tpews14.ib9.Crypter;

import de.hs_ma.tpews14.ib9.Exception.CrypterException;

public class CrypterReverse extends CrypterSuper {

	@Override
	public String encrypt(String message) throws CrypterException {
		StringBuffer b = new StringBuffer(crypterHelp(message));
		return b.reverse().toString();
	}

	@Override
	public String decrypt(String cypherText) throws CrypterException {
		if (cypherText.matches("[A-Z]*")) {
		return encrypt(cypherText);
		}else{
			throw new CrypterException("Reverse hat einen Fehler bei der Entschluesselung.");
		}
	}
}
