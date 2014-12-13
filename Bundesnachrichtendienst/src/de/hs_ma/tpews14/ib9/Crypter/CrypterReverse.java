package de.hs_ma.tpews14.ib9.Crypter;

import java.util.LinkedList;
import java.util.List;

public class CrypterReverse extends CrypterSuper {

	@Override
	public String encrypt(String message) throws CrypterException {
		String mes = message;
		mes = message.toUpperCase();
		char[] a = mes.toCharArray();
		String erg = "";
		for (int i = a.length-1; i >= 0; i--) {
			if (a[i] >= 65 && a[i] <= 90) {
				erg += a[i];
			}
		}
		return erg;
	}

//	@Override
//	public List<String> encrypt(List<String> messages)
//	        throws CrypterException {
//		LinkedList<String> a = new LinkedList<>();
//		for (String message : messages) {
//			a.add(encrypt(message));
//        }
//		return a;
//	}

	@Override
	public String decrypt(String cypherText) throws CrypterException {
		String mes = cypherText;
		mes = cypherText.toUpperCase();
		char[] a = mes.toCharArray();
		String erg = "";
		for (int i = a.length-1; i >= 0; i--) {
			if (a[i] >= 65 && a[i] <= 90) {
				erg += a[i];
			}
		}
		return erg;
		
	}

//	@Override
//	public List<String> decrypt(List<String> cypherTexte)
//	        throws CrypterException {
//		LinkedList<String> a = new LinkedList<>();
//		for (String message : cypherTexte) {
//			a.add(encrypt(message));
//        }
//		
//		return a;
//	}

}
