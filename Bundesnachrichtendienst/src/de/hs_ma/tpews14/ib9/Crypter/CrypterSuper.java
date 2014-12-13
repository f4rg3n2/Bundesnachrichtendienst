package de.hs_ma.tpews14.ib9.Crypter;

import java.util.LinkedList;
import java.util.List;

public abstract class CrypterSuper implements Crypter {

	@Override
	public abstract String encrypt(String message) throws CrypterException;

	@Override
	public List<String> encrypt(List<String> messages) throws CrypterException {
		LinkedList<String> a = new LinkedList<>();
		for (String message : messages) {
			a.add(encrypt(message));
		}

		return a;
	}

	@Override
	public abstract String decrypt(String cypherText) throws CrypterException;

	@Override
	public List<String> decrypt(List<String> cypherTexte)
	        throws CrypterException {

		LinkedList<String> a = new LinkedList<>();
		for (String message : cypherTexte) {
			a.add(decrypt(message));
		}

		return a;
	}
	
	public String crypterHelp(String message){
		String mes;
		mes = message.replaceAll("[^a-zA-Z]", "").toUpperCase();
		return mes;
	}

}
