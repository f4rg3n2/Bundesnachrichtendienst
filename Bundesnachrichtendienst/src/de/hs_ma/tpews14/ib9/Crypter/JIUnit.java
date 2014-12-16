package de.hs_ma.tpews14.ib9.Crypter;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.Test;

import de.hs_ma.tpews14.ib9.Exception.CrypterException;

public class JIUnit {

	@Test
	public void test() throws CrypterException{
		
		Crypter caesar = CrypterFactory.createCrypter("A", CrypterType.CAESAR);
		assertEquals(caesar.encrypt("hallo§$%&/()"), "IBMMP");
		assertEquals(caesar.decrypt("IBMMP"), "HALLO");
		
		Crypter subst = CrypterFactory.createCrypter("QWERTZUIOPASDFGHJKLYXCVBNM", CrypterType.SUBSTITUTION);
		assertEquals(subst.encrypt("tach"), "YQEI");
		assertEquals(subst.decrypt("YQEI"), "TACH");
		
		Crypter xor = CrypterFactory.createCrypter("TPERULES", CrypterType.XOR);
		assertEquals(xor.encrypt("ABCDEFGHIJKLMNOPQRSTUVWXYZ"), "URFVPJB[]ZN^XBJCEBVF@ZRKMJ");
		assertEquals(xor.decrypt("URFVPJB[]ZN^XBJCEBVF@ZRKMJ"), "ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		
		
	}
//	public static void main(String[] args) throws CrypterException {
//		CrypterCaesar c = new CrypterCaesar("C");
//		LinkedList<String> l = new LinkedList<>();
//		l.add("AAAAaaaAAA!!");
//		l.add("BBbbbBBBbBBBB");
//		LinkedList<String> li = new LinkedList<>();
//		li.add("DEDDD");
//		li.add("EEEE");
//		CrypterSubstitution cs = new CrypterSubstitution(
//				"ABCDEFGHIJKLMNOPQRSTUVWXYZ");
//		CrypterReverse cr = new CrypterReverse();
//
//		System.out.println(cs.encrypt("a!"));
//		System.out.println(cs.encrypt(l));
//		System.out.println(cs.decrypt("U"));
//		System.out.println(cs.decrypt(li));
//		System.out.println(1 ^ 7);
//		CrypterXOR xor = new CrypterXOR("TA");
//		System.out.println(xor.encrypt("AAAAAAAAAAAAAAAAAAAAAAAAaaaa"));
//		System.out.println(xor.decrypt("U@U@U@U@U@U@U@U@U@U@U@U@U@U@"));
//		System.out.println(xor.encrypt(li));
//		System.out.println(c.key);
//		System.out.println(c.encrypt(l));
//		System.out.println(c.decrypt(li));
//		System.out.println(c.encrypt("Gi RaF  FeZ"));
//		System.out.println(c.decrypt("JLUDIIHC"));
//		System.out.println(cr.encrypt("ABCDEFGHIJK"));
//		System.out.println(cr.encrypt(li));
//		System.out.println(cr.decrypt("KJIHGFEDCBA"));
//		System.out.println(cr.decrypt(li));
//	}
}
