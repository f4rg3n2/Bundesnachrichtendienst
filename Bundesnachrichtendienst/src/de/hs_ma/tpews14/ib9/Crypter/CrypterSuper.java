package de.hs_ma.tpews14.ib9.Crypter;

import java.util.LinkedList;
import java.util.List;

import de.hs_ma.tpews14.ib9.Exception.CrypterException;

/**
 * CrypterSuper ist eine SuperKlasse, die den anderen Verschluesselungsklassen
 * helfen soll, nichterlaubten Eingaben zu entfernen.
 * Auﬂerdem vermeiden wir durch diese Klasse Codedoppelung. 
 *
 */
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
	
	/**
	 * 
	 * 
	 * @param message
	 * @return die Nachricht nur in groﬂ Buchstaben und
	 *  ohne Nichterlaubte Buchstaben
	 */
	public String crypterHelp(String message){
		String mes;
		mes = message.replaceAll("[^a-zA-Z]", "").toUpperCase();
		return mes;
	}

}
