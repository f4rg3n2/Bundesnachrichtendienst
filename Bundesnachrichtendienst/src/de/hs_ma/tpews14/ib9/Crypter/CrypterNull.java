package de.hs_ma.tpews14.ib9.Crypter;

import java.util.List;

import de.hs_ma.tpews14.ib9.Exception.CrypterException;

class CrypterNull extends CrypterSuper {

	@Override
    public String encrypt(String message) throws CrypterException {
	   
	    return crypterHelp(message);
    }

	@Override
    public List<String> encrypt(List<String> messages)
            throws CrypterException {

	    return messages;
    }

	@Override
    public String decrypt(String cypherText) throws CrypterException {
		if (cypherText.matches("[A-Z]*")) {
	    return cypherText;
		}else{
			throw new CrypterException("NullCrypter hat einen fehler beim Entschluesseln.");
		}
    }

	@Override
    public List<String> decrypt(List<String> cypherTexte)
            throws CrypterException {

	    return cypherTexte;
    }

}
