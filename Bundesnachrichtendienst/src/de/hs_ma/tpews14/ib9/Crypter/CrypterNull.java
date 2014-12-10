package de.hs_ma.tpews14.ib9.Crypter;

import java.util.LinkedList;

public class CrypterNull implements Crypter {

	@Override
    public String encrypt(String message) throws CrypterException {
	    char a[] = message.toCharArray();
	    String erg ="";
	    for (int i = 0; i < a.length; i++) {
	    	if (a[i] >= 65 && a[i] <= 90) {
	    		erg+=a[i];
	    	}
	        
        }
	    return erg;
    }

	@Override
    public LinkedList<String> encrypt(LinkedList<String> messages)
            throws CrypterException {

	    return messages;
    }

	@Override
    public String decrypt(String cypherText) throws CrypterException {

	    return cypherText;
    }

	@Override
    public LinkedList<String> decrypt(LinkedList<String> cypherTexte)
            throws CrypterException {

	    return cypherTexte;
    }

}
