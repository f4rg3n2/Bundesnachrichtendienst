package de.hs_ma.tpews14.ib9.Crypter;


public class CrypterXOR extends CrypterSuper {

	
	private String key;

	/**
	 * Initialisiert den Schluessel.
	 * 
	 * @param key
	 */
	public CrypterXOR(String key) {
		this.key = key;
	}

	@Override
	public String encrypt(String message) throws CrypterException {
		
		int enderg = 0;
		String verschl = "";
		char a[] = crypterHelp(message).toCharArray();
		char b[] = key.toCharArray(); 
		int j=0;
		
		for (int i = 0; i < a.length; i++) {
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


	@Override
	public String decrypt(String cypherText) throws CrypterException {
		int enderg = 0;
		String verschl = "";
		char a[] = cypherText.toCharArray();
		char b[] = key.toCharArray(); 
		int j=0;
		
		for (int i = 0; i < a.length; i++) {
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
}
