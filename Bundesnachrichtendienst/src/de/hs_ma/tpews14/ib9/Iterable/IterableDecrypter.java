package de.hs_ma.tpews14.ib9.Iterable;

import java.util.Iterator;
import java.util.LinkedList;

import de.hs_ma.tpews14.ib9.Crypter.Crypter;
import de.hs_ma.tpews14.ib9.Exception.CrypterException;

public class IterableDecrypter implements Iterable<String> {

	Iterable<String> liste1;
	Crypter entschluesselungsart;
	IterableCrypter iterableCrypter;
	LinkedList<String> liste2 = new LinkedList<>();

	/**
	 * Initialisiert eine Liste und eine Entschluesselungsart,
	 * wie die uebergebene Liste entschluesselt werden soll.
	 * 
	 * @param liste
	 * @param entschluesselungsart
	 */
	public IterableDecrypter(Iterable<String> liste,
	        Crypter entschluesselungsart) {
		this.liste1 = liste;
		this.entschluesselungsart = entschluesselungsart;

	}

	@Override
	public Iterator<String> iterator() {
		return new Iterator<String>() {
			private Iterator<String> it = liste1.iterator();

			@Override
			public boolean hasNext() {
				return it.hasNext();
			}

			@Override
			public String next() {
				try {
					return entschluesselungsart.decrypt(it.next());
				} catch (CrypterException e) {
					e.printStackTrace();
					return null;
				}
			}
		};

	}

}