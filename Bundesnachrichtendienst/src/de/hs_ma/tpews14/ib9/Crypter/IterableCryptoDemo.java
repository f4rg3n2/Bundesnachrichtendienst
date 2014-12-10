package de.hs_ma.tpews14.ib9.Crypter;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class IterableCryptoDemo {
	
 public static void main(String[] args) throws IllegalKeyException {
		

		Crypter caesar = CrypterFactory.createCrypter("U", CrypterFactory.Verschluesselungen.CAESAR);
		
		Crypter xor = CrypterFactory.createCrypter("TPEISTCOOL", CrypterFactory.Verschluesselungen.XOR);
		List liste = (List) Arrays.asList("DIES", "IST", "EIN", "TEST");
		IterableCrypter iterableCrypter = new IterableCrypter(new IterableCrypter(liste, caesar), xor);
		for (String cypherText : iterableCrypter) {
			System.out.println(cypherText);
		}
	}
}
