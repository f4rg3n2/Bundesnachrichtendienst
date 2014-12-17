package de.hs_ma.tpews14.ib9.Iterable;

import java.util.Iterator;
import java.util.LinkedList;

import de.hs_ma.tpews14.ib9.Crypter.Crypter;
import de.hs_ma.tpews14.ib9.Exception.CrypterException;

class IterableCrypter implements Iterable<String> {
	Iterable<String> liste1;
	Crypter verschluesselungsart;
	IterableCrypter iterableCrypter;
	LinkedList<String> liste2 = new LinkedList<>();

	/**
	 * Initialisiert eine Liste und die Verschluesselungsart,
	 * wie die Liste entschluesselt werden soll.
	 * 
	 * @param liste
	 * @param verschluesselungsart
	 */
	public IterableCrypter(Iterable<String> liste, Crypter verschluesselungsart) {
		this.liste1 = liste;
		this.verschluesselungsart = verschluesselungsart;

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
					return verschluesselungsart.encrypt(it.next());
				} catch (CrypterException e) {
					e.printStackTrace();
					return null;
				}
			}
		};

	}

}
