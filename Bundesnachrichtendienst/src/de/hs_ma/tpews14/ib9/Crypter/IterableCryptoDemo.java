package de.hs_ma.tpews14.ib9.Crypter;


import java.util.Arrays;
import java.util.List;
import de.hs_ma.tpews14.ib9.Crypter.CrypterType;
public class IterableCryptoDemo {
	
 public static void main(String[] args) throws IllegalKeyException {
		

//		Crypter caesar = CrypterFactory.createCrypter("U", CrypterType.CAESAR);
//		
//		Crypter xor = CrypterFactory.createCrypter("TPEISTCOOL", CrypterType.XOR);
//		List<String> liste =  Arrays.asList("DIES", "IST", "EIN", "TEST");
//	
//		IterableCrypter ic=new IterableCrypter(liste, caesar);
//		IterableCrypter iterableCrypter = new IterableCrypter(new IterableCrypter(liste, caesar), xor);
//		for (String cypherText : iterableCrypter) {
//			System.out.println(cypherText);
//		}
//	}
	 Crypter caesar = CrypterFactory.createCrypter("U", CrypterType.CAESAR);

		Crypter xor = CrypterFactory.createCrypter("TPEISTCOOL",
				CrypterType.XOR);
		List<String> liste = Arrays.asList("DIES", "IST", "EIN", "TEST");
		List<String> liste2 = Arrays
				.asList("QOZEG]A[UXDKZIZLAB\\NUQIO^^RXYHADV[EFFJ\\\\[\\U_]YDVZABDZT\\V\\SKB@X");
		// IterableCrypter ic=new IterableCrypter(liste, caesar);

		 IterableCrypter iterableCrypter = new IterableCrypter(new
		 IterableCrypter(liste, caesar), xor);
		 for (String cypherText : iterableCrypter) {
		 System.out.println(cypherText);
		 }
		 IterableDecrypter iterableDecrypter = new IterableDecrypter (new
				 IterableDecrypter(iterableCrypter, xor), caesar);
				 for (String cypherText : iterableDecrypter) {
				 System.out.println(cypherText);
				 }

		Crypter substCrypt = CrypterFactory.createCrypter(
				"MNBVCXYLKJHGFDSAPOIUZTREWQ", CrypterType.SUBSTITUTION);
		Crypter caeserCrypt = CrypterFactory.createCrypter("L",
				CrypterType.CAESAR);
		Crypter umkehrCrypt = CrypterFactory.createCrypter("",
				CrypterType.REVERSE);
		Crypter XORCrypt = CrypterFactory.createCrypter("IAMTHEONEWHOKNOCKS",
				CrypterType.XOR);
		// IterableDecrypter iterableDe = new IterableDecrypter( new
		// IterableDecrypter( new IterableDecrypter( new
		// IterableDecrypter(liste2, substCrypt), caeserCrypt), umkehrCrypt),
		// XORCrypt);
		IterableDecrypter iterableDe = new IterableDecrypter(
				new IterableDecrypter(new IterableDecrypter(
						new IterableDecrypter(liste2, XORCrypt), umkehrCrypt),
						caeserCrypt), substCrypt);
		for (String string : iterableDe) {
			System.out.println(string);
		}
}
