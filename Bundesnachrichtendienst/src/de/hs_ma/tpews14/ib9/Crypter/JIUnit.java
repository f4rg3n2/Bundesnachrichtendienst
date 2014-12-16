package de.hs_ma.tpews14.ib9.Crypter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.LinkedList;

import org.junit.Test;

import de.hs_ma.tpews14.ib9.Exception.CrypterException;
import de.hs_ma.tpews14.ib9.Exception.IllegalKeyException;

public class JIUnit {

	@Test
	public void test() throws CrypterException {

		Crypter caesar = CrypterFactory.createCrypter("A", CrypterType.CAESAR);
		assertEquals(caesar.encrypt("hallo§$%&/()"), "IBMMP");
		assertEquals(caesar.decrypt("IBMMP"), "HALLO");

		Crypter subst = CrypterFactory.createCrypter(
				"QWERTZUIOPASDFGHJKLYXCVBNM", CrypterType.SUBSTITUTION);
		assertEquals(subst.encrypt("tach"), "YQEI");
		assertEquals(subst.decrypt("YQEI"), "TACH");

		Crypter xor = CrypterFactory.createCrypter("TPERULES", CrypterType.XOR);
		assertEquals(xor.encrypt("ABCDEFGHIJKLMNOPQRSTUVWXYZ"),
				"URFVPJB[]ZN^XBJCEBVF@ZRKMJ");
		assertEquals(xor.decrypt("URFVPJB[]ZN^XBJCEBVF@ZRKMJ"),
				"ABCDEFGHIJKLMNOPQRSTUVWXYZ");

		Crypter reverse = CrypterFactory.createCrypter("", CrypterType.REVERSE);
		assertEquals(reverse.encrypt("Guten Tag"), "GATNETUG");
		assertEquals(reverse.decrypt("GATNETUG"), "GUTENTAG");

		Crypter nullc = CrypterFactory.createCrypter("", CrypterType.NULL);
		assertEquals(nullc.encrypt("hallo"), "HALLO");
		assertEquals(nullc.decrypt("HALLO"), "HALLO");

		LinkedList<String> list = new LinkedList<>();
		list.add("ABC");
		list.add("DEF");
		list.add("GHI");

		LinkedList<String> listTest = new LinkedList<String>();
		listTest.add("BCD");
		listTest.add("EFG");
		listTest.add("HIJ");
		assertEquals(caesar.encrypt(list), listTest);
		assertEquals(caesar.decrypt(listTest), list);

		LinkedList<String> listTest2 = new LinkedList<String>();
		listTest2.add("QWE");
		listTest2.add("RTZ");
		listTest2.add("UIO");
		assertEquals(subst.encrypt(list), listTest2);
		assertEquals(subst.decrypt(listTest2), list);

		LinkedList<String> listTest3 = new LinkedList<String>();
		listTest3.add("URF");
		listTest3.add("PUC");
		listTest3.add("SXL");
		assertEquals(xor.encrypt(list), listTest3);
		assertEquals(xor.decrypt(listTest3), list);

		LinkedList<String> listTest4 = new LinkedList<String>();
		listTest4.add("CBA");
		listTest4.add("FED");
		listTest4.add("IHG");
		assertEquals(reverse.encrypt(list), listTest4);
		assertEquals(reverse.decrypt(listTest4), list);

		assertEquals(nullc.encrypt(list), list);
		assertEquals(nullc.decrypt(list), list);

	}

	@Test
	public void testIllegalKeyException() {

		try {
			Crypter caesar = CrypterFactory.createCrypter("@",
					CrypterType.CAESAR);
			fail();
		} catch (IllegalKeyException e) {
			// TODO Auto-generated catch block
			assertTrue(true);
		}

		try {
			Crypter subst = CrypterFactory.createCrypter(
					"QWERTZUIOPASDßGHJKLYXCVBNM", CrypterType.SUBSTITUTION);
			fail();
		} catch (IllegalKeyException e) {
			assertTrue(true);
		}

		try {
			Crypter xor = CrypterFactory.createCrypter("TPE!ULES",
					CrypterType.XOR);
			fail();
		} catch (IllegalKeyException e) {
			assertTrue(true);
		}
	}

	@Test
	public void CrypterException() throws IllegalKeyException {
		Crypter caesar = CrypterFactory.createCrypter("A", CrypterType.CAESAR);
		Crypter subst = CrypterFactory.createCrypter(
				"QWERTZUIOPASDFGHJKLYXCVBNM", CrypterType.SUBSTITUTION);
		Crypter reverse = CrypterFactory.createCrypter("", CrypterType.REVERSE);
		Crypter nullc = CrypterFactory.createCrypter("", CrypterType.NULL);

		try {
			caesar.decrypt("ABCD@DOF");
			fail();
		} catch (CrypterException ce) {
			assertTrue(true);
		}

		try {
			subst.decrypt("ABCD@?§OF");
			fail();
		} catch (CrypterException ce) {
			assertTrue(true);
		}
		try {
			reverse.decrypt("AB?D@DO");
			fail();
		} catch (CrypterException ce) {
			assertTrue(true);
		}
		try {
			nullc.decrypt("5BCD@DOF");
			fail();
		} catch (CrypterException ce) {
			assertTrue(true);
		}

	}

}
