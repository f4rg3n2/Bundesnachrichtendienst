package de.hs_ma.tpews14.ib9.Crypter;

import java.util.LinkedList;

public class CrypterXOR implements Crypter {

	private String key;
	private char[] klartextBuchstaben = { 'A', 'B', 'C', 'D', 'E', 'F', 'G',
	        'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
	        'U', 'V', 'W', 'X', 'Y', 'Z' };
	private char[] schluesselBuchstaben = { '@', 'A', 'B', 'C', 'D', 'E', 'F',
	        'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S',
	        'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '[','/' ,']', '^', '_' };

	public CrypterXOR(String key) {
		this.key = key;
	}

	@Override
	public String encrypt(String message) throws CrypterException {
		char[] k = key.toCharArray();
		String msg = message.toUpperCase();// klappt
		char[] a = msg.toCharArray();
		String erg = "";
		int v=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < klartextBuchstaben.length; j++) {
				if (a[i] == klartextBuchstaben[j]) {
//					for (int v = 0; v < k.length; v++) {
						for (int l = 0; l < klartextBuchstaben.length; l++) {
							if (k[v] == klartextBuchstaben[l]) {
								erg += klartextBuchstaben[j^++l];
							}
						}
					}
				}
			}
		
		return erg;
	}

	@Override
	public LinkedList<String> encrypt(LinkedList<String> messages)
	        throws CrypterException {
		LinkedList<String> a = new LinkedList<>();
		for (String message : messages) {
			a.add(encrypt(message));
        }
		
		return a;

	}

	@Override
	public String decrypt(String cypherText) throws CrypterException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LinkedList<String> decrypt(LinkedList<String> cypherTexte)
	        throws CrypterException {
		// TODO Auto-generated method stub
		return null;
	}

}
