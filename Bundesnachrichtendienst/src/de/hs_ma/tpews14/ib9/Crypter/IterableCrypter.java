package de.hs_ma.tpews14.ib9.Crypter;

import java.util.Iterator;
import java.util.LinkedList;

public class IterableCrypter implements Iterable<String> {
	Iterable<String> liste1;
	Crypter verschluesselungsart;
	IterableCrypter iterableCrypter;
	LinkedList<String> liste2 = new LinkedList<>();

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
