package Evzin_AdminPortal.RPM;

import java.util.Random;

public class RandomEmail {

	public static String GetrandomEmail() {
		
		 String characters = "abcdefghijklmnopqrstuvwxyz";
	        Random random = new Random();
	        StringBuilder email = new StringBuilder();

	        // Generate random string for the email prefix
	        for (int i = 0; i < 8; i++) {
	            email.append(characters.charAt(random.nextInt(characters.length())));
	        }

	        email.append("@example.com"); // Append domain
	        return email.toString();

	}

}
