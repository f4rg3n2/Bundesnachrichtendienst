package de.hs_ma.tpews14.ib9.Crypter;

import java.util.LinkedList;

public class JIUnit {

	public static void main(String[] args) throws CrypterException {
	    CrypterCaesar c = new CrypterCaesar("C");
	    LinkedList<String> l = new LinkedList<>(); 
	    l.add("AAAAaaaAAA!!");
	    l.add("BBbbbBBBbBBBB");
	    LinkedList<String> li = new LinkedList<>(); 
	    li.add("DEDDD");
	    li.add("EEEE");
	    CrypterSubstitution cs = new CrypterSubstitution();
	    CrypterReverse cr = new CrypterReverse();
	    CrypterNull cn = new CrypterNull();
	    System.out.println(cs.encrypt("a!"));
//	    System.out.println(cs.encrypt(l));
	    System.out.println(cs.decrypt("U"));
//	    System.out.println(cs.decrypt(li));
//	    System.out.println(1 ^ 7);
//	    CrypterXOR xor = new CrypterXOR("TA");
//	    System.out.println(xor.encrypt("AAAAAAAAAAAAAAAAAAAAAAAAaaaa"));
//	    System.out.println(xor.decrypt("U@U@U@U@U@U@U@U@U@U@U@U@U@U@"));
//	    System.out.println(xor.encrypt(li));
//	    System.out.println(c.key);
//	   System.out.println(c.encrypt(l));
//	   System.out.println(c.decrypt(li));
	   System.out.println(c.encrypt(" GiRa F F e!!� Z"));
	   System.out.println(c.decrypt("JLUDIIHC"));
	   System.out.println(cn.encrypt("Hallo"));
	   System.out.println(cn.decrypt("Hallo"));
	   System.out.println(cr.encrypt("Tach"));
	   System.out.println(cr.decrypt("hcaT"));
//	    System.out.println(cr.encrypt("ABCDEFGHIJK"));
//	    System.out.println(cr.encrypt(li));
//	    System.out.println(cr.decrypt("KJIHGFEDCBA"));
//	    System.out.println(cr.decrypt(li));    
	    } 
}
