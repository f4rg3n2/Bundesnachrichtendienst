package de.hs_ma.tpews14.ib9.Crypter;

import java.util.Arrays;
import java.util.List;
import de.hs_ma.tpews14.ib9.Crypter.CrypterType;

public class IterableCryptoDemo {

	public static void main(String[] args) throws IllegalKeyException {


		List<String> liste2 = Arrays
		        .asList("QOZEG]A[UXDKZIZLAB\\NUQIO^^RXYHADV[EFFJ\\\\[\\U_]YDVZABDZT\\V\\SKB@X");

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
}
