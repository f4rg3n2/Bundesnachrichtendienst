package de.hs_ma.tpews14.ib9.Crypter;

public class CrypterCaesar extends CrypterSuper {

	public int key;

	/**
	 * Initialisiert einen Schluessel.
	 * 
	 * @param key
	 */
	public CrypterCaesar(String key) {
		this.key = key.charAt(0) - 64;
	}

	@Override
	public String encrypt(String message) throws CrypterException {
		char[] a = crypterHelp(message).toCharArray();
		String erg = "";
		for (int i = 0; i < a.length; i++) {
			if (a[i] + key > 90) {
				erg += Character.toString((char) (a[i] + key - 90 + 64));
			} else {
				erg += Character.toString((char) (a[i] + key));
			}
		}
		return erg;
	}

	@Override
	public String decrypt(String cypherText) throws CrypterException {
		if (cypherText.matches("[A-Z]*")) {
			char[] a = cypherText.toCharArray();
			String erg = "";
			for (int i = 0; i < a.length; i++) {
				if (a[i] - key < 65) {
					erg += Character.toString((char) (a[i] - key + 90 - 64));
				} else {
					erg += Character.toString((char) (a[i] - key));
				}
			}
			return erg;
		} else {
			throw new CrypterException("Caesar hat einen Fehler beim Entschluesseln.");
		}

	}
}
