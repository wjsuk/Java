package org.Arashio.login;

public class IDPW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String id = args[0];
		String pw = args[1];
		if (id.equals("Arashio")) {
			if (pw.equals("s_12_0526")) {
				System.out.println("Ufufu, Sukiyo");
			} else {
				System.out.println("Kawaisoukashira?"); //While ID is correct, PW is not
			}
		} else {
			System.out.println("Kawaisoukashira?"); //While ID is incorrect
		}

	}

}
