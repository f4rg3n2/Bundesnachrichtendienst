package de.hs_ma.tpews14.ib9.Crypter;


public class CrypterReverse extends CrypterSuper {

	@Override
	public String encrypt(String message) throws CrypterException {
		crypterHelp(message);
		char[] a = message.toCharArray();
		String erg = "";
		for (int i = a.length-1; i >= 0; i--) {
				erg += a[i];
		}
		return erg;
	}

//	@Override
//	public List<String> encrypt(List<String> messages)
//	        throws CrypterException {
//		LinkedList<String> a = new LinkedList<>();
//		for (String message : messages) {
//			a.add(encrypt(message));
//        }
//		return a;
//	}

	@Override
	public String decrypt(String cypherText) throws CrypterException {
		char[] a = cypherText.toCharArray();
		String erg = "";
		for (int i = a.length-1; i >= 0; i--) {
				erg += a[i];
		}
		return erg;
		
	}

//	@Override
//	public List<String> decrypt(List<String> cypherTexte)
//	        throws CrypterException {
//		LinkedList<String> a = new LinkedList<>();
//		for (String message : cypherTexte) {
//			a.add(encrypt(message));
//        }
//		
//		return a;
//	}

}
