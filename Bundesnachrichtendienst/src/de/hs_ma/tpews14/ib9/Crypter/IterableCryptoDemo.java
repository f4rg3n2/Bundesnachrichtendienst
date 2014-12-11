package de.hs_ma.tpews14.ib9.Crypter;


import java.util.Arrays;
import java.util.List;
import de.hs_ma.tpews14.ib9.Crypter.CrypterType;
public class IterableCryptoDemo {
	
 public static void main(String[] args) throws IllegalKeyException {
		

		Crypter caesar = CrypterFactory.createCrypter("U", CrypterType.CAESAR);
		
		Crypter xor = CrypterFactory.createCrypter("TPEISTCOOL", CrypterType.XOR);
		List<String> liste =  Arrays.asList("DIES", "IST", "EIN", "TEST");
	
//		IterableCrypter ic=new IterableCrypter(liste, caesar);
		IterableCrypter iterableCrypter = new IterableCrypter(new IterableCrypter(liste, caesar), xor);
		for (String cypherText : iterableCrypter) {
			System.out.println(cypherText);
		}
	}
}
