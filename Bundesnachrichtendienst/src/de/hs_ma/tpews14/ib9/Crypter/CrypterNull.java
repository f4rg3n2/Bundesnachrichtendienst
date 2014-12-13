package de.hs_ma.tpews14.ib9.Crypter;

import java.util.List;

public class CrypterNull extends CrypterSuper {

	@Override
    public String encrypt(String message) throws CrypterException {
	    crypterHelp(message);
	    return message;
    }

	@Override
    public List<String> encrypt(List<String> messages)
            throws CrypterException {

	    return messages;
    }

	@Override
    public String decrypt(String cypherText) throws CrypterException {

	    return cypherText;
    }

	@Override
    public List<String> decrypt(List<String> cypherTexte)
            throws CrypterException {

	    return cypherTexte;
    }

}
