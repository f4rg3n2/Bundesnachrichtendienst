package de.hs_ma.tpews14.ib9.Crypter;

import de.hs_ma.tpews14.ib9.Exception.CrypterException;


public class CrypterSubstitution extends CrypterSuper {

	private char[] klartextBuchstaben = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
	private String key;
	

	/**
	 * Initialisiert einen Schluessel.
	 * 
	 * @param key
	 */
	public CrypterSubstitution(String key) {
		this.key = key;
	}

	@Override
	public String encrypt(String message) throws CrypterException {
		char[] schluesselBuchstaben = key.toCharArray();
		char[] a = crypterHelp(message).toCharArray();
		String erg= "";
		
		for (int i =0; i<a.length;i++) {
			for (int k = 0; k < klartextBuchstaben.length; k++) {
				 if(a[i]==klartextBuchstaben[k]){
			        	erg += schluesselBuchstaben[k];
			        }
            }
        }
		return erg;
	}

	@Override
	public String decrypt(String cypherText) throws CrypterException {
		if (cypherText.matches("[A-Z]*")) {
		char[] schluesselBuchstaben = key.toCharArray();
		char[] a = cypherText.toCharArray();
		String erg= "";
		
		for (int i =0; i<a.length;i++) {
			for (int k = 0; k < schluesselBuchstaben.length; k++) {
				 if(a[i]==schluesselBuchstaben[k]){
			        	erg += klartextBuchstaben[k];
			        }
            }
        }
		return erg;
	}else{
		throw new CrypterException("Substitution hat einen Fehler bei der Entschluesselung.");
	}
	}
}
