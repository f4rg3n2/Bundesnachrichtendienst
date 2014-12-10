package de.hs_ma.tpews14.ib9.Crypter;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class IterableCrypter implements Iterable<String> {
	List liste;
	Crypter verschluesselungsart;
	IterableCrypter iterableCrypter;

	public IterableCrypter(List liste, Crypter verschluesselungsart) {
		this.liste = liste;
		this.verschluesselungsart = verschluesselungsart;
	}

	public IterableCrypter(IterableCrypter iterableCrypter,
	        Crypter verschluesselungsart) {
		this.verschluesselungsart = verschluesselungsart;
		this.iterableCrypter = iterableCrypter;
	}

	@Override
	public ListIterator<String> iterator() {
		return new ListIterator<String>() {

			private int pos = 0;
			private List list;

			
			@Override
			public boolean hasNext() {
				int i = 0;
				for (String string : iterableCrypter) {
					i++;
				}
				if (i > pos) {
					return true;
				} else {
					return false;
				}
			}

			@Override
			public String next() {
				return list.getItem(++pos);
			}
			
			@Override
            public void add(String item) {
	            list.add(item);
	            
            }

			@Override
            public boolean hasPrevious() {
				
	            return false;
            }

			@Override
            public int nextIndex() {
	          
	            return 0;
            }

			@Override
            public String previous() {
	            // TODO Auto-generated method stub
	            return null;
            }

			@Override
            public int previousIndex() {
	            // TODO Auto-generated method stub
	            return 0;
            }

			@Override
            public void set(String arg0) {
	            // TODO Auto-generated method stub
	            
            }

			@Override
            public void remove() {
				
	            
            }

		};

	}

}
