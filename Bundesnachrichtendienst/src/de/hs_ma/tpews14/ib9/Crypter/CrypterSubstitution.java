package de.hs_ma.tpews14.ib9.Crypter;


public class CrypterSubstitution extends CrypterSuper {

	private char[] klartextBuchstaben = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
	private char[] schluesselBuchstaben = {'U','F','L','P','W','D','R','A','S','J','N','C','O','N','Q','Y','B','V','T','E','X','H','Z','K','G','I'};
	
	

	public CrypterSubstitution() {
		
	}

	@Override
	public String encrypt(String message) throws CrypterException {
		crypterHelp(message);
		char[] a = message.toCharArray();
		String erg= "";
		
		for (int i =0; i<a.length;i++) {
			for (int k = 0; k < klartextBuchstaben.length; k++) {
				 if(a[i]==klartextBuchstaben[k]){
			        	erg += schluesselBuchstaben[k];
			        }
            }
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
//		
//		return a;
//	}

	@Override
	public String decrypt(String cypherText) throws CrypterException {
		char[] a = cypherText.toCharArray();
		String erg= "";
		
		for (int i =0; i<a.length;i++) {
			for (int k = 0; k < schluesselBuchstaben.length; k++) {
				 if(a[i]==schluesselBuchstaben[k]){
			        	erg += klartextBuchstaben[k];
			        }
            }
        }
		return erg;
	}

//	@Override
//	public List<String> decrypt(List<String> cypherTexte)
//	        throws CrypterException {
//		LinkedList<String> a = new LinkedList<>();
//		for (String message : cypherTexte) {
//			a.add(decrypt(message));
//        }
//		
//		return a;
//	}

}
