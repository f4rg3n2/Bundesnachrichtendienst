package de.hs_ma.tpews14.ib9.Crypter;

public class CrypterCaesar extends CrypterSuper {

	public int key;

	public CrypterCaesar(String key) { 
		this.key = key.charAt(0) - 64;
	}

	@Override
	public String encrypt(String message) throws CrypterException {
		crypterHelp(message);
		StringBuffer b = new StringBuffer(message);
		for (int i = 0; i < b.length(); i++) {
			b.setCharAt(i,
					(b.charAt(i) + key < 'Z') ? ((char) (b.charAt(i) + key))
							: (char) (b.charAt(i) + key + 64 - 90));
		}
		return b.toString();
	}

	// @Override
	// public List<String> encrypt(List<String> messages)
	// throws CrypterException {
	// LinkedList<String> a = new LinkedList<>();
	// for (String message : messages) {
	// a.add(encrypt(message));
	// }
	//
	// return a;
	// }

	@Override
	public String decrypt(String cypherText) throws CrypterException {
		crypterHelp(cypherText);
		StringBuffer b = new StringBuffer(cypherText);
		for (int i = 0; i < b.length(); i++) {
			b.setCharAt(i, (b.charAt(i) - key < 'A') ? ((char) (b.charAt(i)
					- key - 64 + 90)) : ((char) (b.charAt(i) - key)));
		}
		return b.toString();
	}

	// @Override
	// public List<String> decrypt(List<String> cypherTexte)
	// throws CrypterException {
	// LinkedList<String> a = new LinkedList<>();
	// for (String message : cypherTexte) {
	// a.add(decrypt(message));
	// }
	//
	// return a;
	// }

}
