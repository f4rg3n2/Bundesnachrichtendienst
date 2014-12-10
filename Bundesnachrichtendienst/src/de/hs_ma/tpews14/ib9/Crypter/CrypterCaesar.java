package de.hs_ma.tpews14.ib9.Crypter;

import java.util.ArrayList;
import java.util.LinkedList;

public class CrypterCaesar implements Crypter {

	public int key;

	public CrypterCaesar(String key) { // noch nicht sicher ober es ein regulärer
									 // BUCHSTABE ist
		this.key = key.charAt(0)-64;
	}

	@Override
	public String encrypt(String message) throws CrypterException {
		String tmp = message.toUpperCase();// klappt
		char[] a = tmp.toCharArray();
		String erg = "";
		for (int i = 0; i < a.length; i++) {
			if (a[i] >= 65 && a[i] <= 90) {
				// key = 50030423040200*0+1+1+1
				if (a[i] + key > 90) {
					erg += Character.toString((char) (a[i] + key - 90 + 64));
				} else {
					erg += Character.toString((char) (a[i] + key));
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
		String tmp = cypherText.toUpperCase();
		char[] a = tmp.toCharArray();
		String erg = "";
		for (int i = 0; i < a.length; i++) {
			if (a[i] - key < 65) {
				erg += Character.toString((char) (a[i] - key + 90 - 64));
			} else {
				erg += Character.toString((char) (a[i] - key));
			}
		}
		return erg;
	}

	@Override
	public LinkedList<String> decrypt(LinkedList<String> cypherTexte)
	        throws CrypterException {
		LinkedList<String> a = new LinkedList<>();
		for (String message : cypherTexte) {
			a.add(decrypt(message));
		}

		return a;
	}

}
