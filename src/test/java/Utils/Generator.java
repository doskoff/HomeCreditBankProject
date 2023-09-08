package Utils;

import java.security.SecureRandom;

public class Generator {
    public static String generatePassword() {
        String characters = "02468abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String specialCharacters = "-+!@";
        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < 8; i++) {
            char randomChar;
            if (i % 2 == 0) {
                randomChar = "02468".charAt(random.nextInt(5));
            } else if (i % 3 == 0) {
                randomChar = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
            } else {
                randomChar = characters.charAt(random.nextInt(characters.length()));
            }
            password.append(randomChar);
        }

        return password.toString();
    }

    public static String generateRandomEmail() {
        SecureRandom random = new SecureRandom();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        char randomLetter1 = alphabet.charAt(random.nextInt(alphabet.length()));
        char randomLetter2 = alphabet.charAt(random.nextInt(alphabet.length()));
        char randomLetter3 = alphabet.charAt(random.nextInt(alphabet.length()));
        char randomLetter4 = alphabet.charAt(random.nextInt(alphabet.length()));
        char randomLetter5 = alphabet.charAt(random.nextInt(alphabet.length()));
        char randomLetter6 = alphabet.charAt(random.nextInt(alphabet.length()));

        String email = String.format("%c%c%c_%c%c%c32", randomLetter1, randomLetter2, randomLetter3, randomLetter4, randomLetter5, randomLetter6);

        return email;
    }
}

