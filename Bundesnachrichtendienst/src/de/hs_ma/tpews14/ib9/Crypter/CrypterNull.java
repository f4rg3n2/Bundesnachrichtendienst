package de.hs_ma.tpews14.ib9.Crypter;

import java.util.LinkedList;

public class CrypterNull implements Crypter {

	@Override
    public String encrypt(String message) throws CrypterException {
	    // TODO Auto-generated method stub
	    return message;
    }

	@Override
    public LinkedList<String> encrypt(LinkedList<String> messages)
            throws CrypterException {
	    // TODO Auto-generated method stub
	    return messages;
    }

	@Override
    public String decrypt(String cypherText) throws CrypterException {
	    // TODO Auto-generated method stub
	    return cypherText;
    }

	@Override
    public LinkedList<String> decrypt(LinkedList<String> cypherTexte)
            throws CrypterException {
	    // TODO Auto-generated method stub
	    return cypherTexte;
    }

}
