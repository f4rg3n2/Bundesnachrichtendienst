package de.hs_ma.tpews14.ib9.Crypter;

import java.util.ArrayList;
import java.util.LinkedList;

public class CrypterCaesar implements Crypter {
	
	private int key;
	
	public CrypterCaesar(String key){
		this.key = Integer.parseInt(key);
	}

	@Override
	public String encrypt(String message) throws CrypterException {
		String tmp = message.toUpperCase();// klappt
		char[] a = tmp.toCharArray();
		String erg = "";
		for (int i = 0; i < a.length; i++) {
			if (a[i] >= 65 && a[i] <= 90) {
				//key = 50030423040200*0+1+1+1
				if (a[i] + 3 > 90) {
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

		return null;
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
