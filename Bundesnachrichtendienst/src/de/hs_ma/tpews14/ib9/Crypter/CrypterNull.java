package de.hs_ma.tpews14.ib9.Crypter;

import java.util.List;

public class CrypterNull implements Crypter {

	@Override
    public String encrypt(String message) throws CrypterException {
	    return message = message.replaceAll("[^a-zA-Z]", "");
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
