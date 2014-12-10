package de.hs_ma.tpews14.ib9.Crypter;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class OurIterator implements Iterator<String> {
	private int pos =0;
	private List list;
public OurIterator(List list) {
	this.list = list;
}
	@Override
    public boolean hasNext() {
	   if (list.){
	    return true;
	   }else{
	    	return false;
	    }
    }

	@Override
    public String next() {
	    return list.
    }

	public void remove(int index){
		list.remove(index);
	}
}
