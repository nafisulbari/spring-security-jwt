package com.midasteknologi.practice.util;

import java.security.SecureRandom;

public class RandomStringUtil {

    public static String generateRandomString(int len) {
        final String chars = "abcdefghijklmnopqrstuvwxyz";

        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < len; i++) {
            int randomIndex = random.nextInt(chars.length());
            sb.append(chars.charAt(randomIndex));
        }

        return sb.toString();
    }
}
