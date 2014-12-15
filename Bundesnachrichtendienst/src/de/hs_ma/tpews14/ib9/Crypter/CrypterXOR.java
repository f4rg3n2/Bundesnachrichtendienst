package de.hs_ma.tpews14.ib9.Crypter;


public class CrypterXOR extends CrypterSuper {

	
	private String key;
	private char[] klartextBuchstaben = { 'A', 'B', 'C', 'D', 'E', 'F', 'G',
	        'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
	        'U', 'V', 'W', 'X', 'Y', 'Z' };
	private char[] schluesselBuchstaben = { '@', 'A', 'B', 'C', 'D', 'E', 'F',
	        'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S',
	        'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '[', '/', ']', '^', '_' };

	public CrypterXOR(String key) {
		this.key = key;
	}

	@Override
	public String encrypt(String message) throws CrypterException {
		crypterHelp(message);
		int enderg = 0;
		String verschl = "";
		char a[] = message.toCharArray();
		char b[] = key.toCharArray(); 
		int j=0;
		
		for (int i = 0; i < a.length; i++) {
	
			//for (int j = 0; j < a.length; j++) {
			if(i<b.length){
					enderg = ((int)a[i]-64)^((int)b[i]-64);
					verschl+=Character.toString((char) (enderg+64));
				}else{
					if (j<b.length){
				enderg = ((int)a[i]-64)^((int)b[j]-64);
				verschl+=Character.toString((char) (enderg+64));
				++j;
					}else{
						j=0;
						enderg = ((int)a[i]-64)^((int)b[j]-64);
						verschl+=Character.toString((char) (enderg+64));
						++j;
					}
			}
		}
		return verschl;
	}

//	@Override
//	public List<String> encrypt(List<String> messages)
//	        throws CrypterException {
//		LinkedList<String> a = new LinkedList<>();
//		for (String message : messages) {
//			a.add(encrypt(message));
//		}
//
//		return a;
//
//	}

	@Override
	public String decrypt(String cypherText) throws CrypterException {
		int enderg = 0;
		String verschl = "";
		char a[] = cypherText.toCharArray();
		char b[] = key.toCharArray(); 
		int j=0;
		
		for (int i = 0; i < a.length; i++) {
	
			//for (int j = 0; j < a.length; j++) {
			if(i<b.length){
					enderg = ((int)a[i]-64)^((int)b[i]-64);
					verschl+=Character.toString((char) (enderg+64));
				}else{
					if (j<b.length){
				enderg = ((int)a[i]-64)^((int)b[j]-64);
				verschl+=Character.toString((char) (enderg+64));
				++j;
					}else{
						j=0;
						enderg = ((int)a[i]-64)^((int)b[j]-64);
						verschl+=Character.toString((char) (enderg+64));
						++j;
					}
			}
		}
		return verschl;
	}

//	@Override
//	public List<String> decrypt(List<String> cypherTexte)
//	        throws CrypterException {
//		LinkedList<String> a = new LinkedList<>();
//		for (String message : cypherTexte) {
//			a.add(encrypt(message));
//		}
//
//		return a;
//	}

}
