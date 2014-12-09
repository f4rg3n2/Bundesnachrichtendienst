package de.hs_ma.tpews14.ib9.Crypter;

import java.util.LinkedList;

public class JIUnit {

	public static void main(String[] args) throws CrypterException {
	    CrypterCaesar c = new CrypterCaesar('C');
	    LinkedList<String> l = new LinkedList<>(); 
	    l.add("AAAAaaaAAA!!");
	    l.add("BBbbbBBBbBBBB");
	    LinkedList<String> li = new LinkedList<>(); 
	    li.add("DDDD");
	    li.add("EEEE");
	    CrypterSubstitution cs = new CrypterSubstitution();
	    System.out.println(cs.encrypt("a!"));
	    System.out.println(cs.encrypt(l));
	    System.out.println(cs.decrypt("U"));
	    System.out.println(cs.decrypt(li));
//	   System.out.println(c.encrypt(l));
//	   System.out.println(c.decrypt(li));
//	   System.out.println(c.encrypt(" GiRa F F e!!§ Z"));
//	   System.out.println(c.decrypt("JLUDIIHC"));
    } 
}
